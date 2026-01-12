package step2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (i < 2) {
            System.out.print("첫번째 숫자를 입력하세요: ");
            int a = sc.nextInt();

            System.out.print("두번째 숫자를 입력하세요: ");
            int b = sc.nextInt();

            System.out.print("사칙연산을 입력하세요: ");
            char op = sc.next().charAt(0);

            // 결과 받기
            int result = calculator.calculator(a, b, op);
            System.out.println("결과 = " + +result);

            // 종료안내
            System.out.print("더 진행하시겠습니까? (exit 입력 시 종료): ");
            String exit = sc.next();

            if (exit.equals("exit"))
                i = 2;

        }



    }



}
