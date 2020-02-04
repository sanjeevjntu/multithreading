package com.sanjeev.citrixx.executors;


import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Future<Integer> future = executorService.submit( new Task());
        try {
            Integer result = future.get(); // blocking call if the task is not completed
            System.out.println("result: "+ result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    // task class
    private static class Task implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            return 2;
        }
    }

    // Fetch Order
    // Enrich Order
    // Payment Order
    // Dispatch Order
    // Email
}
