package baseball;

import java.util.List;

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
        List<Integer> computerNum = computer.generateNumber();
        System.out.println(computerNum);

        boolean is3Strike = false;

        while (!is3Strike) {
            List<Integer> userNum = user.inputNum();

            is3Strike = referee.judge(userNum, computerNum);
        }

        int startOrEnd = user.inputStartOrEnd();

        if (startOrEnd == 1) {
            progress();
        }
    }

}
