package baseball;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class User {

    public List<Integer> inputNum() {
        System.out.print("숫자를 입력해주세요 : ");
        String input = readLine();

        Validator.validateNum(input);

        return Arrays.stream(input.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public int inputStartOrEnd() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = readLine();

        Validator.validateStartOrRestart(input);

        return Integer.parseInt(input);
    }
    
}
