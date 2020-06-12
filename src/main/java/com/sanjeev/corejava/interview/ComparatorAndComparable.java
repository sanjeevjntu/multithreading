package com.sanjeev.corejava.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorAndComparable {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sanjeev", "Sachin", "Sam", "Chiru");

        Collections.sort(names);// Natural ordering it uses Comparable ->compareTo() method

        System.out.println(names);

        names.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println(names);
    }
}
