package P08_MultiThreading.L86_1_SynchronizedCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SyncCollectionEx2 {
    public static void main(String[] args) throws InterruptedException {

        // Несинхронизированный список
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        // Синхронизированный список
        List<Integer> syncList = Collections.synchronizedList(arrayList);


        Runnable runnable1 = () -> {
            // Синхронизация по списку
            // Пока не закончится перебор и вывод на экран, список будет заблокирован
            synchronized (syncList) {
                Iterator<Integer> iterator = syncList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        };

        Runnable runnable2 = () -> {
            syncList.remove(10);
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(syncList);

    }
}
