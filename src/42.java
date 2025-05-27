import java.util.Scanner;

public class MathHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of sides for a regular polygon:");
        int numSides = scanner.nextInt();
        double sideLength = scanner.nextDouble();

        if (numSides <= 3) {
            System.out.println("The given number of sides is invalid. Please enter a valid number.");
        } else {
            double area = (float) (sideLength * Math.pow(numSides / 2, 2));
            double perimeter = numSides * sideLength;
            System.out.printf("The area of the regular polygon with %d sides each of length %.3f is %.3f. The perimeter is %.3f.\n", numSides, sideLength, area, perimeter);
        }
    }
}
