package com.sanjeev.corejava.concurrency.synchronization;

import java.util.concurrent.atomic.AtomicInteger;

public class InventoryCounterTest {
    public static void main(String[] args) throws InterruptedException {
        var counter = new InventoryCounter();

        var t1 = new Thread(() -> {
            for (int i = 0; i < 1010; i++) {
                counter.increment();
            }
        });
        var t2 = new Thread(() -> {
            for (int i = 0; i < 1010; i++) {
                counter.increment();
            }
        });

        var t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.decrement();
            }
        });
        var t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.decrement();
            }
        });

        t1.start();
        t2.start();

        t3.start();
        t4.start();

        t1.join(100);
        t2.join(100);
        t3.join(100);
        t4.join(100);

        AtomicInteger items = counter.getItems();
        System.out.println("Total Inventory count : " + items.get());
    }
}

class InventoryCounter {
    AtomicInteger items = new AtomicInteger(0);

    public void increment() {
        items.getAndIncrement();
    }

    public void decrement() {
        items.getAndDecrement();
    }

    public AtomicInteger getItems() {
        return items;
    }
}
