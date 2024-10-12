package cleancode.studycafe.bymyself.io;

import cleancode.studycafe.bymyself.model.StudyCafeLockerPass;
import cleancode.studycafe.bymyself.model.StudyCafePass;

import java.util.List;

public interface OutputHandler {
    void showWelcomeMessage();

    void showAnnouncement();

    void askPassTypeSelection();

    void showPassListForSelection(List<StudyCafePass> passes);

    void askLockerPass(StudyCafeLockerPass lockerPass);

    void showPassOrderSummary(StudyCafePass selectedPass, StudyCafeLockerPass lockerPass);

    void showSimpleMessage(String message);
}
