package com.techlabs.weblogin.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PasswordChecker implements ActionListener {
	private LoginFrame frame;
	private String password;

	public PasswordChecker(LoginFrame loginFrame) {
		this.frame = loginFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		password = "";
		for (int i = 0; i < frame.getPassowrd().getPassword().length; i++) {
			this.password = this.password + frame.getPassowrd().getPassword()[i];
		}
		if (frame.getText().getText().equalsIgnoreCase(password)) {
			Welcome welcome = new Welcome();
			welcome.setVisible(true);
			JLabel label = new JLabel("Welcome  " + frame.getText().getText());
			welcome.getContentPane().add(label);
		} else {
			JOptionPane.showMessageDialog(frame, "Inavlid Id and Password");
		}
	}
}
