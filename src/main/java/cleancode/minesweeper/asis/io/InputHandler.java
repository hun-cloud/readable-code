package cleancode.minesweeper.asis.io;

import cleancode.minesweeper.asis.position.CellPosition;

public interface InputHandler {
    String getUserInput();
    CellPosition getCellPositionFromUser();
}
