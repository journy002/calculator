package com.sample.lv2;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

    // 메서드 영역
    public int calculator(int num1, int num2, String symbol) {
        int result = 0;

        // 계산기
        switch (symbol) {
            case "+":
                result = num1 + num2;
                System.out.println("결과= " + result);
                break;

            case "-":
                result = num1 - num2;
                System.out.println("결과= " + result);
                break;

            case "*":
                result = num1 * num2;
                System.out.println("결과= " + result);
                break;

            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("결과= " + result);
                    break;
                } else {
                    System.out.println("나누기 실행시 분모의 값이 0이 될 수 없습니다.");
                }
        }
        return result;
    }

    // Queue(FIFO) 활용하여 결과값 저장
    private Queue<Integer> saveNum = new LinkedList<>();

    // settet
    public void setSaveNum(int value) {
        saveNum.add(value);
    }

    // getter
    public Queue<Integer> getSaveNum() {
        return saveNum;
    }

    // 데이터 삭제
    public void deleteSaveNum() {
        saveNum.remove();
    }
}
