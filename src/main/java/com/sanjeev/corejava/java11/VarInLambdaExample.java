package com.sanjeev.corejava.java11;

import java.util.stream.IntStream;

public class VarInLambdaExample {
    public static void main(String[] args) {
        IntStream.of(1, 2, 3, 5, 6, 7)
                .filter((int i) -> i % 2 == 0)
                .forEach(System.out::println);

        IntStream.of(10, 20, 30)
                .filter(value -> value % 2 == 0)
                .forEach(System.out::println);
    }
}