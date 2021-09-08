package P08_MultiThreading.L67_1_NameAndPriopity;

public class NameAndPriopity {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("myThread-1");
        myThread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println(myThread5.getName());
        System.out.println(myThread5.getPriority());

        MyThread5 myThread6 = new MyThread5();
        myThread6.setName("myThread-2");
        System.out.println(myThread6.getName());
        System.out.println(myThread6.getPriority());
        myThread6.start();
    }
}

class MyThread5 extends Thread {
    @Override
    public void run() {
        System.out.println("Privet");
    }
}
