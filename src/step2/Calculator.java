package step2;

import java.util.ArrayList;

public class Calculator {

    private final ArrayList<Integer> results = new ArrayList<>();

    public int calculator(int a, int b, char op) {

        int result = 0;

        switch (op) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> {
                if (b == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                result = a / b;
            }

            default -> throw new IllegalArgumentException("잘못된 연산자 입니다.");

        }

        results.add(result);
        return result;

    }

    // getter
    public ArrayList<Integer> getResult() {
        return results;
    }

    public void removeResult() {
        results.remove(0);
    }
}

