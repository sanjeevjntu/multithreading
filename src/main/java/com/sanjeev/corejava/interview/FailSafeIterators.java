package com.sanjeev.corejava.interview;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * These are fail-safe iterators.
 * CopyOnWriteArrayList, CopyOnWriteArraySet, ConcurrentHashMap, PriorityBlockingQueue
 */
public class FailSafeIterators {

    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        for (int num: list) {
            list.add(4);
        }
    }
}
