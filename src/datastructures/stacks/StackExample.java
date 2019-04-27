package datastructures.stacks;

import datastructures.stacks.Stack;

public class StackExample {
    public static void main(String[] args) {
        final Stack s = new Stack();
        s.push(1);
        s.push(5);
        s.push(20);
        System.out.println(s.peek()); //output is 20 
        System.out.println(s.pop()); //output is 20 and is removed from statck
        System.out.println(s.pop()); //output is 5
        System.out.println(s.pop()); //output is 1
    }
}