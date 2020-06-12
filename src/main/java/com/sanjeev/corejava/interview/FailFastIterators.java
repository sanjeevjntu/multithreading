package com.sanjeev.corejava.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList and HashMap are Failfast - it throws ConcurrentModificationException
 */
public class FailFastIterators {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Sanjeev");
        names.add("Sachin");
        names.add("Sehwag");

        System.out.println(names.get(0));
        for (String name : names) {
            names.add("Kiran");
            names.remove("Sehwag");
        }

    }
}
