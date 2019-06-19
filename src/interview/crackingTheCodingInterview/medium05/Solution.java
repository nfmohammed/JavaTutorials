package interview.crackingTheCodingInterview.medium05;

public class Solution {

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(3);
        System.out.println(s.getMinimum()); //output: 3
        s.pop();
        System.out.println(s.getMinimum()); //output: 5
    }

}


class Stack {
    private Integer minimum = null;
    private static class Node {
        private int data;
        private Node next;
        private Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    public boolean isEmpty() {
        return top == null;
    }
    public int peek() {
        return top.data;
    }
    public void push(int data){
        if (isEmpty()) {
            minimum = data;
        } else if (minimum > data) {
            minimum = data;
        }

        Node node = new Node(data);
        node.next = top;
        top = node;
    }
    public int pop() {
        int data = top.data;
        if (data == minimum) {
            minimum = findNewMin();
        }
        //no error handling, add if you like
        top = top.next;
        return data;
    }
    public int getMinimum() {
        return minimum;
    }
    private Integer findNewMin() {
        Integer newMinimum = null;
        Node index = top.next; //since minimum node is been deleted, start from next node.
        while(index != null) {
            if (newMinimum == null) {
                newMinimum = index.data;
            } else if (index.data < newMinimum) {
                newMinimum = index.data;
            }
            index = index.next;
        }
        return newMinimum;
    }
}
