package file_io_operations;

import java.io.PrintWriter;
// import the major general exception class:
import java.lang.Exception;
/* 
 * For writing to a file, 
 * we can use "PrintWriter" class from java.io package
 * Link: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/PrintWriter.html
 */

/* 
 * File Output:
 * Writing data from our application primary memory (RAM) 
 * to a permanent secondary storage unit
 */
public class C6FileOutput {
    public static void main(String[] args) {
        try {
            /*
             * Besides the buffered writer/reader,
             * Relative Path: Java-Essentials\src\file_io_operations\anyName.txt
             * The command below will create a new file named "testing2.txt":
             */
            PrintWriter pw = new PrintWriter("Java-Essentials\\src\\file_io_operations\\testing2.txt");

            pw.println(
                    "Life is like riding a bicycle. To keep your balance, you must keep moving. Albert Einstein");

            pw.println(
                    "Do not dwell in the past, do not dream of the future, concentrate the mind on the present moment. Buddha");

            pw.println(
                    "Our prime purpose in this life is to help others. And if you can't help them, at least don't hurt them. Dalai Lama");
            /*
             * Since we used println for the last sentence,
             * we will have a new empty line at the end of the file
             */

            // closing the object:
            pw.close();

            // testing div by 0 exception:
            int x = 100;
            int y = 0;
            double result = x / y;

            System.out.println(result);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage()); // by zero
        }
        // Using General Exception
        catch (Exception ex) {
            System.out.println(ex.getClass()); // class java.lang.ArithmeticException
            System.out.println(ex.getMessage()); // by zero
        } // end catch()

    } // end main()
} // end file class
