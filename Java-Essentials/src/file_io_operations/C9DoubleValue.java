package file_io_operations;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class C9DoubleValue {
    public static void main(String[] args) {
        try {
            // COPY THE RELATIVE PATH:
            // Java-Essentials\src\file_io_operations\numbers.txt
            Scanner numFile = new Scanner(new File("Java-Essentials\\src\\file_io_operations\\numbers.txt"));
            PrintWriter pw = new PrintWriter(new File("Java-Essentials\\src\\file_io_operations\\doubling.txt"));

            int doubleNum;
            while (numFile.hasNext()) {
                // Reading an integer value from each individual line
                doubleNum = (numFile.nextInt()) * 2;

                // Print the doubled value into the file "doubling.txt":
                pw.println(doubleNum); // Each value will be printed into a new line
            }
            // closing:
            numFile.close();
            pw.close();
        } catch (Exception ex) {
            System.out.println(ex.getClass());
            System.out.println(ex.getMessage());
        }
    } // end main()
} // end file class
