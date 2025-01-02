package com.example.calculator;

import java.util.Scanner;

public class calculator1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println();

            int sum = 0;

            System.out.print("첫 번째 숫자를 입력해 주세요.");
            int num1 = sc.nextInt();
            sc.nextLine();

            System.out.println("사칙연산 기호(+, -, *, /)를 입력해 주세요.(exit 입력시 종료)");
            String c = sc.nextLine();

            if (c.equals("exit")) {
                System.out.println("계산기가 종료됩니다.");
                break;
            }

            System.out.print("두 번째 숫자를 입력해 주세요.");
            int num2 = sc.nextInt();
            sc.nextLine();

            if (c.equals("+")) {
                sum = num1 + num2;
                System.out.println("결과: " + sum);
            }

            if (c.equals("-")) {
                sum = num1 - num2;
                System.out.println("결과: " + sum);
            }

            if (c.equals("*")) {
                sum = num1 * num2;
                System.out.println("결과: " + sum);
            }

            if (c.equals("/")) {
                if(num2 != 0){
                    sum = num1 / num2;
                    System.out.println("결과: " + sum);
                } else {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
            }
        }
    }
}
