package condition_decision;

import java.util.Scanner;

/*
 * Notice below I used the same name of the class "PaymentCalculator"
 * But the two Classes (Java file) that have the same exact name
 * living in different packages (folders) so it's OK
 * 
 * Problem:
 * All salespeople in a big car dealer company get $1000 per week.
 * But those who can can make beyond the quote which is 10 sales
 * should get an additional bonus of $250 
 * else output a message to inform the employee of how many sales they were short
 * 
 * Solution using If Statement.
 */
public class PaymentCalculator {
    public static void main(String[] args) {
        // Initializing the variables with known values (no need for user input):
        int payment = 1000;
        int bonus = 250;
        int quota = 10;

        // The unknown values need a user input:
        System.out.println("How many sales did the employee make this week");
        Scanner input = new Scanner(System.in);

        int sales = input.nextInt();
        input.close();

        // if statement: checks if the condition is true
        /*
         * we put our condition to evaluate inside ()
         * The condition is an expression that resolves to a boolean value:
         * - if (sales > quota ) = true => do something
         * - else (which means sales is either equal to or less than quota) = false =>
         * do other thing
         * 
         * Like in JS, if we have one statement inside if/else block we can omit { }
         * but it's better to keep them for readability
         */
        if (sales > quota) {
            // payment = payment + bonus;
            // Or using the shorthand like in JS:
            payment += bonus;
            // Output the final payment
            System.out.println("The final payment for this employee after the bonus is " + payment);
        } else {
            // calculate the number of shortage
            /*
             * the shortage = the minimum quota to be achieved - how many sales the employee
             * made
             */
            int shortage = quota - sales;
            System.out.println(
                    "Sorry, this employee was unable to make a quota and they were " + shortage + " sales short.");
        }
    }
}
