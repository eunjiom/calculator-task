package step1;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요: ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("a: " + num);

        System.out.print("두번째 숫자를 입력하세요: ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.println("b: " + num2);

        System.out.print("사칙연산을 입력하세요(+, -, *, /): ");
        char charbox = sc.nextLine().charAt(0);


    }
}
