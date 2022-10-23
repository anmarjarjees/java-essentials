package file_io_operations;

/* 
 * Importing the class "File" => import java.io.File;
 * "File" class can be used to access files or complete directories
 * for handling all the related file create/input/read operations 
 * from java.io package
 * or just import everything:
 */
import java.io.File;

/* 
 * Importing the class "IOException"
 * for handling all the related file exceptions 
 * from java.io package
 */
import java.io.IOException;

// importing ArrayList:
import java.util.ArrayList;

public class C1CreateFile {
    public static void main(String[] args) {

        try {
            // holding the code the could cause/throw an error (exception):

            /*
             * First creating a file object:
             * and passing the file name (or the directory name) to the constructor
             * Note: creating a File object doesn't actually create a file,
             * it just for representing the file
             * to be create it later using ..createNewFile() method of the File object
             * 
             * If we don't specify the path, the file will be created inside the project
             * root folder
             * 
             * Creating a file in a specific directory by specifying the path of the file
             * and use double backslashes to escape the "\" character (for Windows).
             * On Mac and Linux you can just write the path, like: /Users/name/filename.txt
             * 
             * Link: https://www.w3schools.com/java/java_files_create.asp
             */
            File myFile = new File("Java-Essentials\\src\\file_io_operations\\testing1.txt");

            // Check if the file is exist:
            /*
             * the .exists() method returns:
             * - true if the named file does not exist and was successfully created
             * - false if the named file already exists
             * 
             * If you run the application for the very first time:
             * the if block will be executed
             * If you run the application for the next time:
             * the else block will be executed
             */

            // myFile.createNewFile()
            if (myFile.createNewFile()) {
                System.out.println("Created File Name: " + myFile.getName());
            } else {
                System.out.println("File already exists!");
            }

            /*
             * Declare an empty ArrayList for our file integer values
             * 
             * Remember that we CANNOT use primitive data types with ArrayList,
             * the solution is to use the Wrapper class for the primitive data type
             */
            ArrayList<Integer> myNumbers = new ArrayList<>();
            System.out.println(myNumbers);
        }
        // Exception when the file is not exist (not found)
        // using a specific type of file exception class named "FileNotFoundException"
        // we had to import it from "java.io" package java.io.FileNotFoundException
        // e is the exception object (like in JS)
        catch (IOException e) {
            // printing simple message:
            System.out.println("Your file cannot be created!");
            // or calling the .getMessage() method of the e object:
            System.out.println(e.getMessage());
        }

    }
}
