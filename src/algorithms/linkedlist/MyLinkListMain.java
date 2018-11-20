package basics.aaf.linkedlist;

public class MyLinkListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList theLinkedList = new MyLinkedList();
		theLinkedList.insertFirstLink("Don Quixote", 500);
		theLinkedList.insertFirstLink("A Tale of two cities", 200);
		theLinkedList.insertFirstLink("The Lord of the Rings",150);
		theLinkedList.insertFirstLink("Harry Porter", 900);
		theLinkedList.insertFirstLink("A Tale of two cities", 400);
		
		theLinkedList.display();
	}

}
