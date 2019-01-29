package tic.tac.toe;

public class Board implements IResultAnalyzer {
	private Cell[] cell = new Cell[9];

	public Board() {
		for (int index = 0; index < cell.length; index++) {
			cell[index] = new Cell();
		}
	}

	@Override
	public void setCellMark(int index, Mark mark) {
		if (index < 0 || index > 8) {
			throw new RuntimeException("Enter valid Index");
		}
		cell[index].setMark(mark);
	}

	@Override
	public Mark getCellMark(int index) {
		if (index < 0 || index > 8) {
			throw new RuntimeException("Enter valid Index");
		}
		return cell[index].getMark();
	}

	@Override
	public Cell[] getCell() {
		return cell;
	}

	@Override
	public boolean isEmpty() {
		for (int index = 0; index < cell.length; index++) {
			if (cell[index].getMark() == Mark.NAUGHT || cell[index].getMark() == Mark.CROSS) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isFull() {
		for (int index = 0; index < cell.length; index++) {
			if (cell[index].getMark() == Mark.EMPTY) {
				return false;
			}
		}
		return true;
	}

}
