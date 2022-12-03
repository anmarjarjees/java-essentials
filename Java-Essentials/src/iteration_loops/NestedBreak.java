package iteration_loops;

import java.util.Scanner;

/*
 * Learning Objective:
 * - Nested loops
 * - break statement
 */
public class NestedBreak {
    public static void main(String[] args) {
        /*
         * break and continue:
         * These two keywords help us control the loop from within it.
         * "break" will cause the loop to stop and will go immediately to the next
         * statement after the
         * loop:
         * 
         */

        System.out.println("Enter a number between 1 and 10:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();

        int i;
        for (i = 1; i <= num; i++) {
            // we need to break the loop if the num is greater than 20:
            if (i > 10) {
                break;
            }
            System.out.println("Current count value: " + i);
        }

        /*
         * "continue" will skip or stop the current iteration and will move to the next
         * one.
         * Notice that inside a for loop, it will still run the third section.
         */
        for (i = 0; i < num; i++) {
            // we need to break the loop if the num is greater than 20:
            if (i >= 20) {
                break;
            }

            // we need to output only even numbers and skip the odd numbers:
            if (i % 2 != 0) {
                continue; // will skip the rest of the code inside for loop which is the println...
            }
            System.out.println("Current count even value: " + i);
        }
    }
}
