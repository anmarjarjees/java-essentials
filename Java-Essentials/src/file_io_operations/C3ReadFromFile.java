package file_io_operations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* 
 * java.io package has the classes:
 * FileReader and BufferedWriter to wrote text files
 * FileReader and BufferedReader to read text files
 */
public class C3ReadFromFile {
    public static void main(String[] args) {
        try {
            FileReader myFile = new FileReader("Java-Essentials\\src\\file_io_operations\\testing1.txt");
            BufferedReader buffer = new BufferedReader(myFile);
            /*
             * To read the text file line-by-line,
             * use readLine() method of a BufferedReader object
             */

            // Declare and Initialize an empty String varaible for storing a line of text
            // from the file:
            String fileLine = "";
            while ((fileLine = buffer.readLine()) != null) {
                System.out.println(fileLine);
            }

            // like Scanner object, we need to close the buffer object
            buffer.close();

        } catch (IOException e) {
            // printing simple message:
            System.out.println("Cannot write on file!");
            // or calling the .getMessage() method of the e object:
            System.out.println(e.getMessage());
        }
    } // end main()
} // end C3ReadFromFile
