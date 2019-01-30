package com.techlabs.weblogin.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class PasswordChecker implements ActionListener {
	private LoginFrame frame;
	//private String password = frame.getPassowrd().getPassword();

	public PasswordChecker(LoginFrame loginFrame) {
		this.frame = loginFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (frame.getText().getText().equals(frame.getPassowrd().getPassword())){
			Welcome welcome = new Welcome();
			welcome.setVisible(true);
			JLabel label = new JLabel("Welcome" + frame.getText());
			welcome.getContentPane().add(label);
			System.out.println("hiii");
		}
	}

}
