package baseball;

import static baseball.Constant.RESTART;

public class ReStartOrEnd {
    private String input;

    private ReStartOrEnd(String input) {
        this.input = input;
    }

    public static ReStartOrEnd from(String input) {
        return new ReStartOrEnd(input);
    }

    public boolean isReStart() {
        return input.equals(RESTART);
    }

}
