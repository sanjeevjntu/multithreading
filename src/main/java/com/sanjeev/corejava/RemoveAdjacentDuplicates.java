package com.sanjeev.corejava;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        System.out.println(removeAdjacentDuplicates("abbaca"));
    }

    private static String removeAdjacentDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length() ; i++) {
            if(!stack.isEmpty() && stack.peek() == s.charAt(i))
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (char ch: stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
