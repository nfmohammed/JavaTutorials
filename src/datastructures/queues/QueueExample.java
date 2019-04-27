package datastructures.queues;

import datastructures.queues.Queue;

public class QueueExample {
    public static void main(String[] args) {
        final Queue q = new Queue();
        q.add(10); //first in line
        q.add(20); //second in line
        q.add(30); //third in line
        System.out.println(q.peek()); //output is 10
        System.out.println(q.remove()); //10 is removed
        System.out.println(q.peek()); //20 is removed
    }

}