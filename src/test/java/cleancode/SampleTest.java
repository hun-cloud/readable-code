package cleancode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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


    class LottoTicket {
        final List<String> tickets;

        public LottoTicket(List<String> tickets) {
            this.tickets = tickets;
        }
    }

    @Test
    void suppleTest() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);


    }
}
