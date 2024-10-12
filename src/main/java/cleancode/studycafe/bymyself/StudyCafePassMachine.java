package cleancode.studycafe.bymyself;

import cleancode.studycafe.bymyself.exception.AppException;
import cleancode.studycafe.bymyself.io.*;
import cleancode.studycafe.bymyself.machine.Machine;
import cleancode.studycafe.bymyself.model.*;


import java.util.Optional;

public class StudyCafePassMachine implements Machine {

    private final InputHandler inputHandler;
    private final OutputHandler outputHandler;
    private final FileHandler fileHandler;

    public StudyCafePassMachine(InputHandler inputHandler, OutputHandler outputHandler, FileHandler fileHandler) {
        this.inputHandler = inputHandler;
        this.outputHandler = outputHandler;
        this.fileHandler = fileHandler;
    }

    @Override
    public void run() {
        try {
            while (true) {
                outputHandler.showWelcomeMessage();
                outputHandler.showAnnouncement();

                outputHandler.askPassTypeSelection();
                StudyCafePassType studyCafePassType = inputHandler.getPassTypeSelectingUserAction();
                StudyCafePasses studyCafePasses = fileHandler.readStudyCafePasses();

                StudyCafePasses passes = studyCafePasses.getCafePassesByCafePassType(studyCafePassType);
                outputHandler.showPassListForSelection(passes);
                StudyCafePass selectedPass = inputHandler.getSelectPass(passes);

                if (studyCafePassType.isFixed()) {

                    StudyCafeLockerPasses lockerPasses = fileHandler.readLockerPasses();

                    Optional<StudyCafeLockerPass> lockerPassOpt = lockerPasses
                            .getStudyCafeLockerPassBySelectedPass(selectedPass);

                    lockerPassOpt.ifPresent(lockerPass -> {
                        outputHandler.askLockerPass(lockerPass);

                        if (inputHandler.getLockerSelection()) {
                            outputHandler.showPassOrderSummary(selectedPass, lockerPass);
                        }
                    });
                    continue;
                }

                outputHandler.showPassOrderSummary(selectedPass, null);
            }

        } catch (AppException e) {
            outputHandler.showSimpleMessage(e.getMessage());
        } catch (Exception e) {
            outputHandler.showSimpleMessage("알 수 없는 오류가 발생했습니다.");
        }
    }

}
