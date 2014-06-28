package tutorials;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import javax.swing.JFrame;

public class Drawing extends JFrame {
	
	public static void main(String[] args) {
		
		System.out.println("Let us change the method defined in JFrame in this Class");

		new Drawing();
	}
	
	public Drawing(){
		setSize(500, 500);
		setVisible(true);
		System.out.println("Constructor has run");
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//super.paint(g);
		g.setColor(Color.blue);
		g.drawRect(20, 100, 100, 50);
		
		
		g.setColor(Color.red);
		g.fillRect(20, 200, 100, 100);
		
		
	}
	
	
	

}
