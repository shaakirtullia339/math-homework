package math.homework;

import java.util.Random;

public class MathHomework {

  public static void main(String[] args) {
    Random random = new Random();
    int a = random.nextInt(10);
    int b = random.nextInt(10);
    System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
  }

}