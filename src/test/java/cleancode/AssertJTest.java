package cleancode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJTest {

    @Test
    @DisplayName("AssertJ문법을 공부해보자")
    void 테스트_메서드명() {

        assertThat(123).isEqualTo(123);



    }
}
