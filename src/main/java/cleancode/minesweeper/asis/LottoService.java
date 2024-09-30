package cleancode.minesweeper.asis;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class LottoService {
    private static final int LOTTO_NUMBERS_SIZE = 6;

    public void createLottoNumber() {
        List<Integer> lottoNumbers = createNonDuplicateNumbers();
        validateSize(lottoNumbers);
        validateDuplicate(lottoNumbers);
    }

    private void validateDuplicate(List<Integer> lottoNumbers) {
        Set<Integer> nonDuplicateNumbers = new HashSet<>(lottoNumbers);
        if (nonDuplicateNumbers.size() != LOTTO_NUMBERS_SIZE) {
            throw new IllegalStateException("로또 번호들은 중복될 수 없습니다.");
        }
    }

    private void validateSize(List<Integer> lottoNumbers) {
        if (lottoNumbers.size() != LOTTO_NUMBERS_SIZE) {
            throw new IllegalStateException("로또 번호는 6개만 가능합니다.");
        }
    }

    private List<Integer> createNonDuplicateNumbers() {
        return new Random().ints(1, 46)
                .distinct()
                .limit(6)
                .boxed()
                .collect(Collectors.toList());
    }
}
