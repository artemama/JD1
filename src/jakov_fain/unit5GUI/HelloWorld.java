package jakov_fain.unit5GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloWorld extends JFrame{
	
	public HelloWorld() {
		setSize(200, 300);
		setTitle("HelloWorld");
		
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		
		HelloWorld myHello = new HelloWorld();
		
		JButton myButton = new JButton("Click me");
		
		myHello.add(myButton);
	}


}
