package cleancode.studycafe.bymyself.io;

import cleancode.studycafe.bymyself.model.StudyCafeLockerPass;
import cleancode.studycafe.bymyself.model.StudyCafePass;

import java.util.List;

public interface FileHandler {
    List<StudyCafePass> readStudyCafePasses();

    List<StudyCafeLockerPass> readLockerPasses();
}
