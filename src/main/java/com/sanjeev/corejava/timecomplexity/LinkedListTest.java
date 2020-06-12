package com.sanjeev.corejava.timecomplexity;

import java.util.LinkedList;

/**
 * add() - O(1)
 * remove - O(n)
 *
 */
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Sanjeev");
        names.add("Chiru");
        names.add("Matt");
        names.add("John");

        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        System.out.println(names.get(0));

        System.out.println(names);

        names.remove("Sanjeev");
        System.out.println(names);
        names.remove(2);
        System.out.println(names);
    }
}
