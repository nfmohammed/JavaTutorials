package interview.queuesUsingStack;

import java.util.Stack;
import java.util.regex.*;


public class Solution {
    
    public static class TwoStackQueue<T> {
        private Stack<T> stackNewestOnTop = new Stack<T>();
        private Stack<T> stackOldestOnTop = new Stack<T>();
    
        public void enqueue(T value) {
            stackNewestOnTop.push(value);
        }
        public T peek() {
            //move element from stackNewest to stackOldest
            shiftStack();
            return stackOldestOnTop.peek();
        }
        private void shiftStack() {
            if(stackOldestOnTop.isEmpty()) {
                while(!stackNewestOnTop.isEmpty()) {
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
            }
        }
        public T dequeue() {
            //move elements from stackNewest to stackOldest
            shiftStack();
            return stackOldestOnTop.pop();
        }
    }
    
}