package cleancode.minesweeper.asis;

import cleancode.minesweeper.asis.gamelevel.GameLevel;
import cleancode.minesweeper.asis.gamelevel.VeryBeginner;

public class GameApplication {

    public static void main(String[] args) {
        GameLevel gameLevel = new VeryBeginner();
        Minesweeper minesweeper = new Minesweeper(gameLevel);

        minesweeper.initialize();
        minesweeper.run();
    }
}
