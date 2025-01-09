package com.example2;

import java.util.Scanner;
@SuppressWarnings("Ignore LoopWarning")

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("계산기 시작");
        Calculator cal = new Calculator();
        // 계산기 시작 or 종료

        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            sc.nextLine();

            System.out.println("사칙연산 선택(+, -, *, /)");
            String option = sc.nextLine();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            switch (option) {
                case "+":
                    AddOperation add = new AddOperation(num1, num2);
                    add.addMethod();

                    break;

                case "-":
                    SubstractOperation sub = new SubstractOperation(num1, num2);
                    sub.subMethod();
                    break;

                case "*":
                    MultiplyOperation multi = new MultiplyOperation(num1, num2);
                    multi.multiMethod();
                    break;

                case "/":
                    DivideOperation divide = new DivideOperation(num1, num2);
                    divide.divideMethod();
                    break;
            } // switch 종료
        } // while 종료
    }
}
