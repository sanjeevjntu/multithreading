package com.sanjeev.corejava.concurrency.synchronization;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerCounterTest {

    public static void main(String[] args) {
        Counter counter = new Counter();

        var t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        var t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join(100, 100);
            t2.join(100, 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.count);
    }

    // This seems to be not working as expected
   /* public static void main(String[] args) {
        Counter counter = new Counter();

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        });

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        });

        System.out.println(counter.count);
    }*/
}

class Counter {
    AtomicInteger count = new AtomicInteger(1);

    public void increment() {
        count.getAndIncrement();
    }
}
