package tic.tac.toe.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tic.tac.toe.Board;
import tic.tac.toe.Game;
import tic.tac.toe.IResultAnalyzer;
import tic.tac.toe.Mark;
import tic.tac.toe.Player;
import tic.tac.toe.ResultAnalyzer;

class GameTest {

	@Test
	void playTest() {
		IResultAnalyzer board = new Board();
		Game game = new Game(new Player("ajay"), new Player("akash"), board, new ResultAnalyzer(board));
		game.play(2);
		Mark result = board.getCellMark(2);
		assertEquals(Mark.CROSS, result);
	}

	@Test
	void playerSwitch() {
		IResultAnalyzer board = new Board();
		Game game = new Game(new Player("ajay"), new Player("akash"), board, new ResultAnalyzer(board));
		game.switchPlayer();
		String result = game.getCurrentPlayer().getName();
		assertEquals("akash", result);
	}

}
