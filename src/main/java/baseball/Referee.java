package baseball;

import java.util.List;

public class Referee {

    private static final int SIZE = 3;

    /**
     * @param userNum
     * @param computerNum
     * @return 3스트라이크이면 true, 그 외에는 false를 반환한다.
     */
    public boolean judge(List<Integer> userNum, List<Integer> computerNum) {
        int ballCount = 0;
        int strikeCount = 0;

        for (int i = 0; i < SIZE; i++) {
            if (isStrike(userNum.get(i), computerNum.get(i))) {
                strikeCount++;
                continue;
            }

            if (isBall(userNum.get(i), computerNum)) {
                ballCount++;
            }
        }

        printResult(ballCount, strikeCount);

        return strikeCount == SIZE;
    }

    private void printResult(int ballCount, int strikeCount) {
        StringBuilder result = new StringBuilder();

        if (ballCount == 0 && strikeCount == 0) {
            result.append("낫싱");
        } else {
            if (ballCount > 0) {
                result.append(String.format("%d볼 ", ballCount));
            }

            if (strikeCount > 0) {
                result.append(String.format("%d스트라이크", strikeCount));
            }

            if (strikeCount == SIZE) {
                result.append("\n3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            }
        }

        System.out.println(result);
    }

    private boolean isBall(int userNum, List<Integer> computerNums) {
        for (int computeNum : computerNums) {
            if (userNum == computeNum) {
                return true;
            }
        }

        return false;
    }

    private boolean isStrike(int userNum, int computerNum) {
        return userNum == computerNum;
    }
}
