package cleancode.minesweeper.asis.minesweeper.io;

import cleancode.minesweeper.asis.minesweeper.board.position.CellPosition;
import cleancode.minesweeper.asis.minesweeper.user.UserAction;

public interface InputHandler {
    String getUserInput();

    UserAction getUserActionFromUser();
    CellPosition getCellPositionFromUser();
}
