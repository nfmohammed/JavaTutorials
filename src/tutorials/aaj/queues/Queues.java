package tutorials.aaj.queues;

import java.util.PriorityQueue;

public class Queues {
	
	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<String>();
		
		q.offer("first");
		q.offer("second");
		q.offer("third");
		System.out.println(q);
		
		System.out.println("Highest Priority Element in the Queue = "+q.peek());
		System.out.println();
		System.out.println("Now lets take out elements from the Queue:");
		while(!q.isEmpty()){
			System.out.println(q);
			q.poll();
		}
		if(q.isEmpty()){
			System.out.println("Queue is now empty");
		}
	}
}
