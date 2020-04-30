package com.sanjeev.corejava.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTest {

    public static void main(String[] args) {
        var executorService = Executors.newFixedThreadPool(3);
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Test");
            }
        };
        executorService.execute(task);
        Future<?> future = executorService.submit(task);
        // newSingleThreadPool
        var singleThreadExecutor = Executors.newSingleThreadExecutor();
        singleThreadExecutor.execute(task);
    }
}
