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

        // Use the keySet() method if you only want the keys:
        // Print keys
        for (String item : studIds.keySet()) {
            System.out.println(item);
        }

        // Use the values() method if you only want the values:'
        // Print values
        for (String item : studIds.keySet()) {
            System.out.println(item);
        }

        // Print keys and values:
        for (String item : studIds.keySet()) {
            System.out.println("Student Name (Key): " + item + " - ID (Value): " + studIds.get(item));
        }
    }
}
