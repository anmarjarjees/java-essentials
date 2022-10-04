package start;
/*
 * Control Flow with conditions
 * Decision blocks or Control Flow statements
 * 
 * Relational Operators:
 * > (Greater than)
 * < (Less than)
 * == (Equal to)
 * >= (Greater than or equal to)
 * <= (Less than or equal to)
 * != (Not equal)
 */

// HotKey: Type import then Scanner then enter:
import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        System.out.println("Enter the student's average");
        /*
         * NOTE:
         * Your IDE (like VS code) might give you a warning when you open multiple
         * Scanners variables which means many objects without closing
         * and this might lead to a memory leak.
         * 
         * Solutions:
         * based on VS Code Quick Fix Tip
         * surround the the Scanner instantiating line with try ()
         * 
         * try (Scanner input = new Scanner(System.in))
         * {
         * Put all your code here
         * };
         * 
         * Or a better solution will be to close the scanner at the end using =>
         * input.close();
         * 
         * NOTE: If you leave it, it will not affect your program running
         * 
         */
        Scanner input = new Scanner(System.in);
        input.close();
        int studentAvg = input.nextInt(); // Read user input

        if (studentAvg >= 60) {
            System.out.println("Good, you passed the module");
        } else {
            System.out.println("You need to finish an extra assignment to pass the module");
        }

        /*
         * Variable Scope: determine whether this variable can be used/accessed through
         * the entire program or just part of the program
         * 
         * if block and else block are separate as each has its own { }
         * so any variable we declare inside if can be accessed inside if block only
         * or any variable we declare inside else can be accessed inside else block only
         * 
         * any variable we declare outside if/else or any other block (inside the main
         * function)
         * is global and can be accessed from any where in the program
         */

        // Example:
        String language = "JAVA"; // Global to all the code in the main function
        Boolean isChecked = true;
        if (isChecked) {
            System.out.println(language);
            language = "Java Programming";
            String otherLanguage = "Python";
            System.out.println(otherLanguage);
        } else {
            System.out.println(language);
        }
        System.out.println(language.toUpperCase());
        // System.out.println(otherLanguage); Error
    }
}
