package step3;

import java.util.Scanner;

public class Main {

    static void main() {

        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator calculator = new ArithmeticCalculator();
        String exit = ""; // exit 입력 시 종료

        // 반복문 사용
        while (!exit.equals("exit")) { // exit가 아닐 때 반복
            System.out.print("첫번째 숫자를 입력하세요: ");
            // 여러가지 타입을 받기 위해 문자열 사용
            String input1 = sc.nextLine();
            // 소수 점이 있으면 더블타입, 아니면 int 타입
            Number a = input1.contains(".") ? Double.parseDouble(input1) : Integer.parseInt(input1);

            System.out.print("두번째 숫자를 입력하세요: ");
            String input2 = sc.nextLine();
            Number b = input2.contains(".") ? Double.parseDouble(input2) : Integer.parseInt(input2);


            System.out.print("사칙연산을 입력하세요(+, -, *, /): ");
            char op = sc.nextLine().charAt(0);
            OperatorType operatorType = OperatorType.fromchar(op);

            double result = calculator.calculator(a, b, operatorType);

            System.out.println("결과 =" + result);

            System.out.println("현재 저장된 결과" + calculator.getResult());

            System.out.println("가장 먼저 저장된 결과를 삭제하시겠습니까? yes or no");
            String answer = sc.nextLine();
            if ("yes".equals(answer)) {
                calculator.removeResult();
                System.out.println("가장 먼저 저장된 결과 삭제 후: " + calculator.getResult());
            }

            System.out.println("특정 값보다 큰 결과를 조회하시겠습니까? yes or no:");
            String query = sc.nextLine();
            if("yes".equals(query)){
                System.out.println("기준 값을 입력하세요: ");
                double threshold = Double.parseDouble(sc.nextLine());
                System.out.println("기준보다 큰 결과: " +calculator.getResultsGreaterThan(threshold));
            }

            System.out.println("종료를 원하면 exit 입력");
            exit = sc.nextLine();

        }

        System.out.println("계산기 종료");
        sc.close();

    }
}


