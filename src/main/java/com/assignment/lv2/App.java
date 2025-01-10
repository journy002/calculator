package com.assignment.lv2;

import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("1. 계산기 실행 | 2. 최근 값 확인 | 3. 종료 ");
                int menu = sc.nextInt();
                sc.nextLine(); // 입력 버퍼 초기화

                if (menu == 1) {
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    int num1 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("두 번째 숫자를 입력하세요: ");
                    int num2 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("사칙연산 선택(+, -, *, /): ");
                    String symbol = sc.nextLine();

                    // 입력값 검증
                    if (!"+".equals(symbol) && !"-".equals(symbol) && !"*".equals(symbol) && !"/".equals(symbol)) {
                        System.out.println("유효하지 않은 연산자입니다. 다시 입력하세요.");
                        continue;
                    }

                    int value = cal.calculator(num1, num2, symbol);
                    cal.setSaveNum(value);

                } else if (menu == 2) {
                    Queue<Integer> results = cal.getSaveNum();

                    if (results.isEmpty()) {
                        System.out.println("저장된 값이 없습니다.");
                    } else {
                        System.out.println("저장된 값: " + results);
                        System.out.println("선택 - 1. 메뉴로 돌아가기, 2. 리스트 삭제");
                        int option = sc.nextInt();

                        if (option == 1) {
                            System.out.println("첫번째 메뉴로 돌아갑니다.");
                        } else if (option == 2) {
                            cal.deleteSaveNum();
                            System.out.println("첫번째 데이터 삭제 완료");
                        } else {
                            System.out.println("유효하지 않은 선택입니다.");
                        }
                    }
                } else if (menu == 3) {
                    System.out.println("프로그램 종료");
                    break;
                } else {
                    System.out.println("유효하지 않은 메뉴 선택입니다.");
                }
            } catch (Exception e) {
                System.out.println("입력 오류가 발생했습니다. 다시 시도해주세요.");
                sc.nextLine(); // 입력 버퍼 초기화
            }
        } // while 종료
    }
}
