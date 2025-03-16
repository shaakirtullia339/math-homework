import java.util.Scanner;
public class MyMathHomework {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int result = sum(num1, num2);
    System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
  }
  public static int sum(int a, int b) {
    return a + b;
  }
}