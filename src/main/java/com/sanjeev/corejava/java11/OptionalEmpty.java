package com.sanjeev.corejava.java11;

import java.util.Optional;

public class OptionalEmpty {

    public static void main(String[] args) {
        System.out.println(Optional.empty().isEmpty());
        System.out.println(Optional.of("Hello").isEmpty());
    }
}
