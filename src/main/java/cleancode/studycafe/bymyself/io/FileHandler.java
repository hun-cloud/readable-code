package cleancode.studycafe.bymyself.io;

import cleancode.studycafe.bymyself.model.StudyCafeLockerPasses;
import cleancode.studycafe.bymyself.model.StudyCafePasses;

public interface FileHandler {
    StudyCafePasses readStudyCafePasses();

    StudyCafeLockerPasses readLockerPasses();
}
