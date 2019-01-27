package tic.tac.toe.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import tic.tac.toe.Cell;
import tic.tac.toe.Mark;

class CellTest {

	@Test
	void MarkChecker() {
		Cell cell = new Cell();
		cell.setMark(Mark.NAUGHT);
		Mark result = cell.getMark();
		assertEquals(Mark.NAUGHT,result);
	}
	
	void cellEmpty() {
		Cell cell = new Cell();
		cell.setMark(Mark.EMPTY);
		Mark result = cell.getMark();
		assertEquals(Mark.EMPTY,result);
	}

}
