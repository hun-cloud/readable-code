package cleancode.minesweeper.asis.minesweeper.board.cell;

public interface Cell {

    boolean isLandMine();

    boolean hasLandMineCount();

    void flag();

    void open();

    boolean isOpened();

    boolean isChecked();

    CellSnapshot getSnapshot();
}
