package iteration_loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        /*
         * Do While Loop
         * similar to while loop,
         * but it checks the condition after at least on execution of
         * the loop block/code
         * - rarely used
         * Let's repeat the same idea while loop above
         * to avoid confusion, I will use different variables for different scenario but
         * same logic
         */

        // printing from 1 to 10
        int num = 1;
        do {
            System.out.println(num);
            // Increment operator
            num++; // 1 + 2 ...
        } while (num < 11);

        // Task: printing from 10 to 1
        num = 10; // reset the loop counter to 10
        do {
            System.out.println(num);
            // Decrement operator
            num--; // 10 - 9 - 8 ... 1 - 0 -1 -2 -3 -4
        } while (num > 0); // 8 < 11

        /*
         * Ask the user to enter student average:
         * has to be between (0 to 100)
         * then output the grade
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("What's the student average?");
        double average = sc.nextDouble(); // 200

        // OR => TRUE || FALSE => TRUE
        // AND => 200 > 0 = TRUE && 200 <= 100 = FALSE
        if (average > 0 && average <= 100) {
            System.out.println("Your average " + average);
        } else {
            System.out.println("Invalid Average!");
        }

        // repeat the same logic by with OR
        if (average < 0 || average > 100) {
            System.out.println("Invalid Average!");
        } else {
            System.out.println("Your average " + average);
        }

        /*
         * we ask the user to input a valid avg
         * otherwise, We will keep asking the user till they input a valid average
         * (between 0 to 100)
         */
        do {
            System.out.println("What's the student average?");
            average = sc.nextDouble(); // 98
            if (average < 0 || average > 100) {
                System.out.println("Invalid Average!");
            }
        } while (average < 0 || average > 100); // Keep looping while this condition is true

        sc.close();
    } // end main()
} // end class file
