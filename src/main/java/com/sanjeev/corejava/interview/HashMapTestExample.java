package com.sanjeev.corejava.interview;

import java.util.HashMap;

public class HashMapTestExample {

    public static void main(String[] args) {
        HashMap<Fulfillment, String> map = new HashMap<>();

        Fulfillment f1 = new Fulfillment();
        f1.setId(1);
        f1.setName("sanjeev");
        f1.setType("retail");

        map.put(f1, "UK");
        //Let's say we are  saving fulfillment into database

        Fulfillment f2 = new Fulfillment();
        f2.setId(1);
        f2.setName("sanjeev");
        f2.setType("retail");

        /*
           Step 1:
           When we are trying to get the object from hashMap, it gets the hashcode for null object is 0.
           Step 2:
           Otherwise,  it calculates the hashCode of the object using the properties and tries to
           find the hashcode in the bucket (key, value).

           Step2:
           Once it finds the hashcode bucket, then it compares the equals method, if equals method returns true
           then you will get the actual object.
         */

        System.out.println(map.get(null));
        System.out.println(map.get(f2)); // Always gets hashCode() first then equals method.
        System.out.println(f1.hashCode());
        System.out.println(f2.hashCode());
        System.out.println(f1.equals(f2));
    }
}
