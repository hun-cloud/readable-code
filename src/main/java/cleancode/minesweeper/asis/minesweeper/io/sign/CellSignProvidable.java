package cleancode.minesweeper.asis.minesweeper.io.sign;

import cleancode.minesweeper.asis.minesweeper.board.cell.CellSnapshot;

public interface CellSignProvidable {

    boolean supports(CellSnapshot cellSnapshot);

    String provide(CellSnapshot cellSnapshot);

}
