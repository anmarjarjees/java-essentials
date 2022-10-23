package file_io_operations;

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
 */
import java.io.FileNotFoundException;

// importing ArrayList:
import java.util.ArrayList;
/* 
 * This exception is related for file i/o operation:
 * > java.lang.Object
 * >> java.lang.Throwable
 * >>> java.lang.Exception
 * >>>> java.lang.RuntimeException
 * >>>>> java.util.NoSuchElementException
 * >>>>>> java.util.InputMismatchException
 */
import java.util.InputMismatchException;
/* 
 * NOTE:
 * In this example we will "Scanner" to read from the file as read from the keyboard
 */
// importing Scanner
import java.util.Scanner;

public class C5FileInput {
    public static void main(String[] args) {
        try {
            // holding the code the could cause/throw an error (exception):

            // Exception#2: Access a file that contains string value besides the int ones:
            Scanner mixedFile = new Scanner(new File("Java-Essentials\\src\\file_io_operations\\mixed.txt"));
            /*
             * the mixedFile:
             * Error Message => Exception in thread "main" java.util.InputMismatchException
             * 
             * so the exception is "InputMismatchException"
             */

            /*
             * Declare an empty ArrayList for our file integer values
             * 
             * Remember that we CANNOT use primitive data types with ArrayList,
             * the solution is to use the Wrapper class for the primitive data type
             */
            ArrayList<Integer> myNumbers = new ArrayList<>();

            /*
             * Looping through the file content (lines)
             * Using .hasNext() method to check whether
             * the file has a next line (true) or not (false)
             */

            while (mixedFile.hasNext()) {
                // Storing the integer values that we have inside our text file
                myNumbers.add(mixedFile.nextInt());
            }

            System.out.println(myNumbers);

            // close the file:
            mixedFile.close();

        } catch (FileNotFoundException ex) {
            // printing simple message:
            // System.out.println("Your file cannot be found or located!");
            // or calling the .getMessage() method of the e object:
            System.out.println(ex.getMessage());
        }

        // Java can handle multiple exception in two different formats:
        // https://docs.oracle.com/javase/8/docs/technotes/guides/language/catch-multiple.html
        /*
         * We are outputting the exception instead of the default error exception
         * Since the exception is "InputMismatchException"
         * we can add another catch() close for this exception
         */
        catch (InputMismatchException ex) {
            // printing simple message:
            System.out.println("Reading invalid data types: int or double as String!");
            // or calling the .getMessage() method of the e object:
            System.out.println(ex.getMessage());
        }
        /*
         * We have to start with the specific exception(s),
         * and add the general one at the end,
         * otherwise the Complier will show error:
         * Unreachable catch block for ArithmeticException. It is already handled by the
         * catch block for ExceptionJava(553648315)
         */
        // Or all the other exceptions in Java! Just use the root exception class
        // "Exception":
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    } // end main()
} // end file class
