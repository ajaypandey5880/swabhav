package tic.tac.toe.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tic.tac.toe.Board;
import tic.tac.toe.IBoard;
import tic.tac.toe.IResultAnalyzer;
import tic.tac.toe.Mark;
import tic.tac.toe.Result;
import tic.tac.toe.ResultAnalyzer;

class ResultAnalyzerTest {

	@Test
	void isHorizontalFirstLIne() {
		IResultAnalyzer board = new Board();
		IBoard analyzer = new ResultAnalyzer(board);
		board.setCellMark(0,Mark.CROSS);
		board.setCellMark(1,Mark.CROSS);
		board.setCellMark(2,Mark.CROSS);
		boolean result = analyzer.isHorizontal();
		assertEquals(true, result);
	}
	
	@Test
	void isHorizontalSecondLine() {
		IResultAnalyzer board = new Board();
		IBoard analyzer = new ResultAnalyzer(board);
		board.setCellMark(3,Mark.CROSS);
		board.setCellMark(4,Mark.CROSS);
		board.setCellMark(5,Mark.CROSS);
		boolean result = analyzer.isHorizontal();
		assertEquals(true, result);
	}
	
	@Test
	void isHorizontalThirdLIne() {
		IResultAnalyzer board = new Board();
		IBoard analyzer = new ResultAnalyzer(board);
		board.setCellMark(6,Mark.CROSS);
		board.setCellMark(7,Mark.CROSS);
		board.setCellMark(8,Mark.CROSS);
		boolean result = analyzer.isHorizontal();
		assertEquals(true, result);
	}
	
	@Test
	void isVerticalFirstColumn() {
		IResultAnalyzer board = new Board();
		IBoard analyzer = new ResultAnalyzer(board);
		board.setCellMark(0,Mark.CROSS);
		board.setCellMark(3,Mark.CROSS);
		board.setCellMark(6,Mark.CROSS);
		boolean result = analyzer.isVertical();
		assertEquals(true, result);
	}
	
	@Test
	void isVerticalSecondColumn() {
		IResultAnalyzer board = new Board();
		IBoard analyzer = new ResultAnalyzer(board);
		board.setCellMark(1,Mark.CROSS);
		board.setCellMark(4,Mark.CROSS);
		board.setCellMark(7,Mark.CROSS);
		boolean result = analyzer.isVertical();
		assertEquals(true, result);
	}
	
	@Test
	void isVerticalThirdColumn() {
		IResultAnalyzer board = new Board();
		IBoard analyzer = new ResultAnalyzer(board);
		board.setCellMark(2,Mark.CROSS);
		board.setCellMark(5,Mark.CROSS);
		board.setCellMark(8,Mark.CROSS);
		boolean result = analyzer.isVertical();
		assertEquals(true, result);
	}
	
	@Test
	void isDiagonalFirst() {
		IResultAnalyzer board = new Board();
		IBoard analyzer = new ResultAnalyzer(board);
		board.setCellMark(0,Mark.CROSS);
		board.setCellMark(4,Mark.CROSS);
		board.setCellMark(8,Mark.CROSS);
		boolean result = analyzer.isDiagonal();
		assertEquals(true, result);
	}
	
	@Test
	void isDiagonalSecond() {
		IResultAnalyzer board = new Board();
		IBoard analyzer = new ResultAnalyzer(board);
		board.setCellMark(2,Mark.CROSS);
		board.setCellMark(4,Mark.CROSS);
		board.setCellMark(6,Mark.CROSS);
		boolean result = analyzer.isDiagonal();
		assertEquals(true, result);
	}
	
	@Test
	void ResultWin() {
		IResultAnalyzer board = new Board();
		IBoard analyzer = new ResultAnalyzer(board);
		board.setCellMark(2,Mark.CROSS);
		board.setCellMark(4,Mark.CROSS);
		board.setCellMark(6,Mark.CROSS);
		Result result = analyzer.isWon();
		assertEquals(Result.WON, result);
	}
	
	@Test
	void ResullDraw() {
		IResultAnalyzer board = new Board();
		IBoard analyzer = new ResultAnalyzer(board);
		board.setCellMark(0,Mark.CROSS);
		board.setCellMark(2,Mark.CROSS);
		board.setCellMark(3,Mark.CROSS);
		board.setCellMark(5,Mark.CROSS);
		board.setCellMark(7,Mark.CROSS);
		board.setCellMark(1,Mark.NAUGHT);
		board.setCellMark(4,Mark.NAUGHT);
		board.setCellMark(6,Mark.NAUGHT);
		board.setCellMark(8,Mark.NAUGHT);
		Result result = analyzer.isWon();
		assertEquals(Result.DRAW, result);
	}
	
	

}
