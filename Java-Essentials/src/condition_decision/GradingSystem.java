package condition_decision;

import java.util.Scanner;

/*
    Problem:
    - scan the average value and check:
    - if the average is 90+ AND less or equal to 100 ==> (90-100) ==> Excellent
    - else if the average is 80+ AND less or equal to 89 ==> (80-89) ==> Very Good
    - else if the average is 70+ AND less or equal to 79 ==> (70-79) ==> Good
    - else if the average is 60+ AND less or equal to 69 ==> (60-69) ==> Satisfactory
    - else if the average is 0+ and less than 60 ==> (<60) ==> Fail
    - else ==> Invalid Average Value
*/
public class GradingSystem {
    public static void main(String[] args) {
        // We will start with the minimum 60 and moving up to 100 in our if/else if
        // blocks below:
        // Get the average:
        System.out.println("Enter your average:");
        Scanner scanner = new Scanner(System.in);
        double avg = scanner.nextDouble();
        scanner.close();

        // declare the varaible grade in the class scope to make it global through all
        // the if/else if blocks:
        char grade;
        if (avg < 60) {
            grade = 'F';
        } else if (avg < 70) {
            grade = 'D';
        } else if (avg < 80) {
            grade = 'C';
        } else if (avg < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }
        System.out.println("Your grade is " + grade);
    }
}
