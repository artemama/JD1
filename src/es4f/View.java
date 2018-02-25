package es4f;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame {
	public View(String s) {
		super(s);
		createGUI();
	}

	public void	createGUI() {
			
		// 1. Create a panel
		JPanel windowContent = new JPanel();

		// 2. Set a layout manager for this panel
		GridLayout gl = new GridLayout(7, 2);
		windowContent.setLayout(gl);

		// 3. Create controls in memory
		JLabel label0 = new JLabel("Введи адрес файла");
		JTextField field0 = new JTextField(250);
		JLabel label1 = new JLabel("Введи номер ЭСЧФ:");
		JTextField field1 = new JTextField(50);
		JLabel label2 = new JLabel("Дата к зачету ЭСЧФ гггг-мм-дд:");
		JTextField field2 = new JTextField(15);
		JLabel label3 = new JLabel("Введи номер Invoice:");
		JTextField field3 = new JTextField(50);
		JLabel label4 = new JLabel("Дата Invoice гггг-мм-дд:");
		JTextField field4 = new JTextField(50);
		JLabel label = new JLabel("");
		JButton go = new JButton("Run");
		JLabel labelRes = new JLabel("Результат обработки");
		JLabel result = new JLabel("");

		// 4. Add controls to the panel
		windowContent.add(label0);
		windowContent.add(field0);
		windowContent.add(label1);
		windowContent.add(field1);
		windowContent.add(label2);
		windowContent.add(field2);
		windowContent.add(label3);
		windowContent.add(field3);
		windowContent.add(label4);
		windowContent.add(field4);
		windowContent.add(label);
		windowContent.add(go);
		windowContent.add(labelRes);
		windowContent.add(result);
		// 5. Create the frame and add the panel to it
		JFrame frame = new JFrame("Изменение ЭСЧФ (Импорт) перед порталом");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 6. Add the panel to top-level container
		frame.setContentPane(windowContent);

		// 7. set the size and make the window visible
		frame.setSize(500, 180);
		frame.setVisible(true);
	}

	public class Handler implements ActionListener {

		public void actionPerformed(ActionEvent e) {

		}

	}

}
