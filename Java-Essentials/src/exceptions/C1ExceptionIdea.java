package exceptions;

import java.util.Scanner;

public class C1ExceptionIdea {

    public static void main(String[] args) {
        /*
         * Exception:
         * An event that occurs during the execution of a program that disrupts
         * the normal flow of instructions.
         * 
         * This is generally an unexpected or unwanted event which can occur
         * either at compile-time or run-time in application code
         * 
         * Ref: Rollbar blogs => https://rollbar.com/
         */

        /*
         * example dividing by 0 => an arithmetic exception
         */
        /*
         * simple test,
         * then trying exception with file
         */
        Scanner input = new Scanner(System.in);
        /*
         * The numerator => the number above the line in a fraction
         * The denominator => the number below the line in a fraction
         * 
         * IMPORTANT NOTE:
         * Java will not throw an exception if you divide by 0
         * if the data type is double or float data
         * So if the denominator has:
         * > the value of 0.0 (as double data type)
         * > f0.0(as float data type)
         * Java will just display the result as "infinity"
         * 
         * Java will throw and exception (a run-time error) if you divide by 0 of
         * integer data type.
         * 
         * Notice if both the numerator and denominator are 0:
         * The output => The result of dividing 0.0 by 0.0 is: NaN
         */
        System.out.print("Enter your first number to divide (the numerator): ");
        double num1 = input.nextDouble();
        System.out.print("Enter your second number to divide by (the denominator): ");
        double num2 = input.nextDouble();

        // if num2 is 0 => infinity
        // if num1 and num2 are 0 => NaN
        double result = num1 / num2;
        System.out.println("The result of dividing " + num1 + " by " + num2 + " is: " + result);

        System.out.print("Enter your first whole number (the numerator): ");
        int n1 = input.nextInt();
        System.out.print("Enter your second whole number (the denominator): ");
        int n2 = input.nextInt();
        double div = n1 / n2;
        System.out.println("The result of dividing " + n1 + " by " + n2 + " is: " + div);
        /*
         * Output:
         * Exception in thread "main" java.lang.ArithmeticException: / by zero
         * at exceptions.Main.main(Main.java:58)
         * 
         * So our exception is "ArithmeticException"
         * 
         * To handle any exception => wrap our code that might generate an error
         * with try {} block
         * Check the next file :-)
         */

        input.close();
    } // end main()
} // end class file
