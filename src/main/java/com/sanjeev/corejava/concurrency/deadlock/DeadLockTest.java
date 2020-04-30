package com.sanjeev.corejava.concurrency.deadlock;

public class DeadLockTest {

    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        var thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println(" Inside t1 and lock1");
                synchronized (lock2) {
                    System.out.println(" Inside t1 and lock2");
                }
            }
        });

        var thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println(" Inside t2 and lock2");
                synchronized (lock1) {
                    System.out.println(" Inside t2 and lock1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
