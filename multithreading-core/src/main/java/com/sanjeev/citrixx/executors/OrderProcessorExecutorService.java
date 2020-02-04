package com.sanjeev.citrixx.executors;

import java.util.concurrent.*;

public class OrderProcessorExecutorService {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        for (int i = 0; i < 10; i++) {
            processOrderUsingFuture(); // blocking
        }
    }

    private static void processOrderUsingFuture() throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Future future = executorService.submit(getOrderTask());
        future.get(); //blocking

        Future future1 = executorService.submit(enrichOrderTask(new Order()));
        future1.get(); //blocking

        Future future2= executorService.submit(payOrder(new Order()));
        future2.get(); //blocking

        Future future3 = executorService.submit(dispatchOrder(new Order()));
        future3.get(); //blocking

        Future future4 = executorService.submit(sendEmail(new Order()));
        future4.get(); //blocking
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

    private static Callable enrichOrderTask(Order order) {
        return null;
    }

    private static Callable getOrderTask() {
        return null;
    }

}
