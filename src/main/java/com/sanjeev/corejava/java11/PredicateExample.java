package com.sanjeev.corejava.java11;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> predicate = number -> {
            return number % 2 == 0;
        };

        boolean test = predicate.test(4);
        System.out.println(test);

        List<Integer> list = List.of(1, 2, 3, 4);
        // Type - 1
        list.stream().filter(number -> {
            return number % 2 == 0;
        }).forEach(integer -> System.out.println(integer));

        // Type- 2
        list.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer % 2 != 0;
                    }
                }).forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        // Type - 3
        Predicate<Integer> predicate1 = integer -> {
            return integer % 2 == 0;
        };

        Consumer<Integer> consumer = integer -> {
            System.out.println(integer);
        };
        list.stream()
                .filter(predicate1)
                .forEach(consumer);
    }
}
