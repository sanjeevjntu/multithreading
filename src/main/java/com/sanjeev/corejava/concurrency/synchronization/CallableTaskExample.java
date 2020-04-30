package com.sanjeev.corejava.concurrency.synchronization;

import java.util.Random;
import java.util.concurrent.*;

public class CallableTaskExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // This will run in the executor service's thread (one of 3)
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return new Random().nextInt();
            }
        });

        Integer integer = null;
        try {
            integer = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println(integer);

        Callable<String> task2 = () -> {
            return "I am Sanjeev";
        };
        Future<String> future1 = executorService.submit(task2);
        try {
            String s = null; // This will block the thread if we dont get return object from callable
            try {
                // Get method will be blocked only 1 second.
                s = future1.get(1, TimeUnit.SECONDS);
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
            System.out.println(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
