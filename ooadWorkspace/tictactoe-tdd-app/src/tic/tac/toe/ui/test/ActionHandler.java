package tic.tac.toe.ui.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import tic.tac.toe.Board;
import tic.tac.toe.Game;
import tic.tac.toe.Mark;
import tic.tac.toe.Player;
import tic.tac.toe.Result;
import tic.tac.toe.ResultAnalyzer;

public class ActionHandler implements ActionListener {
	private StartPage startPage;
	private TicTacToeUI ticTacToeUI;

	public ActionHandler(StartPage startPage, TicTacToeUI ui) {
		this.startPage = startPage;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	//	if(e.getSource() == startPage.getStart()) {
		ticTacToeUI = new TicTacToeUI();
		//}
		Player player1 = new Player(startPage.getPlayer1().getText());
		Player player2 = new Player(startPage.getPlayer2().getText());
		Board board = new Board();
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		Game game = new Game(player1, player2, board, analyzer);

		int a = Integer.parseInt(e.getActionCommand());

		game.getCurrentPlayer();
		String state = game.play(a) + "";
		game.getCurrentPlayer();
		// text.setText(game.getCurrentPlayer().getName());

		Mark mark = board.getCellMark(a);

		String m = mark.toString();

		String iconCross = this.getClass().getClassLoader().getResource("").getFile();
		String iconNought = this.getClass().getClassLoader().getResource("").getFile();

		ImageIcon cross = new ImageIcon(iconCross);
		ImageIcon nought = new ImageIcon(iconNought);

		if (mark.equals(Mark.CROSS)) {
			// ticTacToeUI.setButton(.setIcon(cross);
		}
		if (mark.equals(Mark.NAUGHT)) {
			// ticTacToeUI.
		}
		if (analyzer.isWon() == Result.WON || analyzer.isWon() == Result.DRAW) {
			Object[] close = { "Close" };
			if (analyzer.isWon() == Result.DRAW) {
				player1.getName();
			}
			int result = JOptionPane.showOptionDialog(null, game.getCurrentPlayer(), analyzer.isWon().toString(),
					JOptionPane.YES_NO_OPTION, JFrame.EXIT_ON_CLOSE, null, close, null);
			if (result == JOptionPane.YES_OPTION) {
				//ticTacToeUI.getContentPane().setVisible(false);
				return;
			}
			if (result == JOptionPane.NO_OPTION) {
				System.exit(0);
			}
		}
	}
}
