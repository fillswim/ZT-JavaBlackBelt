package P08_MultiThreading.L84_1_Exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();

        // Список действий для первого друга
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.STONE);
        friend1Action.add(Action.PAPER);
        friend1Action.add(Action.SCISSORS);

        // Список действий для второго друга
        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.PAPER);
        friend2Action.add(Action.STONE);
        friend2Action.add(Action.STONE);

        new Thread(new Friend("Zaur", friend1Action, exchanger)).start();
        new Thread(new Friend("Oleg", friend2Action, exchanger)).start();

    }
}

enum Action {
    STONE, SCISSORS, PAPER;
}

class Friend implements Runnable {

    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public Friend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
    }

    private void whoWins(Action myAction, Action friendsAction) {
        if ((myAction == Action.STONE && friendsAction == Action.SCISSORS)
                || (myAction == Action.SCISSORS && friendsAction == Action.PAPER)
                || (myAction == Action.PAPER && friendsAction == Action.STONE)) {

            System.out.println(name + " wins!");

        }
    }

    @Override
    public void run() {
        // Ответ от друга
        Action reply;

        for (Action action : myActions) {
            try {
                // Получаю действия друга и передаю свое дейтвие
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
