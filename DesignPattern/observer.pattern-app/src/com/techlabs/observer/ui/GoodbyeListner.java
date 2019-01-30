package com.techlabs.observer.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoodbyeListner implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("GoodBye Event Occured");
	}

}
