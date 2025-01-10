package com.sample.lv2;

import com.sample.lv2.Calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1. 계산기 실행 | 2. 최근 값 확인 | 3. 종료 ");
            int menu = sc.nextInt();

            if (menu == 1) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();
                sc.nextLine();

                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();
                sc.nextLine();

                System.out.print("사칙연산 선택(+, -, *, /): ");
                String symbol = sc.nextLine();

                int value = cal.calculator(num1, num2, symbol);

                cal.setSaveNum(value);

            } else if (menu == 2) {
                System.out.println(cal.getSaveNum());
                System.out.println("선택 - 1. 메뉴로 돌아가기, 2. 리스트 삭제");
                int option = sc.nextInt();

                if (option == 1) {
                    System.out.println("첫번째 메뉴로 돌아갑니다.");
                    continue;
                } else if (option == 2) {
                    cal.deleteSaveNum();
                    System.out.println("첫번째 데이터 삭제 완료");
                }
            }
        }
    }
}
