package tic.tac.toe.ui.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import tic.tac.toe.Board;
import tic.tac.toe.Game;
import tic.tac.toe.Mark;
import tic.tac.toe.Player;
import tic.tac.toe.Result;
import tic.tac.toe.ResultAnalyzer;

public class TicTacToeGui {
	
	public static void main(String[] args) {
		init();
	}

	public static void init() {
		Player player1 = new Player("ajay");
		Player player2 = new Player("anup");
		Board board = new Board();
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		Game game = new Game(player1, player2, board, analyzer);

		JFrame jFrame = new JFrame();
		JButton button[] = new JButton[9];
		JTextField text = new JTextField();
		text.setBounds(0, 600, 600, 20);
		jFrame.add(text);
		
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(e.getActionCommand());
				
				game.getCurrentPlayer();
				String state = game.play(a)+ "";
				text.setText(game.getCurrentPlayer().getName());
				
				Mark mark = board.getCellMark(a);
				
				String m = mark.toString();
				
				String iconCross = "D:\\swabhav-repos\\swabhav\\ooadWorkspace\\tictactoe-tdd-app\\cross.jpg";
				String iconNought = "D:\\swabhav-repos\\swabhav\\ooadWorkspace\\tictactoe-tdd-app\\nought.jpg";
				
				ImageIcon cross = new ImageIcon(iconCross);
				ImageIcon nought = new ImageIcon(iconNought);
				
				if(mark.equals(Mark.CROSS)) {
					button[a].setIcon(cross);
				}
				if(mark.equals(Mark.NAUGHT)) {
					button[a].setIcon(nought);
				}
				
				if(analyzer.isWon() == Result.WON || analyzer.isWon() == Result.DRAW) {
					Object[] close = {"Close"};
					if(analyzer.isWon() == Result.DRAW) {
						player1.getName().toString();
					}
					 int result = JOptionPane.showOptionDialog(null,game.getCurrentPlayer().getName(), 
							 analyzer.isWon().toString(), JOptionPane.YES_NO_OPTION, JFrame.EXIT_ON_CLOSE,
							 null, close,null);
					 if(result == JOptionPane.YES_OPTION) {
						 jFrame.setVisible(false);
						 jFrame.dispose();
						 init();
						 return;
					 }
					 if(result == JOptionPane.NO_OPTION) {
						 System.exit(0);
					 }
				}
			}
		};
		for(int index = 0;index < button.length;index++) {
			button[index] = new JButton();
			button[index].setText(index+"");
			jFrame.add(button[index]);
		}
		text.setText(game.getCurrentPlayer().getName()+"turn");
		
		button[0].setBounds(0, 0, 200, 200);
		button[1].setBounds(200, 0, 200, 200);
		button[2].setBounds(400, 0, 200, 200);
		button[3].setBounds(0, 200, 200, 200);
		button[4].setBounds(200, 200, 200, 200);
		button[5].setBounds(400, 200, 200, 200);
		button[6].setBounds(0, 400, 200, 200);
		button[7].setBounds(200, 400, 200, 200);
		button[8].setBounds(400, 400, 200, 200);
		
		button[0].addActionListener(listener);
		button[1].addActionListener(listener);
		button[2].addActionListener(listener);
		button[3].addActionListener(listener);
		button[4].addActionListener(listener);
		button[5].addActionListener(listener);
		button[6].addActionListener(listener);
		button[7].addActionListener(listener);
		button[8].addActionListener(listener);
		
		jFrame.setSize(600, 659);
		jFrame.setLayout(null);
		jFrame.setVisible(true);
	}

}
