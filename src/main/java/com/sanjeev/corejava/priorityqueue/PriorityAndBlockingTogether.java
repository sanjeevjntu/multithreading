package com.sanjeev.corejava.priorityqueue;

import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Poll large elements first then smaller ones.
 */
public class PriorityAndBlockingTogether {

    public static void main(String[] args) throws InterruptedException {

        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>(11,
                (num1, num2) -> num2 - num1);

        System.out.println("Polling ....");
        new Thread(() -> {
            while (true) {
                try {
                    Integer take = queue.take();
                    System.out.println("Polled: " + take);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        Thread.sleep(TimeUnit.SECONDS.toMillis(5));

        System.out.println("Batch 1: Adding to priority blocking queue..");
        queue.addAll(List.of(121, 2, 34, 5, 6, 1, 2, 6, 7));
        Thread.sleep(TimeUnit.SECONDS.toMillis(5));
        System.out.println("Batch 2: Adding to the  priority blocking queue..");
        queue.addAll(List.of(21, 34,2,4,5,6,7,8));
    }
}
