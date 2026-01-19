package step1;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    static void main() {

        // 스캐너 입력
        Scanner sc = new Scanner(System.in);
        String exit = ""; // exit 입력 시 종료

        // 반복문 사용
        while (!exit.equals("exit")) { // exit가 아닐 때 반복
            // 숫자값 입력받기
            System.out.print("첫번째 숫자를 입력하세요: ");
            int num1 = Integer.parseInt(sc.nextLine());

            // 0을 포함한 양의 정수값만 입력받기
            if(num1 < 0) {
                System.out.println("0을 포함한 양의 정수만 입력 가능합니다");
                return;
            }

            System.out.print("두번째 숫자를 입력하세요: ");
            int num2 = Integer.parseInt(sc.nextLine());

            if(num2 < 0) {
                System.out.println("0을 포함한 양의 정수만 입력 가능합니다");
                return;
            }

            System.out.println("num1 :"+ num1 + "num2:" + num2);

            // 사칙연산 기호 입력받기
            System.out.print("사칙연산을 입력하세요(+, -, *, /): ");
            char charbox = sc.nextLine().charAt(0);

            int result = 0;

            switch (charbox) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> {
                    // 연산 오류 (0으로 나눌 수 없음)
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다");
                        return;
                    }
                    result = num1 / num2;
                }

                    // 입력한 값이 연산기호가 아닌 경우
                default -> {
                    System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
                    return;
                    }
            }

            System.out.println("결과 ="+ result);
            System.out.println("종료를 원하면 exit 입력");
            exit = sc.nextLine();

            }


        }


    }


