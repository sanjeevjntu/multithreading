package com.sanjeev.corejava.priorityqueue;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

public class PriorityQueueToBLockTest {

    public static void main(String[] args) throws InterruptedException {
        PriorityBlockingQueue<Product> queue = new PriorityBlockingQueue<Product>(11,
                (p1, p2) -> (int) (p1.getPrice() - p2.getPrice()));

        new Thread(() -> {
            try {
                Product polledProduct = queue.take();
                System.out.println("Polled : " + polledProduct);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        Thread.sleep(TimeUnit.SECONDS.toMillis(10));

        System.out.println("Adding a product to queue...");
        queue.add(new Product(1, "book", "Java", 30));
        queue.add(new Product(2, "book", "C++", 40));
        queue.add(new Product(3, "book", "SQL", 50));
    }
}
