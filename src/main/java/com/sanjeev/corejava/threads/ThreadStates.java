package com.sanjeev.corejava.threads;

public class ThreadStates {

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        }); // TERMINATED

        System.out.println(thread.getState()); // NEW
        thread.start();
        System.out.println(thread.getState()); // RUNNABLE

       // lock.wait(); // WAITING state or TIMED_WAIT

       // System.out.println(thread.getState());

//        synchronized (lock){ // BLOCKED state as other thread is processing the block
//
//        }
    }
}
