package start;

/*
 * Scanner is a special data type that we need import in order to be able to use it
 * we need to import it first
 * Scanner Class (Object) contains the tools we can use to get input from the user
 * Scanner is one of the Java utilities to help us read/write form the console window
 * The "Scanner class" is used to get user input, and it is found in the "java.util package"
 * java.util is a package, while Scanner is a class of the java.util package
 * To learn more about packages in Java:
 * Link: https://www.w3schools.com/java/java_packages.asp
 * Link: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html
 */
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        String firstName = "Alex";
        String lastName = "Chow";
        double studentAverage = 93.78;

        System.out.println(firstName + " " + lastName + " has the average of " + studentAverage);

        System.out.println("Enter his new average value?");
        /*
         * Scanner class is the tools that has operation to give us the option to get an
         * input from the console
         * We had already imported the scanner above
         * The data type here is "Scanner"
         * 
         * creating a varaible name "input" take user input with the Data type "Scanner"
         */
        Scanner input = new Scanner(System.in);
        // Through the Scanner object "input" we can access all the "Scanner" class
        // members
        // using nextDouble() operation (method)
        // We are expecting to get a decimal point so we use nextDouble()
        studentAverage = input.nextDouble(); // override the initial value of studentAverage
        // you can use .nextInt() with whole numbers like age or years of experience
        System.out.println(firstName + " " + lastName + " has a new average of " + studentAverage);
        // example: 97.72
        // Alex Chow has a new average of 95.72

        /*
         * .next() will only return what comes before the delimiter
         * (defaults to whitespace)
         * Example: if you enter "Java Programming" => only Java will be returned
         * 
         * .nextLine() will return the entire line
         * Example: if you enter "Learn Java Programming" => the entire line will be
         * returned
         */
        System.out.print("What is your name?");
        String name = input.nextLine();
        input.close();
        /*
         * Tip:
         * In case you make a mistake by mixing a Class (Object) name with an operation
         * (method)
         * that doesn't belong to it => VS code will give you this error: out cannot be
         * resolved or is not a field
         * 
         * Example:
         * Scanner.out.println(...) => Error out belongs to System not Scanner!
         */
        System.out.println("Thank you, " + name + ", for updating the average!");

    }
}