import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BasicCalculator {
    public static void main(String[] args) {
        // Declare
        Scanner scanner = new Scanner(System.in);

        // Addition and Subtraction
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        int difference = num1 - num2;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        double divideResult = 0;
        double productResult = 0;



        // Input
        System.out.print("Please Enter two numbers separated by space: ");
        double firstNumber = scanner.nextInt();
        double secondNumber = scanner.nextInt();

        // Process
        divideResult = firstNumber / secondNumber;
        productResult = firstNumber * secondNumber;

        // Output
        System.out.printf("Division of %f and %f is %.2f%n", firstNumber, secondNumber, divideResult);
        System.out.printf("Product of %f and %f is %.2f%n", firstNumber, secondNumber, productResult);

        // Closing the pointer to the STDIN buffer.
        scanner.close();
        System.out.println("Existing the application!");
    }
}