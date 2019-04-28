package interview.cyclesInLinkedList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import interview.cyclesInLinkedList.Node;

public class CyclesInNode {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        //list.createCycle();

        System.out.println(hasCycle(list.getFirstNode()));
        System.out.println(hasCycleUsingSet(list.getFirstNode()));
    }

    private static boolean hasCycle(Node head){
        if(head == null) return false;

        Node fast = head;
        Node slow = head;
        while(fast != null && slow != null && fast.next != null) {
            if(fast == slow && fast != head) return true;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
    
    private static boolean hasCycleUsingSet(Node node) {
        Set<Node> nodeSet = new HashSet<Node>();
        Node pointer = node;
        while(pointer != null) {
            if(nodeSet.contains(pointer)) {
                return true;
            }
            nodeSet.add(pointer);
            pointer = pointer.next;
        }
        return false;
        
    }
}