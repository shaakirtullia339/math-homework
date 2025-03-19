import java.util.Random;

public class MathHomework {
	public static void main(String[] args) {
		int num1 = new Random().nextInt(20);
		int num2 = new Random().nextInt(20);
		int answer = num1 + num2;
		System.out.println("What is " + num1 + " + " + num2 + "?");
		int userAnswer = Integer.parseInt(scanner.nextLine());
		if (userAnswer == answer) {
			System.out.println("Correct!");
		} else {
			System.out.println("Incorrect, the correct answer is " + answer);
		}
	}
}