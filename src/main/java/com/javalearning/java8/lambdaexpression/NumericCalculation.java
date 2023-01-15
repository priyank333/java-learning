package com.javalearning.java8.lambdaexpression;

import java.util.Random;

public class NumericCalculation {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> {
            return a - b;
        };
        MathOperation multiplication = (a, b) -> {
            return a * b;
        };
        MathOperation division = (a, b) -> a / b;
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        System.out.println("Addition of " + a + " and " + b + " is " + addition.operation(a, b));
        System.out.println("Subtraction of " + a + " and " + b + " is " + subtraction.operation(a, b));
        System.out.println("Multiplication of " + a + " and " + b + " is " + multiplication.operation(a, b));
        System.out.println("Division of " + a + " and " + b + " is " + division.operation(a, b));
    }
}
