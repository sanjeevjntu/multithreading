package com.sanjeev.corejava.priorityqueue;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ProducerAndConsumer {
    public static void main(String[] args) throws InterruptedException {
        PriorityBlockingQueue<Product> queue = new PriorityBlockingQueue<>(11, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        });

        new Thread(() -> {
            try {
                Product take = queue.take();
                System.out.println("Polled Products: " + take);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                Product take = queue.take();
                System.out.println("Polled Products: " + take);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        Thread.sleep(TimeUnit.SECONDS.toMillis(2));

        Product p1 = new Product(1, "book", "java", 200);
        Product p2 = new Product(2, "book", "c++", 300);
        Product p3 = new Product(3, "book", "python", 700);

        new Thread(() -> {
            queue.add(p1);
            try {
                Thread.sleep(1000);
                System.out.println("Adding a product: " + p1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            queue.add(p2);
            try {
                Thread.sleep(1000);
                System.out.println("Adding a product: " + p1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            queue.add(p3);
            try {
                Thread.sleep(1000);
                System.out.println("Adding a product: " + p1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
