package com.sanjeev.corejava.interview;

import java.util.HashSet;

public class SetExample {

    public static void main(String[] args) {

        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add(2);
        System.out.println(hashSet.add("Hello"));
        System.out.println(hashSet.add("Hello"));
        hashSet.add("Set is: "+ hashSet);
        hashSet.add(2);

        System.out.println(hashSet);
    }
}
