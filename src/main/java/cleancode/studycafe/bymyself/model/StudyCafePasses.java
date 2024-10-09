package cleancode.studycafe.bymyself.model;

import java.util.List;

public class StudyCafePasses {
    private final List<StudyCafePass> studyCafePasses;

    private StudyCafePasses(List<StudyCafePass> studyCafePasses) {
        this.studyCafePasses = studyCafePasses;
    }

    public static StudyCafePasses of(List<StudyCafePass> studyCafePasses) {
        return new StudyCafePasses(studyCafePasses);
    }

    public StudyCafePasses getCafePassesByCafePassType(StudyCafePassType studyCafePassType) {
        List<StudyCafePass> passes = studyCafePasses.stream()
                .filter(studyCafePass -> studyCafePass.getPassType() == studyCafePassType)
                .toList();

        return StudyCafePasses.of(passes);
    }

    public List<StudyCafePass> getStudyCafePasses() {
        return studyCafePasses;
    }

    public int getSize() {
        return studyCafePasses.size();
    }

    public StudyCafePass get(int index) {
        return studyCafePasses.get(index);
    }
}
