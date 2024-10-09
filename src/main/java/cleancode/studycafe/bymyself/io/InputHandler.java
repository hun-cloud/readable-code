package cleancode.studycafe.bymyself.io;

import cleancode.studycafe.bymyself.model.StudyCafePass;
import cleancode.studycafe.bymyself.model.StudyCafePassType;
import cleancode.studycafe.bymyself.model.StudyCafePasses;

public interface InputHandler {

    StudyCafePassType getPassTypeSelectingUserAction();

    StudyCafePass getSelectPass(StudyCafePasses passes);

    boolean getLockerSelection();
}
