public class MathHomework {
    public static void main(String[] args) {
        // Example mathematical calculation
        System.out.println("The area of a rectangle is: " + (areaOfRectangle(5, 3)));
        // Your own mathematical code goes here
        System.out.println("The perimeter of a square with side length 4 is: " + (perimeterOfSquare(4)));
    }

    private static double areaOfRectangle(double width, double height) {
        return width * height;
    }

    private static int perimeterOfSquare(int sideLength) {
        return 4 * sideLength;
    }
}
