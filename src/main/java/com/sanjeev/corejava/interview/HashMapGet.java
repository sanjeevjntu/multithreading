package com.sanjeev.corejava.interview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapGet {

    public HashMapGet() {
        super();
    }

    /**
     * How hashMap works?? HashFunction (hasCode()), HashValue, Bucket
     * <p>
     * Bucket -> A BUkcet is used to store Key and Value pairs.
     * Bucket is a LinkedList - > (1, "Sanjeev") -> (1, "Sanjeev")
     *
     * @param args
     */
    public static void main(String[] args) {
        Object object = new Object();
        int hashCode = object.hashCode();
        // HashValue is the value returned by HashFunction
        System.out.println(hashCode);

        Map<Object, Object> map = new HashMap<>();//SHIFT + COMMAND +ENTER

        List<String> list = List.of("Sanjeev", "Chiru"); // CONTROL+T
        for (String string : list) {  // COM + SHIFT + ACTION (A)

            if (string != null) {
                System.out.println(string);
            }
        }


    }
}
