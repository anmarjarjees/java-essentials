package methods;

import java.util.Scanner;

/*
 * method is used for performing a specific task
 * in other programming languages are called "functions" some called it "modules"
 * In Java are called method because they are simply created inside a class file
 * and any function written inside a class are officially called a method
 * 
 * In every class file in "Java" there is a required method that added automatically
 * named "main".
 * 
 * Some Java builtin methods are being called based on our need like:
 * - from the "Scanner" class to enter data
 * - from the "System" class to output data
 * 
 */
public class MyMethods {
    /*
     * Java application (class) always starts with the method "main"
     * (The Starting Entry Point of a standalone Java application)
     * an it's the only method that are being called and run by Java automatically
     * The "main" method is similar to the main function in C and C++;
     * it's the entry point for your application
     * and will subsequently invoke all the other methods required by your program.
     * 
     * public => The Access Modifier => It's accessible anywhere (OOP concept)
     * static => The method can be called and executed directly
     * without creating an instance (object) of the "MyMethod" class
     * Notice that the modifiers public and static can be written in either order
     * (public static or static public), but the convention is to use public static
     * 
     * void => the return data type of this method
     * and it's void so nothing to return
     * 
     * main => the method name that JVM uses when it starts a standalone application
     * 
     * String[] => An array of elements of string data types
     * so the main method accepts a single argument:
     * an array of elements of type "String"
     * 
     * args => args for arguments variable of type array that contains the
     * configuration parameter to be passed into the main function
     * Notice that you can name the argument anything you want,
     * but most programmers choose "args" or "argv"
     * 
     * Link:
     * https://docs.oracle.com/javase/tutorial/getStarted/application/index.html
     */
    public static void main(String[] args) {
        // Let's call our custom methods:
        welcomeEmp();
        // These two methods are just for returning values (no print functionality)
        // We are hard coding the values
        findAverage(90, 92);
        isEven(8);

        // We need to output them:
        System.out.println(findAverage(90, 92));
        // OR:
        double avg = findAverage(90, 92);
        System.out.println(avg);

        /*
         * Tasks:
         * 1. Ask the user to input one numbers to check if it's odd or even
         * 2. Ask the user to input two numbers to find the average for them
         * using findAverage()
         * 3. Calling the other function hasEnoughAverage()
         * to check if he pass or fail
         */

    } // end main()

    /*
     * Creating our first custom method
     * to find the average of any two numeric values
     * using camelCase like variables by convention "findAverage"
     * accepting two parameters: value1 and value2 both of type double (yes it can
     * accept int for sure)
     * 
     * All methods have to be created in the scope of their container class in any
     * order
     * For sure our methods live outside the "main" method
     * 
     * Analyze it:
     * - the first line of the method is called "The Header" that contains:
     * First Keyword: "public" => Access Modifier => to specify who can
     * access/use/call this
     * method
     * - The keyword "public" as the name indicate, means that this method can be
     * accessed publicly
     * from any class that uses this method
     * In Java, there are 4 types of access modifiers (visibility modifiers):
     * - "default": which is the default option in Java if we don't specify
     * (without adding the keyword)
     * - "public": a method or a data field specified as "public" is accessible
     * from any class within the same package in the Java program.
     * - "private": a method or a field that is declared as private
     * can be accessible within the declared class itself
     * not accessible outside the class.
     * (We cannot declare a private class only private field or method)
     * - "protected": The field/method is accessible by the classes within the same
     * package
     * or by subclasses within the same package or other packages
     * 
     * Second Keyword: "static" => Non-access Modifier => do not control access
     * level, but provides other functionality.
     * Different types of Non-access modifiers including:
     * final Attributes and methods => cannot be overridden/modified
     * static Attributes and methods => belongs to the class, rather than an object
     * abstract => Can only be used in an abstract class, and can only be used on
     * methods. The method does not have a body,
     * for example abstract void run();.
     * The body is provided by the subclass (inherited from).
     * synchronized Methods => can only be accessed by one thread at a time
     * 
     * Link: https://www.w3schools.com/java/java_modifiers.asp
     * 
     * Third Keyword: will be the data type for the returned value from the function
     * Our function below can return a number with decimal point,
     * so we specified the returned data type to be "double"
     * 
     * Notice that the "main" method of any Java class has the keyword "void"
     * which means it' doesn't return anything. so we have to indicate the returned
     * data type
     * if nothing to be returned, we have to put "void"
     * Notice that a method can return only one value
     * 
     * Fourth: the method name that we choose to reflect the functionality of the
     * method
     * by convention, a method (like a function) name should begin with a verb
     * "find..."
     * 
     * Fifth: the parenthesis that might contain parameters if needed
     * the parameters are formatted as a comma delimitated list of variables
     * 
     * These parameters are mandatory to receive values (arguments) when the method
     * is being called
     * 
     * Method Signiture:
     * Every method has a signiture which is consisted of:
     * - The method's name
     * - The method's parameter list
     * 
     * The "Method signiture" must be unique within a class
     * 
     * Finally: the method body which is contained with a set of curly braces
     * 
     * Every method must include "return" statement unless it has "void" which is
     * nothing to return
     * 
     * NOTES:
     * - To run any of these method we need to call them:
     * - either from inside the main method
     * - or outside the main method but for sure within the class
     * - the have the keyword "static":
     * it means that the method belongs to "MyMethod" class
     * and not an object of "MyMethod" class
     */

    public static double findAverage(double number1, double number2) {
        return (number1 + number2) / 2;
    }

    /*
     * One deviation from this convention is if the method return a boolean data
     * type: true or false
     * there name should ask a question:
     */
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Creating a method named "welcomeEmp" for asking a new employee a couple of
     * questions and welcoming him: *
     */
    // this method doesn't return anything:

    public static void welcomeEmp() {
        System.out.println("What's your name?");
        Scanner input = new Scanner(System.in);
        String empName = input.next();
        System.out.println("What's your job title");
        String jobTitle = input.next();
        System.out.println("Welcome " + empName + ". " + "Job Title: " + jobTitle);
        input.close();
    }

    /*
     * Another method for accepting two values for the two exams
     * like the one above and also find the average
     * but it will return true if average > =60 or otherwise false:
     * Now we can do the average calculation within this method
     * OR we can call our findAverage() method within this method
     * this is useful specially when we have complex formula function
     * the side effect is this method "hasEnoughAvg"
     * will be dependent on the other method "findAverage"
     * so as programmers we have to move the two together
     */
    public static boolean hasEnoughAvg(double exam1, double exam2) {
        /*
         * Notice that we omitted the { } for the if and else blocks
         * it's valid since we have one statement in each section
         * but it's always better to keep the { } for readability
         */
        if ((findAverage(exam1, exam2)) >= 60)
            return true;
        else
            return false;
    }

} // end class MyMethod
