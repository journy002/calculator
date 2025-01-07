package com.example2;

public class AddOperation {

    private int num1;
    private int num2;

    public AddOperation(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void addMethod() {
        double sum = (double) num1 + num2;
        System.out.println("두 수의 합: " + sum);
    }

}
