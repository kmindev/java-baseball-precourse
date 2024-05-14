package baseball;

public class Validator {
    public static void validateNum(String input) {
        if (!isNumeric(input)) {
            throw new IllegalArgumentException("숫자만 입력할 수 있습니다.");
        }

        if (input.length() != 3) {
            throw new IllegalArgumentException("3자리 수만 입력할 수 있습니다.");
        }

        if (!isNumericInRange(input)) {
            throw new IllegalArgumentException("1 ~ 9 숫자만 입력할 수 있습니다.");
        }

        if (!isUniqueNumber(input)) {
            throw new IllegalArgumentException("서로 다른 3자리를 수를 입력해야 합니다.");
        }

    }

    private static boolean isUniqueNumber(String input) {
        return input.charAt(0) != input.charAt(1) &&
                input.charAt(0) != input.charAt(2) &&
                input.charAt(1) != input.charAt(2);
    }

    private static boolean isNumericInRange(String input) {
        for (char num : input.toCharArray()) {
            if (num < '1' || num > '9') {
                return false;
            }
        }
        return true;
    }

    public static void validateStartOrRestart(String input) {
        if (!isNumeric(input)) {
            throw new IllegalArgumentException("숫자만 입력할 수 있습니다.");
        }

        if (!input.equals("1") && !input.equals("2")) {
            throw new IllegalArgumentException("1(재시작) 또는 2(종료)만 입력할 수 있습니다.");
        }
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
