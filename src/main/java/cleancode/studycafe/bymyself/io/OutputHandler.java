package cleancode.studycafe.bymyself.io;

import cleancode.studycafe.bymyself.model.StudyCafeLockerPass;
import cleancode.studycafe.bymyself.model.StudyCafePass;
import cleancode.studycafe.bymyself.model.StudyCafePasses;

public interface OutputHandler {
    void showWelcomeMessage();

    void showAnnouncement();

    void askPassTypeSelection();

    void showPassListForSelection(StudyCafePasses passes);

    void askLockerPass(StudyCafeLockerPass lockerPass);

    void showPassOrderSummary(StudyCafePass selectedPass, StudyCafeLockerPass lockerPass);

    void showSimpleMessage(String message);
}
