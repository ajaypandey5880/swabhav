package tic.tac.toe;

public class ResultAnalyzer implements IBoard {
	private IResultAnalyzer board;

	public ResultAnalyzer(IResultAnalyzer board) {
		this.board = board;
	}

	
	@Override
	public boolean isHorizontal() {
		for (int index = 0; index < board.getCell().length; index = index + 3) {
			if (board.getCellMark(index) == Mark.CROSS && board.getCellMark(index + 1) == Mark.CROSS
					&& board.getCellMark(index + 2) == Mark.CROSS) {
				return true;
			}
			if (board.getCellMark(index) == Mark.NAUGHT && board.getCellMark(index + 1) == Mark.NAUGHT
					&& board.getCellMark(index + 2) == Mark.NAUGHT) {
				return true;
			}
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see tic.tac.toe.IBoard#isVertical()
	 */
	@Override
	public boolean isVertical() {
		for (int index = 0; index < 3; index++) {
			if (board.getCellMark(index) == Mark.CROSS && board.getCellMark(index + 3) == Mark.CROSS
					&& board.getCellMark(index + 6) == Mark.CROSS) {
				return true;
			}
			if (board.getCellMark(index) == Mark.NAUGHT && board.getCellMark(index + 3) == Mark.NAUGHT
					&& board.getCellMark(index + 6) == Mark.NAUGHT) {
				return true;
			}
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see tic.tac.toe.IBoard#isDiagonal()
	 */
	@Override
	public boolean isDiagonal() {
		if (board.getCellMark(0) == Mark.CROSS && board.getCellMark(4) == Mark.CROSS
				&& board.getCellMark(8) == Mark.CROSS
				|| board.getCellMark(2) == Mark.CROSS && board.getCellMark(4) == Mark.CROSS
						&& board.getCellMark(6) == Mark.CROSS) {
			return true;
		}
		if (board.getCellMark(0) == Mark.NAUGHT && board.getCellMark(4) == Mark.NAUGHT
				&& board.getCellMark(8) == Mark.NAUGHT
				|| board.getCellMark(2) == Mark.NAUGHT && board.getCellMark(4) == Mark.NAUGHT
						&& board.getCellMark(6) == Mark.NAUGHT) {
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see tic.tac.toe.IBoard#isWon()
	 */
	@Override
	public Result isWon() {
		if (isHorizontal() || isVertical() || isDiagonal()) {
			return Result.WON;
		}
		if (board.isFull()) {
			return Result.DRAW;
		}
		return Result.IN_PROGRESS;

	}

}
