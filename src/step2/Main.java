package step2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {

        // 스캐너 입력
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String exit = ""; // exit 입력 시 종료

        // 반복문 사용
        while (!exit.equals("exit")) { // exit가 아닐 때 반복
            // 숫자값 입력받기
            System.out.print("첫번째 숫자를 입력하세요: ");
            int a = Integer.parseInt(sc.nextLine());

            // 0을 포함한 양의 정수값만 입력받기
            if(a < 0) {
                System.out.println("0을 포함한 양의 정수만 입력 가능합니다");
                return;
            }

            System.out.print("두번째 숫자를 입력하세요: ");
            int b = Integer.parseInt(sc.nextLine());

            if(b < 0) {
                System.out.println("0을 포함한 양의 정수만 입력 가능합니다");
                return;
            }

            System.out.println("a:"+ a + "\n b:" + b);

            // 사칙연산 기호 입력받기
            System.out.print("사칙연산을 입력하세요(+, -, *, /): ");
            char op = sc.nextLine().charAt(0);

            int result = calculator.calculator(a, b, op);

            System.out.println("결과 =" + result);

            System.out.println("현재 저장된 결과"+ calculator.getResult());

            System.out.println("가장 먼저 저장된 결과를 삭제하시겠습니까? yes or no");
            String answer = sc.nextLine();
            if("yes".equals(answer)){
                calculator.removeResult();
                System.out.println("가장 먼저 저장된 결과 삭제 후: "+calculator.getResult());
            }

            System.out.println("종료를 원하면 exit 입력");
            exit = sc.nextLine();

        }

        System.out.println("계산기 종료");
        sc.close();

    }


}
