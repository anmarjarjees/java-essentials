package collections;

// HashMap => Link: https://www.w3schools.com/java/java_hashmap.asp
import java.util.HashMap; // Importing "HashMap":
import java.util.Map;

public class C6MapLoop {
    public static void main(String[] args) {
        // Copy the same examples from the previous file:

        // Looping through a "Map" => First Way:
        /*
         * Map => Doesn't inherit from the "Collection" Interface
         * so it doesn't have the "iterator()" method
         * but it has the entrySet() method
         * this method returns a "Map" elements as a "Set"
         * Returns: a set view of the mappings contained in this map
         */
        Map<String, Integer> myBooks = new HashMap<>();
        myBooks.put("HTML and CSS", 450);
        myBooks.put("Beginning JavaScript", 739);
        myBooks.put("PHP and MySQL", 832);
        myBooks.put("Java Core", 884);
        myBooks.put("C# Programming", 832);

        // Get the iterator
        // Iterator<Integer> it = myLuckyNumbers.iterator();
        var it = myBooks.entrySet().iterator();
        System.out.println("Books Pages: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        HashMap<String, Integer> studIds = new HashMap<>();

        studIds.put("Alex Chow", 1234);
        studIds.put("Martin Smith", 5321);
        studIds.put("Sam Simpson", 8231);
        studIds.put("Kate Wilson", 9548);
        studIds.put("Sara Brightest", 9332);

        // testing:
        System.out.println(studIds);

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

        /*
         * Or using Lambda Expression with Map (Key and Value):
         * using "k" for Key and "v" for Value by convention
         */
        studIds.forEach((k, v) -> System.out.println(k + ": " + v));
    } // main()
} // class file
