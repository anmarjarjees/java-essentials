package file_io_operations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/* 
 * Importing "HashMap" class to store items in "key/value" pairs 
 */
import java.util.HashMap;
import java.util.Scanner;

public class C8PackageDefinition {
    public static void main(String[] args) {
        try {
            /*
             * In this class => combining the file input/output
             * Reading data from the two different files:
             * packages-terms.txt => contains 20 package terms
             * packages-def.txt => contains 20 package definitions
             * 
             * Both files are filled with data with exact number of lines
             * We need two Scanner objects for each of the existing file:
             */
            Scanner termFile = new Scanner(new File("Java-Essentials\\src\\file_io_operations\\packages-terms.txt"));

            Scanner defFile = new Scanner(new File("Java-Essentials\\src\\file_io_operations\\packages-def.txt"));

            // Creating our empty file "pack-terms-def.txt"
            // to be populated later with the terms from packages-terms.txt and definitions
            // from packages-def.txt
            PrintWriter pw = new PrintWriter("Java-Essentials\\src\\file_io_operations\\pack-terms-def.txt");

            /*
             * Using HashMap to store items in "key/value" pairs
             */
            HashMap<String, String> termDefMap = new HashMap<String, String>();

            String term, def;
            // Both text files have the same number of lines (same size):
            // we can pick any one of them:
            while (termFile.hasNext()) {
                term = termFile.nextLine();
                def = defFile.nextLine();
                // System.out.println(term);
                // System.out.println(def);
                pw.println(term + ": " + def + ".");
                // Add keys and values (ket, value)
                termDefMap.put(termFile.nextLine(), defFile.nextLine());
            }

            // testing:
            System.out.println(termDefMap);

            // looping through the "HashMap":
            /*
             * Remember that we can use:
             * - the keySet() method if you only want the keys
             * - the values() method if you only want the values
             * 
             * Link: https://www.w3schools.com/java/java_hashmap.asp
             */

            for (String item : termDefMap.keySet()) {
                System.out.println(item + ": " + termDefMap.get(item));
            }

            // closing the 2 Scanner objects
            termFile.close();
            defFile.close();
            // To see the effect/result, we do have to close pw
            pw.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getClass());
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getClass());
            System.out.println(ex.getMessage());
        }
    }
}
