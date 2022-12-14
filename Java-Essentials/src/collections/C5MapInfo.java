package collections;
/* 
 * We covered ListArray which is a type of List 
 * and List is a type of a "Collection"
 * 
 * Map is not a true collection, its characteristics and behaviors are different than the other collections, 
 * but it's still considered to be part of the "Collection" framework
 * Map is an incompatible type in comparing to List, Set and Queue which are a collection of similar kind of 
 * objects that contain just values where a Map is a collection of key and value pairs.
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
import java.util.Map;

public class C5MapInfo {
    public static void main(String[] args) {
        /*
         * "Map" Interface:
         * Map: set of key/value pairs
         * Examples (looks like JSON object, but without commas):
         * {
         * "Student Name": "Alex Chow"
         * "Program" : "Computer Programming"
         * "Module" : "Java Fundamentals" *
         * }
         * The key "Student Name" has the value of "Alex Chow"
         * 
         * Important Note:
         * > We can NOT have duplicate keys => keys are unique
         * > We can have duplicate values
         * > The keys (elements) are unordered
         * > The keys and values could be of any data type
         * 
         * 
         * Java will ask to identify the data types of key/values
         * key => value
         * Student Name => Student ID value
         * String data type => Integer data type
         * 
         * The popular implementation of Map structure are done by using:
         * - "HashMap" class
         * - "TreeMap" class
         * - "LinkedHashMap" class
         * 
         * The class "HashMap" is an implementation of the interface "Map"
         * 
         * Notice the use of Wrapper Class "Integer"
         * in other words, using the object type of the primitive data type
         * for the same reason as we did with Array list
         * we cannot use primitive data types
         * int => Integer
         * double => Double
         * float => Float
         * 
         * Also the old syntax (still valid):
         * HashMap<String, Integer> studIds = new HashMap<String, Integer>();
         * 
         * But the new one:
         * HashMap<String, Integer> studIds = new HashMap<>();
         */

        /*
         * Example of creating a collection of books named "myBooks"
         * that contains the book names as the key
         * and the number of pages as the value
         */
        Map<String, Integer> myBooks = new HashMap<>();
        /*
         * unlike other collection,
         * Map uses put to add element (not add)
         */
        myBooks.put("HTML and CSS", 450);
        myBooks.put("Beginning JavaScript", 739);
        myBooks.put("PHP and MySQL", 832);
        myBooks.put("Java Core", 884);
        myBooks.put("C# Programming", 832);

        System.out.println(myBooks);
        /*
         * {
         * C# Programming=832,
         * Beginning JavaScript=739,
         * HTML and CSS=450,
         * PHP and MySQL=832,
         * Java Core=884
         * }
         */

        /*
         * We also have Map Interface that specifies Map implementations
         * HashMap is one of the Map interface implementations
         * 
         * Both Map and HashMap works the same regarding the programmers perspective,
         * but they have different implementation under the hood
         */

        /*
         * Creating a Map:
         * Students name and Students IDs
         */

        HashMap<String, Integer> studIds = new HashMap<>();
        // add elements (key and value):
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
         * .containsValue() => Check if certain value is exists:
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
        studIds.replace("Sara Grand", 9876); // no changes
        // testing:
        System.out.println(studIds);

        // Testing our custom method changeValue():
        changeValue(studIds, "Kate Wilson", 1010);
        System.out.println(studIds);

        // call our method with a NOT exist Key:
        changeValue(studIds, "James Dean", 1000); // no changes

        // Removing an item => passing the key on element
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

    /*
     * Adding our custom method for for changing the value of a key
     * changing the students ID:
     */
    static void changeValue(HashMap<String, Integer> tempMap, String key, int value) {
        tempMap.replace(key, tempMap.get(key), value);
    }
} // end file class
