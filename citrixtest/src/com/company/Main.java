package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // 1 -> 1, 2 ->  1,2, 2,1 ->  1,2, 2,1, 2,1,1,2
        // a, b
        generatSequence(2);

    }

    private static int[] generatSequence(int input) {

         List<Integer> list = Arrays.asList(1);

        for (int i = 1; i <= input ; i++) {
            for (int j = 1; j <= list.size(); j++) {

                if (list.get(0) == 1) {
                    list.add(2);
                } else if (list.get(0) == 2) {
                    list.add(1);
                }

            }

        }
        return null;

    }
}
