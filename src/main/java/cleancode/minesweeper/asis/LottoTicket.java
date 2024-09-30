package cleancode.minesweeper.asis;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoTicket {
    private static final int LOTTO_NUMBERS_SIZE = 6;

    private final List<Integer> lottoNumbers;

    public LottoTicket(List<Integer> lottoNumbers) {
        validateSize(lottoNumbers);
        validateDuplicate(lottoNumbers);
        this.lottoNumbers = lottoNumbers;
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
}
