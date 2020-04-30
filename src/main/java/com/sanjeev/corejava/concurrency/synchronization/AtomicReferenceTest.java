package com.sanjeev.corejava.concurrency.synchronization;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceTest {

    public static void main(String[] args) {
        String oldName = "old Name";
        String newName = "new Name";
        var atomicReference = new AtomicReference<String>(oldName);
        if (atomicReference.compareAndSet(oldName, newName)) { // expectedValue, newValue
            System.out.println("Both are equal");
        } else {
            System.out.println("Nothing changed");
        }
    }
}
