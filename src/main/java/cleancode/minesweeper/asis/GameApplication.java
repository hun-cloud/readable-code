package cleancode.minesweeper.asis;

import cleancode.minesweeper.asis.config.GameConfig;
import cleancode.minesweeper.asis.gamelevel.GameLevel;
import cleancode.minesweeper.asis.gamelevel.VeryBeginner;
import cleancode.minesweeper.asis.io.ConsoleInputHandler;
import cleancode.minesweeper.asis.io.ConsoleOutputHandler;
import cleancode.minesweeper.asis.io.InputHandler;
import cleancode.minesweeper.asis.io.OutputHandler;

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
