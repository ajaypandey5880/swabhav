package tic.tac.toe;

public class Game {
	private Player player1;
	private Player player2;
	private IResultAnalyzer board;
	private Player currentPlayer;
	private IBoard analyzer;

	public Game(Player player1, Player player2, IResultAnalyzer board, IBoard analyzer) {
		this.player1 = player1;
		this.player2 = player2;
		this.board = board;
		this.analyzer = analyzer;
		this.currentPlayer = player1;
	}


	@Override
	public String toString() {
		return currentPlayer.toString();
	}


	public Result play(int index) {

		playertask(index, currentPlayer);

		return analyzer.isWon();
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void playertask(int index, Player player) {
		if (player == player1) {
			board.setCellMark(index, Mark.CROSS);
			switchPlayer();
			return;
		}
		if (player == player2) {
			board.setCellMark(index, Mark.NAUGHT);
			switchPlayer();
			return;
		}
	}

	public void switchPlayer() {
		if (currentPlayer == player1) {
			this.currentPlayer = player2;
			return;
		}
		if (currentPlayer == player2) {
			this.currentPlayer = player1;
			return;
		}
	}

}
