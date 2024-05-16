package baseball;

public class BaseBallGame {
    private static final Computer computer;
    private static final Referee referee;
    private static final User user;

    static {
        computer = new Computer();
        referee = new Referee();
        user = new User();
    }

    public static void run() {
        progress();
    }

    private static void progress() {
        Balls computerBalls = computer.generateNumber();
        System.out.println(computerBalls);

        boolean is3Strike = false;

        while (!is3Strike) {
            Balls userBalls = user.inputNum();

            is3Strike = referee.judge(userBalls, computerBalls);
        }

        ReStartOrEnd restartOrEnd = user.inputStartOrEnd();

        if (restartOrEnd.isReStart()) {
            progress();
        }
    }

}
