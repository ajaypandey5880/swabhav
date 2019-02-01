package tic.tac.toe.ui.test;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class StartPage extends JFrame {
	private Container container;
	private JTextField player1, player2;
	public JTextField getPlayer1() {
		return player1;
	}

	public JTextField getPlayer2() {
		return player2;
	}

	private JButton start;
	private JLabel lable1, label2;

	public StartPage() {
		this.player1 = new JTextField();
		this.player2 = new JTextField();
		this.start = new JButton("Start");
		this.lable1 = new JLabel("Player1");
		this.label2 = new JLabel("Player2");
		this.container = getContentPane();

		container.add(lable1);
		container.add(player1);
		container.add(label2);
		container.add(player2);
		container.add(start);

		lable1.setBounds(80, 70, 200, 30);
		label2.setBounds(80, 110, 200, 30);
		player1.setBounds(200, 70, 200, 30);
		player2.setBounds(200, 110, 200, 30);
		start.setBounds(150, 160, 100, 30);

		this.setTitle("Login Form");
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		start.addActionListener(new ActionHandler(this,null));

	}

	public JButton getStart() {
		return start;
	}
}
