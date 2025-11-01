package baseball;


import java.util.ArrayList;
import java.util.List;

import static baseball.Constant.*;
import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Computer {

    public Balls generateNumber() {
        List<Integer> balls = new ArrayList<>();

        while (balls.size() != BALL_SIZE) {
            int randomNum = pickNumberInRange(BALL_MIN, BALL_MAX); // n 부터 m 까지 랜덤 수 생성

            if (!balls.contains(randomNum)) {
                balls.add(randomNum);
            }
        }

        return Balls.from(balls);
    }
}
