package iteration_loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        /*
         * To avoid the too many lines of coding,
         * we can use the "loop" statement.
         * - code can run for a specific number of times
         * - condition is pretested before the loop
         * - is used when we know how many times the loop should be executed
         * 
         * We are going to use "for loop":
         * - we can create a loop variable like "loopCounter" for example or any name
         * you like.
         * - and having this loopCounter to start with the value of "1" (the required
         * initial value)
         * - and keep increment this variable one by one till it reaches the value of
         * "10"
         * - then the loop should be stopped because we don't want to go beyond the 10
         * for loop structure:
         * for (part1; part2; part3) {
         * // the for loop code goes here
         * }
         * part1: The initial value of the loop counter (The start counting number)
         * part2: The condition to keep the loop "running"=> I want to keep looping
         * since this condition is true
         * part3: The increment/decrement operation for the loop counter
         * 
         * Let's make a simple loop to print/output 1 to 10 vertically
         */

        System.out.println("1 to 10:");
        for (int count = 1; count <= 10; count++) {
            System.out.println(count);
        }
        System.out.println("*****");

        System.out.println("1 to 10: Odd");
        // 1-10 => Odd numbers only
        for (int count = 1; count <= 10; count += 2) {
            System.out.println(count);
        }
        System.out.println("*****");

        System.out.println("1 to 10: Even");
        // 1-10 => Even numbers only
        for (int count = 2; count <= 10; count += 2) {
            System.out.println(count);
        }
        System.out.println("*****");

        // To print 10 to 1 (Descending)
        for (int count = 10; count >= 1; count--) {
            // the for loop code goes here
            // This code/message will be printed 10 times!
            /*
             * the first time => loopCounter = 10
             * after loopCounter--
             * the second time => loopCounter = 9
             * after loopCounter--
             * the third time => loopCounter = 8
             * and so on till we reach the 10th time
             */
            System.out.println(count);
        }

        // Ask the user to enter a number between 1 and 10:
        // Then calculate the time table of multiplying this number by 1 to 10
        /*
         * Example: if the user enters 5:
         * Find/printing the output of each equation below:
         * 1 x 5 = 5
         * 2 x 5 = 10
         * 3 x 5 = 15
         * .
         * .
         * .
         * 10 x 5 = 50
         */

        // Just the basic code to be completed:
        Scanner scanner = new Scanner(System.in);
        double num;
        do {
            System.out.println("Enter a number between 1 and 10");
            num = scanner.nextDouble();
        } while (num >= 1 && num <= 10);

        // close scanner:
        scanner.close();

        /*
         * Asking the user: "How many courses did you finish?"
         * If (user input is invalid<=> has to be an integer value) {
         * Output: Invalid Input
         * } else {
         * Your code which is the main part to answer the assignment goes here:
         * - looping for x number of times where x is how many course did the user
         * finish
         * - Initialize a total variable with the value of 0
         * - Inside the loop:
         * For the first time: Enter your mark for course 1
         * For the second time: Enter your mark for course 2
         * And so on for the x time: Enter your mark for course x
         * for each entry add the number to the total variable
         * }
         * - After the loop calculate the average (total of number / how many numbers)
         */
    }
}
