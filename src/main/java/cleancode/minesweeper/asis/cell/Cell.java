package cleancode.minesweeper.asis.cell;

public interface Cell {

    boolean isLandMine();

    boolean hasLandMineCount();

    void flag();

    void open();

    boolean isOpened();

    boolean isChecked();

    CellSnapshot getSnapshot();
}
