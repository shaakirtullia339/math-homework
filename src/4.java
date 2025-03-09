package com.mathhomework;
import java.util.Random;
public class MathHomework {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
