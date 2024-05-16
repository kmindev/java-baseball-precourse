package baseball;

public class Validator {
    private static final int MIN = 1;
    private static final int MAX = 9;
    private static final int SIZE = 3;
    private static final String START = "1";
    private static final String END = "2";

    private static final String ERROR_NOT_NUMERIC = "숫자만 입력할 수 있습니다.";
    private static final String ERROR_INVALID_LENGTH = SIZE + "자리 수만 입력할 수 있습니다.";
    private static final String ERROR_OUT_OF_RANGE = MIN + " ~ " + MAX + " 숫자만 입력할 수 있습니다.";
    private static final String ERROR_NOT_UNIQUE = "서로 다른 " + SIZE + "자리를 수를 입력해야 합니다.";
    private static final String ERROR_INVALID_START_OR_END = "1(재시작) 또는 2(종료)만 입력할 수 있습니다.";

    public static void validateNum(String input) {
        if (!isNumeric(input)) {
            throw new IllegalArgumentException(ERROR_NOT_NUMERIC);
        }

        if (input.length() != SIZE) {
            throw new IllegalArgumentException(ERROR_INVALID_LENGTH);
        }

        if (!isNumericInRange(input)) {
            throw new IllegalArgumentException(ERROR_OUT_OF_RANGE);
        }

        if (!isUniqueNumber(input)) {
            throw new IllegalArgumentException(ERROR_NOT_UNIQUE);
        }
    }

    public static void validateStartOrRestart(String input) {
        if (!input.equals(START) && !input.equals(END)) {
            throw new IllegalArgumentException(ERROR_INVALID_START_OR_END);
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
            if (num < MIN || num > MAX) {
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
