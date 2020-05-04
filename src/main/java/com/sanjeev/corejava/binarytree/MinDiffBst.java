package com.sanjeev.corejava.binarytree;


/* Usage:
   javac MinDiffBst.java
   java MinDiffBst 1 4 2 7
   1
 */
public class MinDiffBst {
    public static void main(String[] args) {
        int min = 0;
        if (args != null && args.length > 0) {
            int[] nums = parseArgs(args);
            Solution soln = new Solution();
            Node node = soln.createBinarySearchTree(nums);
            min = soln.getMinimumDifference(node);

            System.out.println("Root node: " + node.value);
        }
        System.out.println(min);
    }

    public static int[] parseArgs(String[] args) {
        int[] v = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            v[i] = Integer.parseInt(args[i]);
        }
        return v;
    }

    /* Challenge: the two functions inside of Solution are need to solved this program.
     * You should have 20-40 minutes to work on this in your interview and can solve
     * either or both of the problems by implmenting the functions described below.
     */
    public static class Solution {
        /* Given a series of numbers, create a BST from them and return the root node.
         Ex:
         Input: (1 4 2 7)
         Output:
             1
              \
               4
              / \
             2   7
         */
        public Node createBinarySearchTree(int[] nums) {

            BinarySTree bst = new BinarySTree();
            for (int num : nums) {
                bst.add(num);
            }
            return bst.root;
        }


        /* Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.
         Ex:
           Input:
               1
                \
                 4
                / \
               2   7
               Output: 1
         */
        public int getMinimumDifference(Node root) {
            return 0;
        }
    }

    public static class BinarySTree {

        Node root;

        public void add(int value) {
            root = addRecursive(root, value);
        }

        private Node addRecursive(Node current, int value) {
            if(current == null) {
                return new Node(value);
            } else if(value < current.value) {
                current.left = addRecursive(current.left, value);
            } else if(value > current.value ) {
                current.right = addRecursive(current.right, value);
            } else {
                return current;
            }
           return current;
        }

    }

    // Definition for a binary tree node.
    public static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node left) {
            this.left = left;
        }
    }
}


