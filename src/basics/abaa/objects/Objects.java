package basics.abaa.objects;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Objects {
	public static void main(String[] args) {
		
		//create our window
		JFrame window = new JFrame(); //window variable contains Object of type JFrame
		window.setTitle("My Window");
		window.setSize(800, 600);
		
		
		//creat our label
		JLabel label = new JLabel();
		label.setText("Hello World");
		window.add(label);
		
		window.setVisible(true);
		
		//String Object
		String s = "abcdefgh"; //another convenient to create string object
		System.out.println("String Length = "+s.length());
		
		//String objects can also be defined as follows
		String s2 = new String("I am String Object");
		System.out.println(s2);
	}
}
