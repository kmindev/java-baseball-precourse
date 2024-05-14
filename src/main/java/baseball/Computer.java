package baseball;


import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Computer {
    private static final int SIZE = 3;
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 9;

    public List<Integer> generateNumber() {
        List<Integer> nums = new ArrayList<>();

        while (nums.size() != SIZE) {
            int randomNum = pickNumberInRange(MIN_VALUE, MAX_VALUE); // n 부터 m 까지 랜덤 수 생성

            if (!nums.contains(randomNum)) {
                nums.add(randomNum);
            }
        }

        return nums;
    }
}
