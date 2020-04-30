package com.sanjeev.corejava.java11;

import java.util.function.Function;

public class TypeReferenceInLambda {

    public static void main(String[] args) {
        // f(x,y) = x +y;
        Function<String, String> function = (String s) -> { //x -> input
            return "Hello " + s; // y return value
        };

        String message = function.apply("Sanjeev");
        System.out.println(message);
    }
}
