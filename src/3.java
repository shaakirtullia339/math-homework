public class MathHomework {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        System.out.println("What is " + number1 + " + " + number2 + "?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (Integer.parseInt(answer) == number1 + number2) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + (number1 + number2));
        }
    }
}
