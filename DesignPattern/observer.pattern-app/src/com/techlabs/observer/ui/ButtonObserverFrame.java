package com.techlabs.observer.ui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonObserverFrame extends JFrame{
	Container container;
	JButton button;
	public ButtonObserverFrame() {
		JButton button;
		setTitle("Observer Frame");
		this.setSize(500, 500);
		setLayout(null);
		container = getContentPane();
		button = new JButton("OK");
		button.setBounds(170, 170, 100, 50);
		container.add(button);
		setVisible(true);
		button.addActionListener(new OkListner());
		button.addActionListener(new GoodbyeListner());
		//button.addActionListener(new ColourChangeListner());
	}
	
	
	
	
	
}
