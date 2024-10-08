package cleancode.minesweeper.asis.io;

import cleancode.minesweeper.asis.GameBoard;
import cleancode.minesweeper.asis.GameException;

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
