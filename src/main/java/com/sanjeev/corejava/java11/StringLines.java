package com.sanjeev.corejava.java11;

import java.util.Comparator;

public class StringLines {

    public static void main(String[] args) {
        String s1 = "Hello\nworld\nIn the days";
        s1.lines().sorted(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        }).forEach(System.out::println);

    }
}
