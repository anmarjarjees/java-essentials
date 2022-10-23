package file_io_operations;

import java.io.PrintWriter;
import java.util.ArrayList;

public class C7InputOutput {
    public static void main(String[] args) {
        try {
            ArrayList<String> quotes = new ArrayList<>();

            quotes.add(
                    "Life is like riding a bicycle. To keep your balance, you must keep moving. Albert Einstein");

            quotes.add(
                    "Do not dwell in the past, do not dream of the future, concentrate the mind on the present moment. Buddha");
            quotes.add(
                    "Our prime purpose in this life is to help others. And if you can't help them, at least don't hurt them. Dalai Lama");

            /*
             * Creating an empty file "quotes.txt"
             * 
             * using => new PrintWriter("quotes.text");
             * VS code will create the file inside the repo root folder:
             * java-essentials\quotes.text
             * 
             * but we can specify it to be inside this package folder of the current
             * project:
             * Java-Essentials\src\file_io_operations\quotes.txt
             */

            // PrintWriter is a checked exception that we have to acknowledge it
            PrintWriter pw = new PrintWriter("Java-Essentials\\src\\file_io_operations\\quotes.txt");

            // Using the loop to go through the list array and print its element to our file
            // "quotes.txt"
            // using the open loop to keep looping till the end of the list array
            for (String quote : quotes) {
                pw.println(quote);
            }

            // We need to close PrintWrite object after fishing the operations
            // otherwise, our text file will be empty!
            pw.close();
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            System.out.println("Error in accessing or writing to file!");
        }
    } // end main()
} // end file class
