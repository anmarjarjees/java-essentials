package file_io_operations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/* 
 * java.io package has the classes:
 * FileWriter and BufferedWriter to wrote text files
 * FileReader and BufferedReader to read text files
 * 
 * These sub classes of:
 * - "OutputStreamWriter" == the superclass of ==> FileWriter
 * - "InputStreamReader" == the superclass of ==> FileReader
 * Link: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileWriter.html
 * 
 */
public class C2WriteToFile {
    public static void main(String[] args) {
        try {
            /*
             * FileWriter object is created and passing to its constructor the full path
             * of the existing file to write on it
             */
            FileWriter myFile = new FileWriter("Java-Essentials\\src\\file_io_operations\\testing1.txt");
            BufferedWriter buffer = new BufferedWriter(myFile);
            buffer.write("When there is a will, there is a way!");
            buffer.newLine();
            buffer.write("Easy come, easy go!");
            buffer.newLine();

            // like Scanner object, we need to close the buffer object
            buffer.close();

        } catch (IOException e) {
            // printing simple message:
            System.out.println("Cannot write on file!");
            // or calling the .getMessage() method of the e object:
            System.out.println(e.getMessage());
        }
    } // end main()
} // end C2WriteToFile
