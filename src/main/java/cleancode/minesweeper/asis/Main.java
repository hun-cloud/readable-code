package cleancode.minesweeper.asis;

import java.util.concurrent.Flow;
import java.util.function.Consumer;

public class Main {

    public static Consumer<String> hello() {
        return (t) -> {
            System.out.println(t);
        };
    }

    public static void main(String[] args) {
        Consumer<String> c = hello();
        c.accept("hello world");
    }
}
