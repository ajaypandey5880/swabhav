package com.techlabs.weblogin.frame;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
	private Container container;
	private JTextField text;
	private JPasswordField passowrd;
	private JButton submit;
	private JLabel Lable1,Label2;

	public LoginFrame() {
		this.text = new JTextField();
		this.passowrd = new JPasswordField();
		this.submit = new JButton("Login");
		this.Lable1 = new JLabel("UserName");
		this.Label2 = new JLabel("Password");
		this.container = getContentPane();
		
		container.add(Lable1);
		container.add(text);
		container.add(Label2);
		container.add(passowrd);
		container.add(submit);
		
		Lable1.setBounds(80, 70, 200, 30);
		Label2.setBounds(80, 110, 200, 30);
		text.setBounds(200, 70, 200, 30);
		passowrd.setBounds(200, 110, 200, 30);
		submit.setBounds(150, 160, 100, 30);
		
		this.setTitle("Login Form");
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		submit.addActionListener(new PasswordChecker(this));
		
	}

	public JTextField getText() {
		return text;
	}

	public JPasswordField getPassowrd() {
		return passowrd;
	}
	
	

}
