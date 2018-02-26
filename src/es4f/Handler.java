package es4f;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Handler implements ActionListener{
	
	View parant;

	public Handler(View view) {
		// TODO Auto-generated constructor stub
	}

	public void actionPerformed(ActionEvent e) {
		JButton clickedButon = (JButton) e.getSource();
		
	}

}
