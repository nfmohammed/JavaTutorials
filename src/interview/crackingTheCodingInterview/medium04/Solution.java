package interview.crackingTheCodingInterview.medium04;

public class Solution {

    public static void main (String[] args) {

        ThreeInOneStack threeInOneStack = new ThreeInOneStack();
        threeInOneStack.addToStack1(10);
        threeInOneStack.addToStack1(20);
        threeInOneStack.addToStack1(30);
        threeInOneStack.printStack(1);

        threeInOneStack.addToStack2(-10);
        threeInOneStack.addToStack2(-11);
        threeInOneStack.addToStack2(-12);
        threeInOneStack.printStack(2);

        threeInOneStack.addToStack3(101);
        threeInOneStack.addToStack3(102);
        threeInOneStack.addToStack3(103);
        threeInOneStack.printStack(3);
    }
}
class ThreeInOneStack {
    static int stack1Pointer = -1;
    static int stack2Pointer = -1;
    static int stack3Pointer = -1;
    int[] array = new int[1000];
    public void addToStack1(int number) {
        if (stack1Pointer == -1) {
            stack1Pointer = 0;
        } else {
            stack1Pointer = stack1Pointer + 3;
        }
        array[stack1Pointer] = number;

    }
    // Stack1: POP and PEEK operations can be implemented here

    public void addToStack2(int number) {
        if (stack2Pointer == -1) {
            stack2Pointer = 1;
        } else {
            stack2Pointer = stack2Pointer + 3;
        }
        array[stack2Pointer] = number;
    }
    // Stack2: POP and PEEK operations can be implemented here

    public void addToStack3(int number) {
        if (stack3Pointer == -1) {
            stack3Pointer = 2;
        } else {
            stack3Pointer = stack3Pointer + 3;
        }
        array[stack3Pointer] = number;
    }
    // Stack3: POP and PEEK operations can be implemented here

    public void printStack(int stackNumber) {
        int pointer  = -1;
        if (stackNumber == 1) {  pointer = stack1Pointer; }
        if (stackNumber == 2) {  pointer = stack2Pointer; }
        if (stackNumber == 3) {  pointer = stack3Pointer; }
        for (int i = pointer; i > -1; i=i-3) {
            System.out.print(array[i]+ ", ");
        }
        System.out.println();
    }
}
