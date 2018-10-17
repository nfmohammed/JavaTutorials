package basics.aaf.linkedlist;
//https://www.youtube.com/watch?v=195KUinjBpU
//In this lesson, each link consists of BookName and NumberOfMillions sold.



class MyLinkedList{
	
	public MyLink firstLink;
	
	MyLinkedList(){
		firstLink = null;
	}
	
	public boolean isEmpty(){
		return(firstLink==null);
	}
	
	public void insertFirstLink(String bookName, int millionsSold){
		MyLink newLink = new MyLink(bookName, millionsSold);
		newLink.next = firstLink;
		firstLink = newLink;
	}
	
	public MyLink removeFirst(){
		MyLink linkReference = firstLink;
		if (!isEmpty()){
			firstLink = firstLink.next;
		}else{
			System.out.println("Empty Linked list");
		}
		return linkReference;
	}
	
	public void display(){
		MyLink theLink = firstLink;
		while(theLink!=null){
			theLink.display();
			System.out.println("Next Linke : "+theLink.next);
			theLink = theLink.next;
		}
	}
	
	public MyLink find(String bookName){
		MyLink theLink = firstLink;
		if(!isEmpty()){
			
			while ( theLink.bookName !=bookName){
				
				if(theLink.next == null){
					return null;
				}else{
					theLink = theLink.next;
				}
			}
		}else{
			System.out.println("Empty LinkedList");
		}
		return theLink;
	}
	
	public MyLink removeLink(String bookName){
		MyLink currentLink = firstLink;
		MyLink previousLink = firstLink;
		
		while(currentLink.bookName!=bookName){
			
			if (currentLink.next == null){
				return null;
			}else{
				previousLink = currentLink;
				currentLink = currentLink.next;
				
			}
			
		}
		if (currentLink == firstLink){
			firstLink = firstLink.next;
		}else{
			previousLink.next = currentLink.next;
			
		}
		return currentLink;
	}
}