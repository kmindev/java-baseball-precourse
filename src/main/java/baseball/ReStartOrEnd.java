package baseball;

import static baseball.Constant.*;

public class ReStartOrEnd {
    private String input;

    private ReStartOrEnd(String input) {
        validate(input);
        this.input = input;
    }

    public static ReStartOrEnd from(String input) {
        return new ReStartOrEnd(input);
    }

    public boolean isReStart() {
        return input.equals(RESTART);
    }

    public void validate(String input) {
        if (!input.equals(RESTART) && !input.equals(END)) {
            throw new IllegalArgumentException(ERROR_INVALID_RESTART_OR_END);
        }
    }

}
