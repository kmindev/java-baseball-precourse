package baseball;

import static baseball.Constant.NUM_INPUT_MESSAGE;
import static baseball.Constant.RESTART_OR_END_INPUT_MESSAGE;
import static camp.nextstep.edu.missionutils.Console.readLine;

public class User {

    public Balls inputNum() {
        System.out.print(NUM_INPUT_MESSAGE);
        String input = readLine();

        Validator.validateNum(input);

        return Balls.from(input);
    }

    public ReStartOrEnd inputStartOrEnd() {
        System.out.println(RESTART_OR_END_INPUT_MESSAGE);
        String input = readLine();

        Validator.validateRestartOrEnd(input);

        return ReStartOrEnd.from(input);
    }

}
