import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BasicCalculator {
    public static void main(String[] args) {
        // Declare
        Scanner scanner = new Scanner(System.in);
            double divideResult = 0;
            double productResult = 0;
            double sum = 0;
            double difference = 0;



            // Input
            System.out.print("Please Enter two numbers separated by space: ");
            double firstNumber = scanner.nextInt();
            double secondNumber = scanner.nextInt();

        // Addition and Subtraction

         sum = firstNumber + secondNumber;
         difference = firstNumber - secondNumber;
        System.out.printf("the Sum of %.2f and %.2f is %.2f%n", firstNumber, secondNumber, sum);
        System.out.printf("Difference of %.2f and %.2f is %.2f%n", firstNumber, secondNumber, difference);


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