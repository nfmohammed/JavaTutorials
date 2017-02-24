package tutorials.aaf.linkedlist;

public class MyLink {
	
	public String bookName;
	public int millionsSold;
	
	public MyLink next;
	
	public MyLink(String bookName, int millionsSold){
		this.bookName = bookName;
		this.millionsSold = millionsSold;
	}
	
	public void display(){
		System.out.println("BookName: "+bookName+"= "+millionsSold);
	}
	
	public String toString(){
		return bookName;
	}

}