package com.sanjeev.corejava.concurrency.synchronization;

public class SynchronizedCounterTest {

    public static void main(String[] args) throws InterruptedException {
        var syncCounter = new SyncCounter();
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                syncCounter.increment();
            }
        };
        var t1 = new Thread(task);
        var t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join(100);
        t2.join(100);

        System.out.println(syncCounter.getCount());
    }
}

class SyncCounter {

    int count;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
