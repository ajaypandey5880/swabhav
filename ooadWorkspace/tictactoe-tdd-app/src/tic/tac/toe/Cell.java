package tic.tac.toe;

public class Cell {
	private Mark mark = Mark.EMPTY;

	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark mark) {
		if (this.mark != Mark.EMPTY) {
			throw new RuntimeException("This index is Already Marked");
		}
		this.mark = mark;

	}

}
