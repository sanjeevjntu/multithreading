package com.sanjeev.corejava.priorityqueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueIntegrs {

    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>(5, new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                return n2-n1;
            }
        });
        queue.add(1);
        queue.add(5);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        ArrayList<Object> polledElements = new ArrayList<>();

        queue.drainTo(polledElements);

        System.out.println(queue);
        System.out.println(polledElements);
    }
}
