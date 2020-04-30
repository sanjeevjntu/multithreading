package com.sanjeev.corejava.concurrency.deadlock;

// wrong example - to be modified
public class AvoidDeadLockExample {

    public static void main(String[] args) {
        var p1 = new Person("Sanjeev", "33");
        var p2 = new Person("Shyam", "30");

        var t1 = new Thread(() -> {
            synchronized (p1) {
                System.out.println(p1.getName());
                synchronized (p2) {
                    System.out.println(p1.getAge());
                }
            }
        });

        var t2 = new Thread(() -> {
            synchronized (p2) {
                System.out.println(p2.getName());
                synchronized (p2) {
                    System.out.println(p2.getAge());
                }
            }
        });

        t1.start();
        t2.start();

        System.out.println("COMPLETED");
    }
}


class Person {
    private final String name;
    private final String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
