package baseball;

import static baseball.Constant.*;

public class Referee {

    /**
     * @param userBalls
     * @param computerBalls
     * @return 3스트라이크이면 true, 그 외에는 false를 반환한다.
     */
    public boolean judge(Balls userBalls, Balls computerBalls) {
        int ballCount = 0;
        int strikeCount = 0;

        for (int i = 0; i < BALL_SIZE; i++) {
            if (isStrike(userBalls.getBalls().get(i), computerBalls.getBalls().get(i))) {
                strikeCount++;
                continue;
            }

            if (isBall(userBalls.getBalls().get(i), computerBalls)) {
                ballCount++;
            }
        }

        printResult(ballCount, strikeCount);

        return strikeCount == BALL_SIZE;
    }

    private void printResult(int ballCount, int strikeCount) {
        StringBuilder result = new StringBuilder();

        if (ballCount == 0 && strikeCount == 0) {
            result.append(NOTHING_MESSAGE);
        } else {
            if (ballCount > 0) {
                result.append(ballCount).append(BALL_MESSAGE).append(" ");
            }

            if (strikeCount > 0) {
                result.append(strikeCount).append(STRIKE_MESSAGE);
            }

            if (strikeCount == BALL_SIZE) {

                result.append("\n").append(SUCCESS_MESSAGE);
            }
        }

        System.out.println(result);
    }

    private boolean isBall(int userBall, Balls computerBalls) {
        for (int computeNum : computerBalls.getBalls()) {
            if (userBall == computeNum) {
                return true;
            }
        }

        return false;
    }

    private boolean isStrike(int userNum, int computerNum) {
        return userNum == computerNum;
    }

}
