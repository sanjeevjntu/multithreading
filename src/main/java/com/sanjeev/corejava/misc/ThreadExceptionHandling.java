package com.sanjeev.corejava.misc;

public class ThreadExceptionHandling {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException("Internal server error in Task");
            }
        });

        thread.setUncaughtExceptionHandler((t, e) -> {
            System.out.println(e.getMessage());
        });
        thread.start();
    }
}
