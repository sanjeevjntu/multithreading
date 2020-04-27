package com.sanjeev.corejava.misc;

import java.util.HashMap;
import java.util.Stack;

public class RemoveAdjacentDuplicatesWithCase {

    public static void main(String[] args) {
        System.out.println("Length: " + process("Nhy1PUjsWWerJPL1qU2WM1mMSsm6DYQQzpSy4ekgzNbAipS7xq"));
    }

    private static int process(String input) {
        HashMap<Character, Character> map = new HashMap<>();
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            map.put(ch, Character.toUpperCase(ch));
            map.put(Character.toUpperCase(ch), ch);
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == map.get(input.charAt(i))) {
                stack.pop();
            } else stack.push(input.charAt(i));
        }

        return stack.size();
    }
}
