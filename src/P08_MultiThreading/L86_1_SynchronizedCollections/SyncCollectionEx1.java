package P08_MultiThreading.L86_1_SynchronizedCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncCollectionEx1 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> source = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            source.add(i);
        }

        // Несинхронизированный список
//        ArrayList<Integer> target = new ArrayList<>();

        // Синхронизируем ArrayList
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());

        Runnable runnable = () -> {
            syncList.addAll(source);
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(syncList);

    }
}
