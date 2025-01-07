package com.example2;

public class MultiplyOperation {

    private int num1;
    private int num2;

    public MultiplyOperation(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void multiMethod() {
        int sum = num1 * num2;
        System.out.println("두 수의 곱: " + sum);
    }
}
