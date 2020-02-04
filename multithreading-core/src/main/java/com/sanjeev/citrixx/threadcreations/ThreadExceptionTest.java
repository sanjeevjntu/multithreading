package com.sanjeev.citrixx.threadcreations;

public class ThreadExceptionTest {

    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.setName("Sanjeev-Thread");
        thread.setContextClassLoader(null);
        thread.setPriority(Thread.MAX_PRIORITY);


        try {
            thread.start();
        } catch(Exception e) {
            System.out.println(e.getMessage()); // It does not come here
        }

    }

    private static class MyThread implements Runnable {
        @Override
        public void run() {
            throw new RuntimeException("Sanjeev : Intentional error");
        }
    }
}
