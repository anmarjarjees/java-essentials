package condition_decision;

public class LogicalOperator {
    public static void main(String[] args) {
        /*
         * In Java, we have the following 3 keywords and are called:
         * "Logical Operator"
         * - AND ==> &&
         * - OR ==> ||
         * - NOT ==> !
         * 
         * They are used to combine two conditions to result in a single Boolean value.
         */

        /*
         * With the logical operators we need to use following
         * table. This table is called "Truth Table"
         * 
         * 
         * OR Formula (OR Truth Table):
         * LEFT-HAND SIDE OR RIGHT-HAND-SIDE ==> BOOLEAN RESULT
         * TRUE OR TRUE ==> TRUE
         * TRUE OR FALSE ==> TRUE
         * FALSE OR TRUE ==> TRUE
         * FALSE OR FALSE ==> FALSE <== All FALSE = FALSE (The key)
         * 
         * 
         * AND Formula (And Truth Table):
         * LEFT-HAND SIDE AND RIGHT-HAND-SIDE ==> BOOLEAN RESULT
         * TRUE AND TRUE ==> TRUE <== All TRUE = TRUE (The key)
         * TRUE AND FALSE ==> FALSE
         * FALSE AND TRUE ==> FALSE
         * FALSE AND FALSE ==> FALSE
         * 
         * 
         * NOT:
         * NOT TRUE (!TRUE) ==> FALSE
         * NOT FALSE (!FALSE) ==> TRUE
         * 
         * 
         * Simple Trick:
         * Assume that:
         * TRUE = 1
         * FALSE = 0
         * And just remember that there is no "2" in the truth table,
         * the maximum value is 1
         * 
         * Assume that:
         * OR = +
         * AND = *
         * 
         * Examples:
         * TRUE OR TRUE ==> TRUE
         * like saying: 1 + 1 = 1
         * TRUE OR FALSE ==> TRUE
         * like saying: 1 + 0 = 1
         * TRUE AND TRUE ==> TRUE
         * like saying: 1 * 1 = 1
         * TRUE AND FALSE ==> FALSE
         * like saying: 1 * 0 = 0
         */

        // basic example:
        String fruit1 = "apple";
        String fruit2 = "peach";
        if (fruit1 == "apple" && fruit2 == "peach") {
            System.out.println("Yummy!");
        } else if (fruit1 == "apple" || fruit2 == "banana") {
            System.out.println("Indeed it's Yummy");
        }

        // More Advanced Example:
        double exam1 = 22;
        double exam2 = 62;
        double avg = (exam1 + exam2) / 2;

        /*
         * Problem:
         * - scan the average value and check following this logic order:
         * - if the average is 90+ AND less or equal to 100 ==> (90-100) ==> Excellent
         * - else if the average is 80+ AND less or equal to 89 ==> (80-89) ==> Very
         * Good
         * - else if the average is 70+ AND less or equal to 79 ==> (70-79) ==> Good
         * - else if the average is 60+ AND less or equal to 69 ==> (60-69) ==>
         * Satisfactory
         * - else if the average is 0+ and less than 60 ==> (<60) ==> Fail
         * - else ==> Invalid Average Value
         */
        System.out.println("the average is:" + avg);
        // Excellent (Honors) ==> 90 - 100
        String grade;
        // Notice below since each if/else if/else block has one statement, we can omit
        // the { }
        if (avg >= 90 && avg <= 100) {
            grade = "Excellent";
        } else if (avg >= 80 && avg <= 89) {
            grade = "Very Good";
        } else if (avg >= 70 && avg <= 79) {
            grade = "Good";
        } else if (avg >= 60 && avg <= 69) {
            grade = "Satisfactory";
        } else if (avg >= 0 && avg <= 60) {
            grade = "Fail";
        } else {
            grade = "Invalid Average Value!";
        }
        System.out.println(grade);

        /*
         * The same logic in Python language:
         * exam1 = 72
         * exam2 = 62
         * avg = (exam1 + exam2) / 2
         * 
         * print("the average is:", avg)
         * # Excellent (Honors) ==> 90 - 100
         * if (avg >= 90 and avg <= 100):
         * print("Excellent")
         * elif (avg >= 80 and avg <= 89):
         * print("Very Good")
         * elif (avg >= 70 and avg <= 79):
         * print("Good")
         * elif (avg >= 60 and avg <= 69):
         * print("Satisfactory")
         * elif (avg >= 0 and avg <= 60):
         * print("Fail")
         * else:
         * print("Invalid Average Value!");
         */

        /*
         *****************
         * Ternary Operator:
         *****************
         * if (condition) { condition is true => expression1 } else { condition is false
         * => expression2 }
         * You just need one line of code: condition ? expression1 : expression2
         */

        int age = 20;
        /*
         * if (age >= 18) {
         * System.out.println("He/She can buy fireworks");
         * } else {
         * System.out.println("He/She can't buy fireworks");
         * }
         */

        // To review, it's legal to omit the { } if the if block/else block has one
        // statement
        if (age >= 18)
            System.out.println("He/She can buy fireworks");
        else
            System.out.println("He/She can't buy fireworks");

        // Repeat the same logic with Ternary Operator
        // Link: https://www.w3schools.com/java/java_conditions_shorthand.asp
        // The template: (my condition) ? the code if true : the code if false

        /*
         * NOTE: You can not use Java Ternary Operator
         * as a standalone statement,
         * which means we cannot use it without assignment operator as we do with JS:
         * 
         * (age >= 18) ?"He/She can buy fireworks" :
         * System.out.println("He/She can't buy fireworks");
         */

        // Or assign the result to a variable:
        String msg = (age >= 18) ? "He/She can buy fireworks" : "He/She can't buy fireworks";
        System.out.println(msg);

        // Nested Conditions:
        // The first condition: College accepts students with age 18+
        // Then:
        // Computer Programming => code: CP123 => building A, Room 112
        // Graphic Design => code: CDD356 => building A, Room 110
        // PC Networking => code: PCN990 => building C, Room 102
        // Accounting => code: ACC780 => building B, Room 107

        // We already defined the age variable with its value
        // declare teh code variable:
        var code = "PCN990"; // all in capital

        // building the if block for the above logic:
        // The long way?
        if (age >= 18 && code == "CP123") {
            System.out.println("Your classroom is in building A, Room 112");
        } else if (age >= 18 && code == "CDD356") {
            System.out.println("Your classroom is in building A, Room 110");
        } else if (age >= 18 && code == "PCN990") {
            System.out.println("Your classroom is in building B, Room 102");
        } else if (age >= 18 && code == "ACC780") {
            System.out.println("Your classroom is in building C, Room 107");
        } else {
            System.out.println("Sorry, invalid age or program code!");
        }

        // The better short way using nested if statement
        if (age >= 18) {
            if (code == "CP123") {
                System.out.println("Your classroom is in building A, Room 112");
            } else if (code == "CDD356") {
                System.out.println("Your classroom is in building A, Room 110");
            } else if (code == "PCN990") {
                System.out.println("Your classroom is in building B, Room 102");
            } else if (code == "ACC780") {
                System.out.println("Your classroom is in building C, Room 107");
            } else {
                System.out.println("Sorry, invalid age or program code!");
            }
        } else {
            System.out.println("Sorry, invalid age! You have to be 18+ to register");
        }

        int x = 1;
        int y = 2;
        // using OR symbol ||
        // I want to check if either x or y is greater than 10 or no
        if (x > 10 || y > 10) {
            // if (False || False) => False
            System.out.println("At least one value is more than 10");
        } else {
            System.out.println("there is no value more than 10");
        }

        // Understanding NOT (!) Operator:
        /*
         * in the example above:
         * we can write the condition in two ways:
         * if (age>=18) ==> you can buy ...
         * Or:
         * if (!age<18) ==> you can buy...
         * if (the age is NOT less than 18)
         * we use ! operator with the same logic of age
         * logic: if the age is NOT less than 18 ==> "Yes, you can buy fireworks"
         */
        age = 18; // Using the same integer variable "age" but with a new value
        // Here is the simple solution using our classical way:
        // if (age is greater than or equal to 18)
        if (age >= 18) {
            System.out.println("Yes, you can buy fireworks");
        }

        // So let's try to repeat the same example using the "NOT" Logical Operator, the
        // symbol is: !
        // more example: ! (not)
        // the NOT operation !
        // if (age is NOT less than 18)
        // In Java => !(our_condition) => if (!(age < 18)) then...
        // In JavScript => !our_condition => if (!age < 18) then...
        if (!(age < 18)) {
            System.out.println("Yes, you can buy fireworks");
        }

        // Short Circuit Logic (Short Circuiting)
        // AND = OR => Combining two conditions into one
        /*
         * AND => Both (All) conditions have to be "TRUE" to continue...
         * if the very first condition is "False", Java will ignore the rest
         * No need to evaluate the next/rest of the condition
         * False && ..Whatever is True/False.. => is always "False"
         * Example:
         * False && False = False
         * False && True = False
         * 
         * Analyze this simple logic:
         * if (5 >= 7 && 2<4)
         * > The first condition 5>=7 is false.
         * > Since AND "&&"" operator requires both/all conditions to be true,
         * > the second condition does not need to be evaluated because it will not
         * change the result
         * 
         * OR => At least one condition has to be "TRUE" to continue...
         * if the very first condition is "True", Java will ignore the rest
         * No need to evaluate the next/rest of the condition
         * True || ..Whatever is True/False.. => is always "True"
         * Example:
         * True && True = True
         * True && False = True
         */
    }
}
