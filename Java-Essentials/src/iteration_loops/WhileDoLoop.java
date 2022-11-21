package iteration_loops;

import java.util.Scanner;

/*
 * Problem: Calculate the gross payment weekly
 * Input: how many hours they worked for one weeks
 * Output: the gross payment of this week
 * 
 * Based on the company policy,
 * Employee cannot work (overtime) more than 35-hour per week
 * maximum is 35 hours for 1 week (could be less but not more)
 * 
 * when using if condition => it will run one time only
 * but while loop is another possible solution => to keep asking till we get the right answer
 */
public class WhileDoLoop {
    public static void main(String[] args) {
        // Initialize our variables:
        // Starting with the constant (known) values:
        double payRate = 17.5;
        int maxHours = 35;

        // Get input for unknown variables (values):
        System.out.println("How many hours did the employee work?");
        Scanner scanner = new Scanner(System.in);
        double workedHours = scanner.nextDouble();

        double grossPay; // Notice we declared the "grossPay" globally so it can be used with while loop
                         // later

        // Validate Input:
        // Using if condition:

        if (workedHours <= 35) {
            // Calculate gross
            grossPay = payRate * workedHours;
            System.out.println("The gross payment is: $" + grossPay);
        } else {
            System.out.println("Sorry Invalid entry. Your hours must be between 1 and 35");
        }

        // While loop can used when we have condition:
        // This time placing our question inside the while loop to keep asking till we
        // get the right answer
        // We don't have a specific time to loop, it depends on the condition:
        // Let's ask the user again so we can run and validate or program based on the
        // new value
        System.out.println("How many hours did the employee work?");
        // Getting the initial input value so we can use in the while loop condition
        workedHours = scanner.nextDouble(); // This variable has been already declared before
        /*
         * Either one these two comparison values has to be updated:
         * - workedHours
         * - maxHours
         * 
         * Otherwise, we can get an infinite loop
         * - While keep looping if its condition is true
         * - The condition is being tested at the beginning before the loop block/code
         */
        while (workedHours > maxHours) {
            System.out.println(
                    "Sorry Invalid entry. Your hours must be between 1 and 40. Please Enter a valid number of hours");
            workedHours = scanner.nextDouble();
            // will keep looping till the condition became false
        }
        grossPay = payRate * workedHours;
        System.out.println("The gross payment is: $" + grossPay);
        // closing the scanner at the end:

        /*
         * Do While Loop
         * similar to while loop, but it checks the condition after at least on
         * execution of
         * the loop block/code
         * - rarely used
         * Let's repeat the same idea while loop above
         * to avoid confusion, I will use different variables for different scenario but
         * same logic
         * 
         * Ask the user to enter student average:
         * has to be between (0 to 100)
         * then output the grade
         */
        double average;
        do {
            System.out.println("What's the student average?");
            average = scanner.nextDouble();
        } while (average < 0 || average > 100);

        char grade;
        if (average < 60) {
            grade = 'F';
        } else if (average < 70) {
            grade = 'D';
        } else if (average < 80) {
            grade = 'C';
        } else if (average < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }
        System.out.println("Based on your average " + average + ", your grade is: " + grade);
        scanner.close();
    }
}
