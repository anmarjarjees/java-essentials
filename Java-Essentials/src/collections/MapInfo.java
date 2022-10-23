package collections;
/* 
 * We covered ListArray which is a type of List 
 * which is a type of a "Collection"
 * 
 * HashMap:
 * Package java.util
 * Class HashMap<K,V>
 * > java.lang.Object
 * >> java.util.AbstractMap<K,V>
 * >>> java.util.HashMap<K,V>
 
Type Parameters:
K - the type of keys maintained by this map
V - the type of mapped values
All Implemented Interfaces:
Serializable, Cloneable, Map<K,V>
 */

// HashMap => Link: https://www.w3schools.com/java/java_hashmap.asp
/* 
 * Importing "HashMap":
 */
import java.util.HashMap;

public class MapInfo {
    public static void main(String[] args) {
        /*
         * Map: set of key/value pairs
         * Examples (looks like JSON object, but without commas):
         * {
         * "Student Name": "Alex Chow"
         * "Program" : "Computer Programming"
         * "Module" : "Java Fundamentals" *
         * }
         * The key "Student Name" has the value of "Alex Chow"
         * > We can NOT have duplicate keys => keys are unique
         * > The keys and values could be of any data type
         * 
         * Creating a Map:
         * Students name and Students IDs
         * 
         * Java will ask to identify the data types of key/values
         * key => value
         * Student Name => Student ID value
         * String data type => Integer data type
         * 
         * The implementation of Map structure are done by using a class "HashMap"
         * The class "HashMap" is an implementation of the interface "Map"
         * 
         * Notice the use of Wrapper Class "Integer"
         * in other words, using the object type of the primitive data type
         * for the same reason as we did with Array list
         * we cannot use primitive data types
         * 
         * Also the old syntax (still valid):
         * HashMap<String, Integer> studIds = new HashMap<String, Integer>();
         * 
         * But the new one:
         * HashMap<String, Integer> studIds = new HashMap<>();
         */

        HashMap<String, Integer> studIds = new HashMap<>();

        /*
         * We also have Map Interface that specifies Map implementations
         * HashMap is one of the Map interface implementations
         * 
         * Both Map and HashMap works the same regarding the programmers perspective,
         * but they have different implementation under the hood
         */

        studIds.put("Alex Chow", 1234);
        studIds.put("Martin Smith", 5321);
        studIds.put("Sam Simpson", 8231);
        studIds.put("Kate Wilson", 9548);
        studIds.put("Sara Brightest", 9332);

        // testing:
        System.out.println(studIds);
        /*
         * You can see that HashMap doesn't keep the order of the elements
         * which is one of the reasons why it's faster than "Map"
         */
        /*
         * {
         * Sam Simpson=8231,
         * Alex Chow=1234,
         * Sara Brightest=9332,
         * Kate Wilson=9548,
         * Martin Smith=5321
         * }
         */

        /*
         * Getting one student ID:
         * Using the get() method by referring to its key "the student name":
         */
        System.out.println(studIds.get("Alex Chow")); // 1234

        /*
         * Check if certain key is exists:
         */
        System.out.println(studIds.containsKey("Sam Simpson")); // true
        System.out.println(studIds.containsKey("Marcus Miller")); // false

        /*
         * Check if certain value is exists:
         */
        System.out.println(studIds.containsValue(8231)); // true
        System.out.println(studIds.containsValue(9988)); // false

        /*
         * Adding a new item with put()
         * if the key that already exists,
         * Java will just override the current key value with the new added one over it
         * So be careful with using this command
         */
        studIds.put("Alex Chow", 4321);
        System.out.println(studIds.get("Alex Chow")); // 4321

        /*
         * For more caution, you can use putIfAbsent()
         */
        studIds.putIfAbsent("Alex Chow", 1111); // will be ignored
        // testing:
        System.out.println(studIds);

        studIds.putIfAbsent("Allen Chow", 2222);
        // testing:
        System.out.println(studIds);

        /*
         * Replacing the value (id) for key (student name) "Sam Simpson"
         */
        studIds.replace("Sam Simpson", 1212);
        System.out.println(studIds.get("Sam Simpson")); // 4321

        /*
         * Replacing the value (id) for key (student name) "Sara Grand"
         * Notice that there is no student with such name,
         * so this change will be ignored
         */
        studIds.replace("Sara Grand", 9876);
        // testing:
        System.out.println(studIds);

        // Removing an item
        studIds.remove("Allen Chow");
        // testing:
        System.out.println(studIds);

        /*
         * To remove all items, use the clear() method
         */
        studIds.clear();
        // testing:
        System.out.println(studIds); // {}

        // adding the items again:
        studIds.put("Alex Chow", 1234);
        studIds.put("Martin Smith", 5321);
        studIds.put("Sam Simpson", 8231);
        studIds.put("Kate Wilson", 9548);
        studIds.put("Sara Brightest", 9332);

        /*
         * use .size() method to return the Map size:
         */
        System.out.println(studIds.size()); // 5
    } // end main()
} // end file class
