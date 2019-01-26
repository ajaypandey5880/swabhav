package com.techlabs.frame;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomeFrame extends JFrame{
	public WelcomeFrame() {
		
		this.setTitle("Welcome");
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JLabel label = new JLabel("Welcome To UI");
		panel.add(label);
		this.add(panel);
		this.setSize(500, 500);
		this.setVisible(true);
	}
}
