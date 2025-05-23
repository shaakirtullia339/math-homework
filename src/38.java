import java.util.Scanner;

public class MathHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two integers: ");
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
    }
}
