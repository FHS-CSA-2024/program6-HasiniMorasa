//import stuff here!
import java.util.Scanner;



public class CircleCalculator {

    // Define a constant for pi
    private static final double PI = 3.14159;

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the radius
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();
        
        // Close the scanner
        scanner.close();
        
        // Calculate the diameter, area, and circumference
        double diameter = 2 * radius;
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        
        
        
        // Print the results with three decimal places, no rounding(no need to round here)//
        System.out.printf("The Radius of the circle = %.3f%n", radius);
        System.out.printf("The Diameter of the circle = %.3f%n", diameter);
        System.out.printf("The Area of the circle = %.3f%n", area);
        System.out.printf("The Circumference of the circle = %.3f%n", circumference);
    }
}
