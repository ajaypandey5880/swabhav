package tic.tac.toe.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tic.tac.toe.Board;
import tic.tac.toe.Mark;
import tic.tac.toe.ResultAnalyzer;

class ResultAnalyzerTest {

	@Test
	void isHorizontal() {
		Board board = new Board();
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.setCellMark(1,Mark.CROSS);
		board.setCellMark(7,Mark.CROSS);
		board.setCellMark(8,Mark.CROSS);
		boolean result = analyzer.isHorizontal();
		assertEquals(false, result);
	}
	
	@Test
	void isVertical() {
		Board board = new Board();
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.setCellMark(2,Mark.CROSS);
		board.setCellMark(5,Mark.CROSS);
		board.setCellMark(8,Mark.CROSS);
		boolean result = analyzer.isVertical();
		assertEquals(true, result);
	}
	
	@Test
	void isDiagonal() {
		Board board = new Board();
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		board.setCellMark(2,Mark.CROSS);
		board.setCellMark(4,Mark.CROSS);
		board.setCellMark(6,Mark.CROSS);
		boolean result = analyzer.isDiagonal();
		assertEquals(true, result);
	}
	

}
