// Package name all in lowercase
package basic;

// We need to import java.util.Scanner package
import java.util.Scanner;

public class QuestionAnswer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // This code will throw a warning: Resource leak: 'input' is never closed

        System.out.println("QA Session");
        System.out.println("Please answer the questions in just one word");

        System.out.println("What's your favourite color?");
        String favColor = input.next();

        System.out.println("Which year you were born?");
        String year = input.next();

        System.out.println("How much gas price today in Toronto [cent(s)/litre]?");
        Double gasPrice = input.nextDouble();

        input.close();

        // Finally using "var":
        /*
         * Java infers the data type by the value that is assigned to the variable
         * that's how Java can know the actual data type of a variable declared with var
         */
        var language = "Java";

        System.out.println("Your favourite color is " + favColor + " you were born in " + year + ". Today gas price is "
                + gasPrice + ". This message was printed using " + language + " language.");
    }
}
