package interview.queuesUsingStack;

import interview.queuesUsingStack.Solution;
import interview.queuesUsingStack.Solution.TwoStackQueue;

public class TestSolution {
    public static void main(String[] args) {
        Solution.TwoStackQueue<Integer> tsq = new Solution.TwoStackQueue<Integer>();
        tsq.enqueue(2); //2 goes in stackNewestOnTop
        tsq.enqueue(3); //3 goes on top of 2 in  stackNewestOnTop
        tsq.enqueue(4); // 4 goes on top of 3 in stackNewestOnTop
        tsq.enqueue(5); // 5 goes on top of 4 in stackNewestOnTop
        
        //Items are moved from StackNewestOnTop to StackOldestOnTop
        System.out.println(tsq.peek()); //output is 2, read from stackOldestOnTop
        System.out.println(tsq.dequeue()); //output is 2 and removed from stackOldestOnTop

        //After peek, the new items are again added to stackNewestOnTop
        tsq.enqueue(6); // 6 goes in stackNewestOnTop
        tsq.enqueue(7); // 7 goes on top of 6 in stackNewestOnTop
        tsq.enqueue(8); // 8 goes on top of 7 in stackNewestOnTop

        System.out.println(tsq.dequeue()); //output is 3 from stackOldestOnTop
        System.out.println(tsq.dequeue()); //output is 4 from stackOldestOnTop
        System.out.println(tsq.dequeue()); //output is 5 from stackOldestOnTop
        //Now the stackOldestOnTop is Empty.....

        //Since stackOldestOnTop was empty, the items are moved from stackNewestOnTop to stackOldestOnTop
        System.out.println(tsq.dequeue()); //output is 6
        System.out.println(tsq.dequeue()); //outpt is 7
        System.out.println(tsq.dequeue()); //output is 8
    }
}