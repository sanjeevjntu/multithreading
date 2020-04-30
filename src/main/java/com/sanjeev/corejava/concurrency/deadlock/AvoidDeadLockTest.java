package com.sanjeev.corejava.concurrency.deadlock;

/**
 * T1 and T2 should take the lock1, lock2 in the same order.
 */
public class AvoidDeadLockTest {

    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        // T1 takes the lock1 and lock2
        var thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println(" Inside t1 and lock1");
                synchronized (lock2) {
                    System.out.println(" Inside t1 and lock2");
                }
            }
        });

        // Keep the same order for the locks Thread2 takes lock1 and lock2
        var thread2 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println(" Inside t2 and lock2");
                synchronized (lock2) {
                    System.out.println(" Inside t2 and lock1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
