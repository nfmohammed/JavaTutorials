package datastructures.trees;

public class Node {
    // Two child nodes in a binary tree
    Node left, right;
    int data;

    //this is the root of the tree
    public Node(int value) {
        this.data = value;
    }

    public void insert(int value) {
        if(value <= data) {
            if(left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    //check if tree contains a value
    public boolean contains(int value) {
        if (value == data) {
            return true;
        } else if ( value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    //print all node values using Inorder traversal.
    //InOrder Traversal: Left - Root - Right
    //PreOrder Traversal: Root - Left - Right
    //PostOrder Traversal: Left - Right - Root
    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(data);
        if (right != null) {
            right.printInOrder();
        }
    }
}