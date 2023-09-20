/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casona_activity1;

import java.util.Scanner;

/**
 *
 * @author Casona_CPE
 */
public class CASONA_Activity1 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            
            do {
                System.out.println("Choose an option:");
                System.out.println("1. Temperature Conversion");
                System.out.println("2. Odd/Even Number Checker");
                System.out.println("3. Trigonometric Calculations (Degrees)");
                System.out.println("4. Calculate Surface Area for 4 Polygons");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        temperatureConversion(scanner);
                        break;
                    case 2:
                        oddEvenNumberChecker(scanner);
                        break;
                    case 3:
                        trigonometricCalculations(scanner);
                        break;
                    case 4:
                        polygonSurfaceAreaCalculations(scanner);
                        break;
                    case 5:
                        System.out.println("Exiting the program.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose a valid option.");
                }
            } while (choice != 5);
        }
    }

    // Temperature Conversion
    public static void temperatureConversion(Scanner scanner) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

    // Odd/Even Number Checker
    public static void oddEvenNumberChecker(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    // Trigonometric Calculations in Degrees
    public static void trigonometricCalculations(Scanner scanner) {
        System.out.print("Enter an angle in degrees: ");
        double angleDegrees = scanner.nextDouble();
        double angleRadians = Math.toRadians(angleDegrees);
        double sinValue = Math.sin(angleRadians);
        double cosValue = Math.cos(angleRadians);
        double tanValue = Math.tan(angleRadians);

        System.out.println("Sine(" + angleDegrees + " degrees) = " + sinValue);
        System.out.println("Cosine(" + angleDegrees + " degrees) = " + cosValue);
        System.out.println("Tangent(" + angleDegrees + " degrees) = " + tanValue);
    }

    // Surface Area Calculations for 4 Polygons

        /**
         *
         * @param scanner
         */
    public static void polygonSurfaceAreaCalculations(Scanner scanner) {
        System.out.println("Choose a polygon:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Circle");
        System.out.print("Enter your choice: ");
        int polygonChoice = scanner.nextInt();
        
        double area = 0.0;

        switch (polygonChoice) {
            case 1:
                System.out.print("Enter the side length of the square: ");
                double sideLength = scanner.nextDouble();
                area = sideLength * sideLength;
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                area = length * width;
                break;
            case 3:
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                area = 0.5 * base * height;
                break;
            case 4:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = Math.PI * radius * radius;
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid polygon.");
        }

        System.out.println("The surface area is: " + area);
    }
    }
