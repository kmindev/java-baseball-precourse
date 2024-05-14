package baseball;

public class Validator {
    private static final char MIN = '1';
    private static final char MAX = '9';
    private static final int SIZE = 3;
    private static final String START = "1";
    private static final String END = "2";

    public static void validateNum(String input) {
        if (!isNumeric(input)) {
            throw new IllegalArgumentException("숫자만 입력할 수 있습니다.");
        }

        if (input.length() != SIZE) {
            throw new IllegalArgumentException("3자리 수만 입력할 수 있습니다.");
        }

        if (!isNumericInRange(input)) {
            throw new IllegalArgumentException("1 ~ 9 숫자만 입력할 수 있습니다.");
        }

        if (!isUniqueNumber(input)) {
            throw new IllegalArgumentException("서로 다른 3자리를 수를 입력해야 합니다.");
        }
    }

    public static void validateStartOrRestart(String input) {
        if (!isNumeric(input)) {
            throw new IllegalArgumentException("숫자만 입력할 수 있습니다.");
        }

        if (!input.equals(START) && !input.equals(END)) {
            throw new IllegalArgumentException("1(재시작) 또는 2(종료)만 입력할 수 있습니다.");
        }
    }

    private static boolean isUniqueNumber(String input) {
        return input.charAt(0) != input.charAt(1) &&
                input.charAt(0) != input.charAt(2) &&
                input.charAt(1) != input.charAt(2);
    }

    private static boolean isNumericInRange(String input) {
        for (char num : input.toCharArray()) {
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
