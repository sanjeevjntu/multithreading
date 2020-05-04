package com.sanjeev.corejava.binarytree;


public class BinarySearchTreeTest {

    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

//        System.out.println(bt.root.value);
//        System.out.println(bt.contains(5));
//
//        bt.delete(1);
//        System.out.println(bt.contains(5));
//
        System.out.println("InOrder DFS: ");
        bt.traverseInOrderDFS(bt.root);
        System.out.println("PreOrder DFS: ");
        bt.traversePreOrderDFS(bt.root);
        System.out.println("PostOrder DFS: ");
        bt.traversePostOrderDFS(bt.root);
    }
}

class BinarySearchTree {
    // Lets add the starting node of the tree which is root;
    Node root;

    public void add(int newValue) {
        root = addRecursive(root, newValue);
    }

    public boolean contains(int newValue) {
        return containsRecursive(root, newValue);
    }


    public void delete(int newValue) {
        root = deleteRecursive(root, newValue);
    }

    // if root is null, you can't delete anything
    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        } else if (value == current.value) {
            // you will get 3 cases here
            // Case 1: Node with no children only root node.
            if (current.left == null && current.right == null) {
                return null;
            }
            // Case 2: Node with exactly one children
            else if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.right;
            } else if (current.right != null && current.left != null) {
                int smallestValue = findSmallestValue(current.right);
                current.value = smallestValue;
                current.right = deleteRecursive(current.right, smallestValue);
                return current;
            }
            // Case 3: Node with 2 children
        } else if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        } else {
            current.right = deleteRecursive(current.right, value);
            return current;
        }
        throw new IllegalArgumentException("Element not found");
    }

    public void traverseInOrderDFS(Node root) {
        if (root != null) {
            traverseInOrderDFS(root.left);
            System.out.println(" " + root.value);
            traverseInOrderDFS(root.right);
        }
    }

    public void traversePreOrderDFS(Node root) {
        if (root != null) {
            System.out.println(" " + root.value);
            traversePreOrderDFS(root.left);
            traversePreOrderDFS(root.right);
        }
    }

    public void traversePostOrderDFS(Node root) {
        if (root != null) {
            traversePostOrderDFS(root.left);
            traversePostOrderDFS(root.right);
            System.out.println(" " + root.value);
        }
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    // Case 1: root == null return false
    // Case 2: root is 5, newValue 3 -> return ture
    //  Case 3: newValue 3<5 -> search in left sub Tree
    //  Case 4: newValue 6 -> search in right sub Tree
    private boolean containsRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        } else if (value < current.value) {
            return containsRecursive(current.left, value);
        } else {
            return containsRecursive(current.right, value);
        }
    }

    // Operation 1: inserting an element to BST
    // Add recursiveAdd to do the insertion
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        } else if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            //value already exist
            return current;
        }
        return current;
    }
}

// Node has value; Node has left node; node has right node
class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right= null;
    }
}
