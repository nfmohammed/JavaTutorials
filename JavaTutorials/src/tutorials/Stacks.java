package tutorials;

import java.util.Stack;

public class Stacks {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("first");
		printStack(stack);
		
		stack.push("second");
		printStack(stack);
		
		stack.push("third");
		printStack(stack);
		
		stack.pop();
		printStack(stack);
		
		stack.pop();
		printStack(stack);
		
		stack.pop();
		printStack(stack);
		
	}
	private static void printStack(Stack<String> s){
		if(s.isEmpty())
			System.out.println("Stack is Empty");
		else{
			System.out.println(s+"TOP");
		}
	}
}
