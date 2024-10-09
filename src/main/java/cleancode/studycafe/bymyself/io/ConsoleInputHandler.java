package cleancode.studycafe.bymyself.io;

import cleancode.studycafe.bymyself.model.StudyCafePass;
import cleancode.studycafe.bymyself.model.StudyCafePassType;
import cleancode.studycafe.bymyself.model.StudyCafePasses;
import cleancode.studycafe.bymyself.util.Validator;

import java.util.Scanner;

public class ConsoleInputHandler implements InputHandler{

    private static final Scanner SCANNER = new Scanner(System.in);

    @Override
    public StudyCafePassType getPassTypeSelectingUserAction() {
        String userInput = SCANNER.nextLine();

        Validator.checkInteger(userInput);

        return StudyCafePassType.getStudyCafePassTypeByValue(userInput)
                .orElseThrow(() -> new IllegalArgumentException("잘못된 입력입니다."));
    }

    @Override
    public StudyCafePass getSelectPass(StudyCafePasses passes) {
        String userInput = SCANNER.nextLine();
        int selectedIndex = Integer.parseInt(userInput) - 1;
        return passes.get(selectedIndex);
    }

    @Override
    public boolean getLockerSelection() {
        String userInput = SCANNER.nextLine();
        return "1".equals(userInput);
    }

}
