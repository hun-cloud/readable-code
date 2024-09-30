package cleancode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SampleTest {

    @Test
    void sample() {
        // given
        int a = 1;
        int b = 2;

        // when
        int sum = a + b;

        // then
        assertThat(sum).isEqualTo(3);
    }

    @Test
    void test2() {
        String[][] arrs = {{"a", "b", "c"}, {"a", "b", "c"}, {"a", "b", "c"}};


    }

}
