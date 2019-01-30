package com.techlabs.observer.pattern.singlehandler;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CommonListnerFrame extends JFrame {
	private Container container;
	private JButton button;
	private JButton button1;
	
	public CommonListnerFrame() {
		this.setSize(500, 500);
		this.setTitle("single observer");
		this.setLayout(new FlowLayout());
		container = getContentPane();
		this.button = new JButton("Blue");
		container.add(button);
		this.button1 = new JButton("Red");
		this.setVisible(true);
		container.add(button1);
		button.addMouseListener(new CommonListner(this));
		button1.addMouseListener(new CommonListner(this));
		
	}
	
	public JButton getButton() {
		return button;
	}
	
	public JButton getButton1() {
		return button1;
	}

	

	public Container getContainer() {
		return container;
	}

	public JButton getbutton() {
		return button;
	}
	
	public JButton getbutton1() {
		return button1;
	}
}
