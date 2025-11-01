package baseball;

public class Constant {

    // Ball
    public static final int BALL_MIN = 1;
    public static final int BALL_MAX = 9;
    public static final int BALL_SIZE = 3;
    public static final String NUM_INPUT_MESSAGE = "숫자를 입력해주세요 : ";

    // 게임 결과
    public static final String NOTHING_MESSAGE = "낫싱";
    public static final String BALL_MESSAGE = "볼";
    public static final String STRIKE_MESSAGE = "스트라이크";
    public static final String SUCCESS_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    // 게임 재시작 / 게임 종료
    public static final String RESTART = "1";
    public static final String END = "2";
    public static final String RESTART_OR_END_INPUT_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    // error 메시지
    public static final String ERROR_NOT_NUMERIC = "숫자만 입력할 수 있습니다.";
    public static final String ERROR_INVALID_LENGTH = BALL_SIZE + "자리 수만 입력할 수 있습니다.";
    public static final String ERROR_OUT_OF_RANGE = BALL_MIN + " ~ " + BALL_MAX + " 숫자만 입력할 수 있습니다.";
    public static final String ERROR_NOT_UNIQUE = "서로 다른 " + BALL_SIZE + "자리를 수를 입력해야 합니다.";
    public static final String ERROR_INVALID_RESTART_OR_END = "1(재시작) 또는 2(종료)만 입력할 수 있습니다.";

}
