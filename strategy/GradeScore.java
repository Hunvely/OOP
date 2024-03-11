package strategy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

enum Grade {
    A(a -> a == 10 || a == 9),
    B(a -> a == 8),
    C(a -> a == 7),
    D(a -> a == 6),
    F(a -> a <= 5);

    private final Predicate<Integer> predicate;

    Grade(Predicate<Integer> predicate) {
        this.predicate = predicate;
    }

    static Grade getScore(int score) {
        return Arrays.stream(values())
                .filter(o -> o.predicate.test(score / 10))
                .findAny().orElseThrow(() -> new IllegalArgumentException("올바른 값이 아닙니다."));
    }
}

public class GradeScore {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Score : ");
        System.out.println(Grade.getScore(input.nextInt()));
    }
}
