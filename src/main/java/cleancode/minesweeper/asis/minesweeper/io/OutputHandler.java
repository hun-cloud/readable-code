package cleancode.minesweeper.asis.minesweeper.io;

import cleancode.minesweeper.asis.minesweeper.board.GameBoard;
import cleancode.minesweeper.asis.minesweeper.exception.GameException;

public interface OutputHandler {
    void showGameStartComments();

    void showBoard(GameBoard board);

    void showGameWinningComment();

    void showGameLosingComment();

    void showCommentForSelectingCell();

    void showCommentForUserAction();

    void showExceptionMessage(GameException e);

    void showSimpleMessage(String message);

    void showCommentWrongNumber();
}
