package cleancode.minesweeper.asis.io;

import cleancode.minesweeper.asis.position.CellPosition;
import cleancode.minesweeper.asis.user.UserAction;

public interface InputHandler {
    String getUserInput();

    UserAction getUserActionFromUser();
    CellPosition getCellPositionFromUser();
}
