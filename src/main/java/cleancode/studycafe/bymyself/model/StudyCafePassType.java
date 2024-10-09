package cleancode.studycafe.bymyself.model;

import java.util.Arrays;
import java.util.Optional;

public enum StudyCafePassType {

    HOURLY("시간 단위 이용권", 1),
    WEEKLY("주 단위 이용권", 2),
    FIXED("1인 고정석", 3);

    private final String description;
    private final int value;

    StudyCafePassType(String description, int value) {
        this.description = description;
        this.value = value;
    }

    public static Optional<StudyCafePassType> getStudyCafePassTypeByValue(String userInput) {
        return Arrays.stream(StudyCafePassType.values())
                .filter(passType -> passType.value == Integer.valueOf(userInput))
                .findFirst();
    }

    public boolean isHOURLY() {
        return this == StudyCafePassType.HOURLY;
    }

    public boolean isFixed() {
        return this == StudyCafePassType.FIXED;
    }
}
