package cleancode.minesweeper.asis;

import cleancode.minesweeper.asis.minesweeper.Minesweeper;
import cleancode.minesweeper.asis.minesweeper.config.GameConfig;
import cleancode.minesweeper.asis.minesweeper.gamelevel.VeryBeginner;
import cleancode.minesweeper.asis.minesweeper.io.ConsoleInputHandler;
import cleancode.minesweeper.asis.minesweeper.io.ConsoleOutputHandler;

public class GameApplication {

    public static void main(String[] args) {

        GameConfig gameConfig = new GameConfig(
                new VeryBeginner(),
                new ConsoleInputHandler(),
                new ConsoleOutputHandler()
        );

        Minesweeper minesweeper = new Minesweeper(gameConfig);
        minesweeper.initialize();
        minesweeper.run();
    }
}
