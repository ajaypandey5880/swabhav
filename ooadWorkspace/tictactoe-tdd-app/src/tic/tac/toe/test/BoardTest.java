package tic.tac.toe.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tic.tac.toe.Board;
import tic.tac.toe.IResultAnalyzer;
import tic.tac.toe.Mark;

class BoardTest {

	@Test
	void setCellMark() {
		IResultAnalyzer board = new Board();
		board.setCellMark(0, Mark.CROSS);
		Mark result = board.getCellMark(0);
		assertEquals(Mark.CROSS, result);
	}
	
	@Test
	void passingInvalidIndex() {
		IResultAnalyzer board = new Board();
		String result;
		try {
		board.setCellMark(10, Mark.CROSS);
		board.getCellMark(-2);
		}catch (RuntimeException exception) {
			result = (exception.getMessage());
			assertEquals("Enter valid Index", result);

		}
	}
	

}
