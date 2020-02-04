package com.sanjeev.citrixx.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderProcessorCompletableFuture {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            ExecutorService cpuBound = Executors.newFixedThreadPool(20);
            ExecutorService ioBound = Executors.newCachedThreadPool();

            Order order = new Order();
            // 1st operation always Async, then all sync, It means all other operations are done by suing the same thread.
            CompletableFuture
                    .supplyAsync(() -> getOrder())
                    //.thenApply((order) -> dispatchOrder(order))
                    .thenApply((order2) -> payOrder(order))
                    .thenApply((order3) -> enrichOrder(order))
                    .thenApply((order3) -> sendEmail(order));
        }
    }

    private static Callable<Integer> sendEmail(Order order) {
        return null;
    }

    private static Callable dispatchOrder(Order order) {
        return  null;
    }

    private static Callable payOrder(Order order) {
        return null;
    }

    private static Callable enrichOrder(Order order) {
        return null;
    }

    private static Callable getOrder() {
        return null;
    }
}
