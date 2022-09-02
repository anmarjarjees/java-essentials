package condition_decision;

import java.util.Scanner;

public class GradingMessage {
    public static void main(String[] args) {
        /*
         * Switch Statement: Checks for equality *
         */
        System.out.println("Enter your grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next().toUpperCase(); // yes chaining methods

        // we cannot evaluate less or more only equal or not equal with switch
        String msg;
        // switch() => accepts a variable NOT an expression like if statement

        /*
         * Notice that "break" keyword is necessary at the end of each case to stop the
         * switch
         * Otherwise switch statement will jump to the next case directly below the
         * current one
         * and execute its code also and so on till "break" or end of "switch"
         * This is called "Fall-Through" in Switch Statement
         * 
         * using .toUpperCase() operation (method) for the string in case if small
         * letters
         */
        switch (grade) {
            case "A":
                msg = "Excellent";
                break;
            case "B":
                msg = "Very Good";
                break;
            case "C":
                msg = "Good";
                break;
            case "D":
                msg = "Satisfactory";
                break;
            case "F":
                msg = "Fail";
                break;
            default:
                msg = "Error. Invalid Grade Input!";
                break;
        } // end switch

        System.out.println("1. Normal Switch: Your grade is " + grade + ". " + msg);

        System.out.println("***************************************************");

        String result;
        // Or using arrow (->)
        /*
         * NOTES:
         * - Switch with "->" or Switch Expression (later) doesn't have "fall through"
         * like the normal switch => No "break" keyword
         * - If any case has multiple lines of code, then use code block { }.
         * - Case styles ":" & "->" can NOT be combined in a single switch statement
         */
        switch (grade) {
            case "A" -> result = "Excellent";
            case "B" -> result = "Very Good";
            case "C" -> result = "Good";
            case "D" -> result = "Satisfactory";
            case "F" -> result = "Fail";
            default -> result = "Error. Invalid Grade Input for the second time!";
        } // end switch

        System.out.println("Switch with arrow: Your grade for the second time is " + grade + ". " + result);

        System.out.println("***************************************************");

        // Switch Expressions:

        // Link:
        // https://docs.oracle.com/en/java/javase/17/language/switch-expressions.html

        // We can simplify the switch() statement above by using "Switch Expressions"
        // we can initialize our variable "result" with the returned value/result from
        // we can use "switch" expression when a value needs to be assigned when a case
        // is matched
        // the switch statement
        String result2 = switch (grade) {
            // we can use comma(s) to combine two or more conditions
            // (listing all the applicable cases delimited by a comma)
            case "A", "B" -> "Excellent";
            // case "B" -> "Very Good";
            case "C" -> "Good";
            case "D" -> "Satisfactory";
            case "F" -> "Fail";
            default -> "Error. Invalid Grade Input for the third time!";
        }; // end switch => NOTE: We have to add a ; for this closing } for the expression
           // switch

        System.out.println("Switch Expression#1: One more time, your grade is " + grade + ". " + result2);

        // Switch Expressions with "yield": you can use yield statement instead of the
        // arrow operator (->)

        System.out.println(
                "Please enter your subject number: 1 for Music, 2 for Math, 3 for English, 4 for Computer, or 5 for singing ");

        int subjectNum = scanner.nextInt();
        /*
         * Yield keyword:
         * - "yield" can be used with normal switch and arrow switch
         * - When we have multiple lines of code with multiple formulas (expressions),
         * "yield" can but used to return the final value to assignment
         */
        String classMsg = switch (subjectNum) {
            // we can use comma(s) to combine two conditions
            case 1:
                yield "Enjoy your mode with our music class";
            case 2:
                yield "Sharpen your brain with our math class";
            case 3:
                yield "Improve your language with our English class";
            case 4:
                yield "Enhance your skills with our computer class";
            case 5:
                yield "Improve your voice with our singing class";
            default:
                yield "Error. No such subject!";
        }; // end switch => NOTE: We have to add a ; for this closing } for the expression
           // switch
        System.out.println(classMsg);

        scanner.close(); // closing our scanner
    }
}
