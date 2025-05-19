import java.util.Random;

public class MathHomework {
    public static void main(String[] args) {
        Random rand = new Random();
        int maxNumber = 10;
        System.out.println("The random number between 1 and " + maxNumber + " is: " + (rand.nextInt(maxNumber) + 1));
    }
}
