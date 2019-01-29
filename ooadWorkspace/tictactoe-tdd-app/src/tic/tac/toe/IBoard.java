package tic.tac.toe;

public interface IBoard {

	boolean isHorizontal();

	boolean isVertical();

	boolean isDiagonal();

	Result isWon();

}