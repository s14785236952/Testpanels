package chapter12;

import java.awt.*;
import javax.swing.*;

public class TestPanels extends JFrame {
	public TestPanels() {
		// Create panel p1 for the buttons and set GridLayout
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4, 4));

		// Add buttons to the panel
		for (int i = 1; i <= 3; i++) {
			p1.add(new JButton("" + i));
		}

		p1.add(new JButton("/"));
		for (int i = 4; i <= 6; i++) {
			p1.add(new JButton("" + i));
		}
		p1.add(new JButton("*"));
		for (int i = 7; i <= 9; i++) {
			p1.add(new JButton("" + i));
		}
		p1.add(new JButton("-"));
		p1.add(new JButton("0"));
		p1.add(new JButton("."));
		p1.add(new JButton("="));
		p1.add(new JButton("+"));

		// Create panel p2 to hold a text field and p1
		JPanel p2 = new JPanel(new BorderLayout());
		p2.add(new JTextField(" The Result "), BorderLayout.NORTH);
		p2.add(p1, BorderLayout.CENTER);

		// add contents into the frame
		add(p2, BorderLayout.CENTER);
		
	}

	/** Main method */
	public static void main(String[] args) {
		TestPanels frame = new TestPanels();
		frame.setTitle("Calculator");
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
