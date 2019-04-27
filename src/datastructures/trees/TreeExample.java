package datastructures.trees;

public class TreeExample {

    public static void main(String[] args) {
        Node tree = new Node(10);

        tree.insert(5); //inserted to left of 10
        tree.insert(15); //inserted to right of 10

        tree.insert(7); //inserted to right of 5
        tree.insert(1); //inserted to left of 5

        tree.insert(12); //inserted to left of 15
        tree.insert(20); //inserted to right of 15
        tree.printInOrder();
    }
}