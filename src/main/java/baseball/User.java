package baseball;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static baseball.Constant.NUM_INPUT_MESSAGE;
import static baseball.Constant.RESTART_OR_END_INPUT_MESSAGE;
import static camp.nextstep.edu.missionutils.Console.readLine;

public class User {

    public List<Integer> inputNum() {
        System.out.print(NUM_INPUT_MESSAGE);
        String input = readLine();

        Validator.validateNum(input);

        return Arrays.stream(input.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public int inputStartOrEnd() {
        System.out.println(RESTART_OR_END_INPUT_MESSAGE);
        String input = readLine();

        Validator.validateStartOrRestart(input);

        return Integer.parseInt(input);
    }

}
