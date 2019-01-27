package tic.tac.toe;

public class Board {
	private Cell[] cell = new Cell[9];
	
	public Board() {
		for (int index = 0 ; index < cell.length ; index++) {
			cell[index] = new Cell();
		}
	}

	public void setCellMark(int index, Mark mark) {
		cell[index].setMark(mark);
	}

	public Mark getCellMark(int index) {
		return cell[index].getMark();
	}

	public Cell[] getCell() {
		return cell;
	}

	public boolean isEmpty() {
		for (int index = 0; index < cell.length; index++) {
			if (cell[index].getMark() == Mark.NAUGHT || cell[index].getMark() == Mark.CROSS) {
				return false;
			}
		}
		return true;
	}

	public boolean isFull() {
		for (int index = 0; index < cell.length; index++) {
			if (cell[index].getMark() == Mark.EMPTY) {
				return false;
			}
		}
		return true;
	}
	
	

}
