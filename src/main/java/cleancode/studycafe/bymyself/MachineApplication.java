package cleancode.studycafe.bymyself;

import cleancode.studycafe.bymyself.io.*;
import cleancode.studycafe.bymyself.machine.Machine;

public class MachineApplication {

    public static void main(String[] args) {
        InputHandler inputHandler = new ConsoleInputHandler();
        OutputHandler outputHandler = new ConsoleOutputHandler();
        FileHandler fileHandler = new StudyCafeFileHandler();

        Machine machine = new StudyCafePassMachine(inputHandler, outputHandler, fileHandler);
        machine.run();
    }

}
