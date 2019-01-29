package tic.tac.toe;

import java.util.Scanner;

public class TicTacToeConsole {

	public static void main(String[] args) {
		final int PLAY = 0;
		final int EXIT = 1;
		Scanner scanner = new Scanner(System.in);

		int choice;
		do {
			System.out.println("Enter 0 to Play\t 1 To Exit");
			choice = scanner.nextInt();
			switch (choice) {

			case PLAY:
				IResultAnalyzer board = new Board();
				IBoard resultAnalyzer = new ResultAnalyzer(board);

				System.out.println("Enter Player 1 name");
				String name = scanner.next();
				Player player1 = new Player(name);

				System.out.println("Enter Player 2 name");
				name = scanner.next();
				Player player2 = new Player(name);

				Game game = new Game(player1, player2, board, resultAnalyzer);
				while (resultAnalyzer.isWon() == Result.IN_PROGRESS) {
					printBoard(board);
					System.out.println("Enter the index you want to place the Marker");
					int index = scanner.nextInt();
					try {
						game.play(index);
					} catch (RuntimeException exception) {
						System.out.println(exception.getMessage());
					}
				}
				if (resultAnalyzer.isWon() == Result.WON) {
					System.out.println(game.getCurrentPlayer().getName() + "\tWin");
				}
				if (resultAnalyzer.isWon() == Result.DRAW) {
					System.out.println("This Game is DRAW");
				}
				return;
			case EXIT:
				System.out.println("THANKYOU FOR PLAYING");
				return;
			default:
				System.out.println("Enter Valid Option");
			}
		} while (choice != EXIT);
	}

	public static void printBoard(IResultAnalyzer board) {
		System.out.println("Enter no 0 for first place and 1 for second place and so on");
		System.out.println(board.getCellMark(0) + "\t" + board.getCellMark(1) + "\t" + board.getCellMark(2) + "\n"
				+ board.getCellMark(3) + "\t" + board.getCellMark(4) + "\t" + board.getCellMark(5) + "\n"
				+ board.getCellMark(6) + "\t" + board.getCellMark(7) + "\t" + board.getCellMark(8));
	}

	public static void play() {

	}
}
