package com.sanjeev.corejava.java11;

public class StringLines {

    public static void main(String[] args) {
        String s1 = "Hello \n world \n In the days";
        s1.lines().forEach(s -> {
            System.out.println(s);
        });
    }
}
