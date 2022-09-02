package basic;

// Importing the scanner
import java.util.Scanner;

public class PaymentCalculator {
    public static void main(String[] args) {
        // 1. How many hours did you work:
        /*
         * Variable: a memory location for storing data
         * 
         * Java is Statically Typed language => variable types must be declared
         * 
         * Type variableName = value;
         * 
         * without type: Error => hours cannot be resolved to a variable
         * 
         * PHP, JavaScript, Python are examples of Dynamically Typed Languages:
         * The language can determine the type based on its value or through the context
         * in the code.
         * 
         * To summarize:
         * Dynamically typed languages determine the data type of variables at runtime.
         * Statically typed languages determine the data type of variables at compile
         * time.
         */
        int hours = 0; // Setting an initial value of 0;
        // Ask the user to input a value:
        System.out.println("How many hours did you work?");
        Scanner input = new Scanner(System.in);
        hours = input.nextInt();

        // 2. The hourly pay rate:

        // Initialization means providing a default value for a variable at the time of
        // declaration
        double payRate = 0; // initialize the variable "payRate" with the value of 0
        System.out.println("What is your pay rate?");
        payRate = input.nextDouble();

        // We should close the scanner after finishing:
        input.close();

        // 3. Hours x Pay Rate:
        double payPerWeek = hours * payRate;

        // 4. Display/Output the result:
        System.out.println("Gross Pay: " + payPerWeek);

        /*
         * Like in JS:
         * +
         * -
         * *
         * /
         * % Modulo => remainder
         */
    }
}
