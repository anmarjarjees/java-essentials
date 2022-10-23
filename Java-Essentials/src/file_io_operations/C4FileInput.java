package file_io_operations;

/* 
 * Importing the class "File"
 * for handling all the related file input/read operations 
 * from java.io package
 * to call new File() constructor
 */
import java.io.File;
/* 
 * All the exception classes are driven from Exception class:
 * > java.lang.Object
 * >> java.lang.Throwable
 * >>> java.lang.Exception
 * >>>> java.io.IOException
 * >>>>> Java.io.FileNotFoundException
 * 
 * Link: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileNotFoundException.html
 * 
 * Importing the class "FileNotFoundException"
 * for handling all the related file exceptions 
 * from java.io package
 * 
 * As a rule of thumb, all the Java exceptions are derived from the "java.lang.Exception"
 */
import java.io.FileNotFoundException;

// importing ArrayList:
import java.util.ArrayList;
/* 
 * NOTE:
 * In this example we will "Scanner" to read from the file as read from the keyboard
 */
// importing Scanner
import java.util.Scanner;

public class C4FileInput {
    public static void main(String[] args) {
        try {
            // holding the code the could cause/throw an error (exception):

            /*
             * Using Scanner class to read from file
             * as we use it to read from the keyboard
             * instead of System.in for keyboard,
             * using the File constructor to instantiate a file
             * 
             * Hint:
             * To get the file path => right click your file
             * then select "Copy Relative Path" from the context menu
             * 
             * Relative Path: Java-Essentials\src\file_io_operations\test-int.txt
             * 
             * NOTE: don't forget to escape the \ by adding another \
             */
            Scanner intFile = new Scanner(new File("Java-Essentials\\src\\file_io_operations\\test-int.txt"));

            Scanner strFile = new Scanner(new File("Java-Essentials\\src\\file_io_operations\\test-str.txt"));

            // Exception#1: Access a file that doesn't exists:
            // The exception will stop the entire application:
            // Scanner noFile = new Scanner(new
            // File("Java-Essentials\\src\\file_io_operations\\nothing.txt"));

            /*
             * Declare an empty ArrayList for our file integer values
             * 
             * Remember that we CANNOT use primitive data types with ArrayList,
             * the solution is to use the Wrapper class for the primitive data type
             */
            ArrayList<Integer> myNumbers = new ArrayList<>();

            // and so on for myLetters array list:
            ArrayList<String> myLetters = new ArrayList<>();

            /*
             * Looping through the file content (lines)
             * Using .hasNext() method to check whether
             * the file has a next line (true) or not (false)
             */
            while (intFile.hasNext()) {
                // Storing the integer values that we have inside our text file
                myNumbers.add(intFile.nextInt());
            }

            while (strFile.hasNext()) {
                // Storing the integer values that we have inside our text file
                myLetters.add(strFile.next());
            }

            System.out.println(myNumbers);

            System.out.println(myLetters);

            // close the file(s):
            intFile.close();
            strFile.close();
        }
        // Exception when the file is not exist (not found)
        // using a specific type of file exception class named "FileNotFoundException"
        // we had to import it from "java.io" package java.io.FileNotFoundException
        // e is the exception object (like in JS)
        // We can have multiple catch() block for multiple exceptions:
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Exception.html
        catch (FileNotFoundException e) {
            // printing simple message:
            System.out.println("Your file cannot be found or located!");
            // or calling the .getMessage() method of the e object:
            System.out.println(e.getMessage());
        }
    } // end main()
} // end file class
