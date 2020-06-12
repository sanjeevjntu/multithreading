package com.sanjeev.corejava.java11;

import java.util.Optional;

public class OptionalEmpty {

    public static void main(String[] args) {
        System.out.println(Optional.empty().isEmpty());
        System.out.println(Optional.of("Hello").isEmpty());

        Optional<String> optional = Optional.empty();
        optional.ifPresentOrElse(s -> {
            s.toUpperCase();
        }, new Runnable() {
            @Override
            public void run() {
                System.out.println("SANJEEV iN RUNNABLE");
            }
        });
    }
}
