package com.example2;

public class DivideOperation {

    private int num1;
    private int num2;

    public DivideOperation(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void divideMethod() {
        int sum = 0;

        if (num2 != 0) {
            sum = num1 / num2;
        }
        System.out.println("나누기: " + sum);
    }
}
