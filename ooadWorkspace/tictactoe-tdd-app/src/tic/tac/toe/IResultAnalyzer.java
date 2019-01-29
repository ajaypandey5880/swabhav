package tic.tac.toe;

public interface IResultAnalyzer {

	void setCellMark(int index, Mark mark);

	Mark getCellMark(int index);

	Cell[] getCell();

	boolean isEmpty();

	boolean isFull();

}