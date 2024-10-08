package cleancode.studycafe.bymyself.io;

import cleancode.studycafe.bymyself.model.StudyCafePass;
import cleancode.studycafe.bymyself.model.StudyCafePassType;

import java.util.List;

public interface InputHandler {

    StudyCafePassType getPassTypeSelectingUserAction();

    StudyCafePass getSelectPass(List<StudyCafePass> passes);

    boolean getLockerSelection();
}
