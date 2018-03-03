package es4f;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;

public class Handler implements ActionListener{
	
	public Handler(View view) {
	}

	public void actionPerformed(ActionEvent e) {
		e.getSource();
		Worker worker = new Worker();
		worker.go();
	}

}
