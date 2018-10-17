package basics.aac.constants;

public class Constants {
	
	public static final int WIDTH = 800; //declare constant value
	public static final int HEIGHT = 600; //declare contant value
	public static final String NAME_OF_GAME = "Need For Speed"; //when contant has multiple words, then separate by underscore
	//With public, these contants can be accessed from anywhere in the program.
	//With static these contants are present with Class itself and not with instantiated objects.
	//final keyword converts a variable into contant field.

	public static void main(String[] args) {
		System.out.println(Math.PI);
		
		System.out.println(Constants.WIDTH);
		System.out.println(HEIGHT);
	}
}
