package tic.tac.toe;

public class Game {
	private Player player1;
	private Player player2;
	private Board board;
	private Player currentPlayer ;
	private ResultAnalyzer analyzer;

	public Game(Player player1, Player player2, Board board, ResultAnalyzer analyzer) {
		this.player1 = player1;
		this.player2 = player2;
		this.board = board;
		this.analyzer = analyzer;
		this.currentPlayer = player1;
	}

	public void play(int index) {
		if (board.getCellMark(index) != Mark.EMPTY) {
			System.out.println("This Place is already Marked\nPlease provide other Index");
			return;
		}
		if(currentPlayer == player1) {
			board.setCellMark(index, Mark.CROSS);
			analyzer.isWon();
			if(analyzer.isWon() == Result.WON) {
				System.out.println(player1.getName()+"WIN");
			}
			if(analyzer.isWon() == Result.DRAW) {
				System.out.println("Game Is Draw");
			}
			this.currentPlayer = player2;
			return;
		}
		if(currentPlayer == player2) {
			board.setCellMark(index, Mark.NAUGHT);
			analyzer.isWon();
			if(analyzer.isWon() == Result.WON) {
				System.out.println(player2.getName() +"WIN");
				return;
			}
			if(analyzer.isWon() == Result.DRAW) {
				System.out.println("Game Is Draw");
			}
			this.currentPlayer = player1;
			return;
		}
		
	}

}
