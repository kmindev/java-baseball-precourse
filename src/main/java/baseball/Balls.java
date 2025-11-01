package baseball;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Balls {
    private List<Integer> balls;

    private Balls(List<Integer> balls) {
        this.balls = balls;
    }

    public static Balls from(String userBalls) {
        return new Balls(Arrays.stream(userBalls.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));
    }

    public static Balls from(List<Integer> computerBalls) {
        return new Balls(computerBalls);
    }

    public List<Integer> getBalls() {
        return this.balls;
    }

    @Override
    public String toString() {
        return this.balls.toString();
    }
    
}
