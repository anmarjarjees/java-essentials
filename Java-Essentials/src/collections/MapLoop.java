package collections;

// HashMap => Link: https://www.w3schools.com/java/java_hashmap.asp
import java.util.HashMap; // Importing "HashMap":

public class MapLoop {
    public static void main(String[] args) {
        // Copy the same example from the previous file:
        HashMap<String, Integer> studIds = new HashMap<>();

        studIds.put("Alex Chow", 1234);
        studIds.put("Martin Smith", 5321);
        studIds.put("Sam Simpson", 8231);
        studIds.put("Kate Wilson", 9548);
        studIds.put("Sara Brightest", 9332);

        // testing:
        System.out.println(studIds);

        /*
         * Loop Through a HashMap:
         */

        // Print keys
        // for (key : HashMap.keySet())
        // Use the keySet() method if you only want the keys:
        // .keySet() => Returns a Set view of the keys contained in
        for (String item : studIds.keySet()) {
            System.out.println(item);
        }

        // Use the values() method if you only want the values:'
        // Print values
        for (String item : studIds.keySet()) {
            System.out.println(item);
        }
        
        // Output/print both the keys and the values:
        for (String key : studIds.keySet()) {
            System.out.println(key + ": " + studIds.get(key));
        }

        // Print keys and values using different text format:
        for (String item : studIds.keySet()) {
            System.out.println("Student Name (Key): " + item + " - ID (Value): " + studIds.get(item));
        }
    }
}
