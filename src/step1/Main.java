package step1;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (i < 2) {
            System.out.print("첫번째 숫자를 입력하세요: ");
            int num = Integer.parseInt(sc.nextLine());
            System.out.println("a: " + num);

            System.out.print("두번째 숫자를 입력하세요: ");
            int num2 = Integer.parseInt(sc.nextLine());
            System.out.println("b: " + num2);

            System.out.print("사칙연산을 입력하세요(+, -, *, /): ");
            char charbox = sc.nextLine().charAt(0);

            int result = 0;

            int sum = num + num2;
            int sub = num - num2;
            int mul = num * num2;

            switch (charbox) {
                case '+':
                    System.out.println("a+b= " + sum);
                    break;

                case '-':
                    System.out.println("a-b= " + sub);
                    break;

                case '*':
                    System.out.println("a*b= " + mul);
                    break;

                case '/':
                    if (num2 == 0) {
                        System.out.println("b에 0을 입력할 수 없습니다. 다시 입력해주세요.");
                    } else {
                        int div = num / num2;
                        System.out.println("a/b= " + div);
                    }
                    break;

                default:
                    System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
            }

        }


    }

}
