package baseball;

import static baseball.Constant.*;

public class Validator {

    public static void validateNum(String input) {
        if (!isNumeric(input)) {
            throw new IllegalArgumentException(ERROR_NOT_NUMERIC);
        }

        if (input.length() != BALL_SIZE) {
            throw new IllegalArgumentException(ERROR_INVALID_LENGTH);
        }

        if (!isNumericInRange(input)) {
            throw new IllegalArgumentException(ERROR_OUT_OF_RANGE);
        }

        if (!isUniqueNumber(input)) {
            throw new IllegalArgumentException(ERROR_NOT_UNIQUE);
        }
    }

    public static void validateRestartOrEnd(String input) {
        if (!input.equals(RESTART) && !input.equals(END)) {
            throw new IllegalArgumentException(ERROR_INVALID_RESTART_OR_END);
        }
    }

    private static boolean isUniqueNumber(String input) {
        return input.charAt(0) != input.charAt(1) &&
                input.charAt(0) != input.charAt(2) &&
                input.charAt(1) != input.charAt(2);
    }

    private static boolean isNumericInRange(String input) {
        for (char numCh : input.toCharArray()) {
            int num = Character.getNumericValue(numCh);
            if (num < BALL_MIN || num > BALL_MAX) {
                return false;
            }
        }
        return true;
    }

    private static boolean isNumeric(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
