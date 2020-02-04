package com.sanjeev.citrixx.threadcreations;

public class ThreadTest2 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("We are in thread : " + Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getPriority());
            }
        });
        thread.setName("New Worker Thread");
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread name: start " + Thread.currentThread().getName());
        thread.start();
        System.out.println("Thread name: end " + Thread.currentThread().getName());

    }
}
