package com.example2;

public class SubstractOperation {

    private int num1;
    private int num2;

    public SubstractOperation(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void subMethod() {
        double sum = (double) num1 - num2;
        System.out.println("두 수의 빼기: " + sum);
    }
}
