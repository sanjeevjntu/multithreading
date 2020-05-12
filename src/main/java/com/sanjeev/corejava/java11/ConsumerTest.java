package com.sanjeev.corejava.java11;

import java.util.function.Consumer;
import java.util.function.Function;

//PCSF Predicate (Test), Consumer(accept), Supplier(get), Function (apply)
public class ConsumerTest {

    public static void main(String[] args) {
        Function<String, String> function = s -> {
            return s.toUpperCase();
        };
        function.apply("sanjeev");

        Consumer<String>  consumer = s -> {
            System.out.println(s);
        };

        consumer.accept("sanjeev");
    }
}
