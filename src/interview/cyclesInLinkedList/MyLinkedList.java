package interview.cyclesInLinkedList;

import interview.cyclesInLinkedList.Node;
public class MyLinkedList {
    private Node node;
    public MyLinkedList(int value) {
        this.node = new Node(value);
    }
    public Node getFirstNode() {
        return this.node;
    }
    public void insert(int value) {
        Node n = new Node(value);
        Node pointer = node;
        while(pointer.next != null) {
            pointer = pointer.next;
        }
        pointer.next = n;
    }
    // DANGEROUS. THIS WILL PRINT FOREVER
    // public void print() {
    //     Node pointer = this.node;
    //     do{
    //         System.out.println(pointer.data);
    //         pointer = pointer.next;
    //     }while(pointer != null);
    // }
    public void createCycle() {
        Node last = this.node;
        while(last.next != null ) {
            last = last.next;
        }
        last.next = this.node;
    }

}