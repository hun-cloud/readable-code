package cleancode.studycafe.bymyself;

import cleancode.studycafe.bymyself.exception.AppException;
import cleancode.studycafe.bymyself.io.*;
import cleancode.studycafe.bymyself.machine.Machine;
import cleancode.studycafe.bymyself.model.StudyCafeLockerPass;
import cleancode.studycafe.bymyself.model.StudyCafePass;
import cleancode.studycafe.bymyself.model.StudyCafePassType;

import java.util.List;

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
            outputHandler.showWelcomeMessage();
            outputHandler.showAnnouncement();

            outputHandler.askPassTypeSelection();
            StudyCafePassType studyCafePassType = inputHandler.getPassTypeSelectingUserAction();
            List<StudyCafePass> studyCafePasses = fileHandler.readStudyCafePasses();

            if (studyCafePassType.isHOURLY()) {
                List<StudyCafePass> hourlyPasses = studyCafePasses.stream()
                        .filter(studyCafePass -> studyCafePass.getPassType() == StudyCafePassType.HOURLY)
                        .toList();
                outputHandler.showPassListForSelection(hourlyPasses);
                StudyCafePass selectedPass = inputHandler.getSelectPass(hourlyPasses);
                outputHandler.showPassOrderSummary(selectedPass, null);

            } else if (studyCafePassType == StudyCafePassType.WEEKLY) {
                List<StudyCafePass> weeklyPasses = studyCafePasses.stream()
                        .filter(studyCafePass -> studyCafePass.getPassType() == StudyCafePassType.WEEKLY)
                        .toList();
                outputHandler.showPassListForSelection(weeklyPasses);
                StudyCafePass selectedPass = inputHandler.getSelectPass(weeklyPasses);
                outputHandler.showPassOrderSummary(selectedPass, null);

            } else if (studyCafePassType == StudyCafePassType.FIXED) {
                List<StudyCafePass> fixedPasses = studyCafePasses.stream()
                        .filter(studyCafePass -> studyCafePass.getPassType() == StudyCafePassType.FIXED)
                        .toList();
                outputHandler.showPassListForSelection(fixedPasses);
                StudyCafePass selectedPass = inputHandler.getSelectPass(fixedPasses);

                List<StudyCafeLockerPass> lockerPasses = fileHandler.readLockerPasses();
                StudyCafeLockerPass lockerPass = lockerPasses.stream()
                        .filter(option ->
                                option.getPassType() == selectedPass.getPassType()
                                        && option.getDuration() == selectedPass.getDuration()
                        )
                        .findFirst()
                        .orElse(null);

                boolean lockerSelection = false;
                if (lockerPass != null) {
                    outputHandler.askLockerPass(lockerPass);
                    lockerSelection = inputHandler.getLockerSelection();
                }

                if (lockerSelection) {
                    outputHandler.showPassOrderSummary(selectedPass, lockerPass);
                } else {
                    outputHandler.showPassOrderSummary(selectedPass, null);
                }
            }
        } catch (AppException e) {
            outputHandler.showSimpleMessage(e.getMessage());
        } catch (Exception e) {
            outputHandler.showSimpleMessage("알 수 없는 오류가 발생했습니다.");
        }
    }

}
