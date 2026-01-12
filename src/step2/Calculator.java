package step2;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> names = new ArrayList<>();

    public int calculator(int a, int b, char op) {
        int result = 0;

        switch (op) {
            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;

            case '*':
                result = a * b;
                break;

            case '/':
                if (b == 0) {
                    System.out.println("b에 0을 입력할 수 없습니다");
                    return 0;
                }
                result = a / b;
                break;

            default:
                System.out.println("잘못된 연산자 입니다.");
                return 0;

        }

        names.add(result);
        return result;
    }

    public ArrayList<Integer> getResult() {
        return names;
    }


}

