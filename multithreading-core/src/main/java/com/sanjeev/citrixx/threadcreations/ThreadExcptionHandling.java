package com.sanjeev.citrixx.threadcreations;

public class ThreadExcptionHandling {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException("Internal Server error while running the task.");
            }
        });

        thread.setUncaughtExceptionHandler((t, e) -> {
            System.out.println(t.getName() +" : " + t.getContextClassLoader().getName() +":" + e.getMessage());
        });
        thread.start();
    }
}
