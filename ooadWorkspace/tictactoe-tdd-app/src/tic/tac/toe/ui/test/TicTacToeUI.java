package tic.tac.toe.ui.test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import tic.tac.toe.Game;

public class TicTacToeUI {
	private Game game;
	
	public JButton[] getButton() {
		return button;
	}

	public void setButton(JButton[] button) {
		this.button = button;
	}

	private JButton button[] = new JButton[9];
	
	public TicTacToeUI() {
		JFrame jFrame = new JFrame();
		
		JTextField text = new JTextField();
		text.setBounds(0, 600, 600, 20);
		jFrame.add(text);
		
		//text.setText(game.getCurrentPlayer().getName()+"turn");
		
		button[0].setBounds(0, 0, 200, 200);
		button[1].setBounds(200, 0, 200, 200);
		button[2].setBounds(400, 0, 200, 200);
		button[3].setBounds(0, 200, 200, 200);
		button[4].setBounds(200, 200, 200, 200);
		button[5].setBounds(400, 200, 200, 200);
		button[6].setBounds(0, 400, 200, 200);
		button[7].setBounds(200, 400, 200, 200);
		button[8].setBounds(400, 400, 200, 200);
		
		button[0].addActionListener(new ActionHandler(null,this));
		button[1].addActionListener(new ActionHandler(null,this));
		button[2].addActionListener(new ActionHandler(null,this));
		button[3].addActionListener(new ActionHandler(null,this));
		button[4].addActionListener(new ActionHandler(null,this));
		button[5].addActionListener(new ActionHandler(null,this));
		button[6].addActionListener(new ActionHandler(null,this));
		button[7].addActionListener(new ActionHandler(null,this));
		button[8].addActionListener(new ActionHandler(null,this));
		
		jFrame.add(button[0]);
		jFrame.setSize(650, 650);
		jFrame.setLayout(null);
		jFrame.setVisible(true);
	}
	
}
