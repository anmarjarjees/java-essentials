package collections;
/* 
 * Collection consists of objects known as "elements"
 * Collections:
 * - duplicate elements or uniques elements
 * - ordered or not ordered
 * 
 * Java provides "Collection Framework" that has many classes and interfaces
 * "Collection" is an interface and the root of all the other classes
 * It Can be found in java.util.* package
 * 
 * Most commonly used interfaces like: "List", "Set", "Queue", 
 * inherit from "Collection" 
 * 
 * "Map" is special data structure as it doesn't inherit from the interface
 * 
 * Some of the "List" interface implementations include the following classes:
 * - ArrayList
 * - LinkedList
 * - Stack
 * - Vector
 */

/* 
 * List works the same way as ArrayList
 * we need to import both: ArrayList and List
 */
import java.util.ArrayList;
import java.util.List;
/* 
 * Importing the interface "Iterator"
 * to iterate though a list
 * check the code/comment at the end of the file
 */
import java.util.Iterator;

/* 
 * Using List is the same as using ArrayList
 */
public class C1ListInfo {
    public static void main(String[] args) {
        // It works like ArrayList
        List<Integer> myLuckyNumbers = new ArrayList<>();
        /*
         * We can use the same methods as we used with ArrayList:
         */
        myLuckyNumbers.add(10);
        myLuckyNumbers.add(20);
        myLuckyNumbers.add(30);
        myLuckyNumbers.add(40);
        myLuckyNumbers.add(50);
        System.out.println(myLuckyNumbers);

        /*
         * .subList(int fromIndex, int toIndex)
         * returns a view of th portion of the list between:
         * - fromIndex (inclusive)
         * - toIndex (exclusive)
         * 
         * Task:
         * Take the first 3 values (elements) from "myLuckyNumbers" list
         * and save it into a new list
         * 
         * Notice that .subList will return a list,
         * so the variable "MyBestNumbers" has to be declared as "List<Integer>"
         * not "ArrayList<Integer>"
         * 
         * Otherwise, Java Error:
         * Type mismatch: cannot convert from List<Integer> to ArrayList<Integer>
         */
        List<Integer> MyBestNumbers = new ArrayList<>();
        MyBestNumbers = myLuckyNumbers.subList(0, 3);
        System.out.println(MyBestNumbers);

        /*
         * Looping through a list using "Iterator"
         * "Collection" Interface provides an "Iterator"
         * "Iterator" is an object that can be used to loop through collections,
         * like ArrayList and HashSet.
         * "iterator" as "iterating" is the technical term for looping.
         * 
         * To use an Iterator, you must import it from the java.util package.
         * 
         * Link: https://www.w3schools.com/java/java_iterator.asp
         */

        // Get the iterator
        Iterator<Integer> it = myLuckyNumbers.iterator();
        /*
         * next() => return the first element
         * hasNext, return true if there are more item(s) to process
         * or false if it has reached the end of the collection
         * 
         * To loop through a collection,
         * use the hasNext() method of the Iterator
         */

        // Testing:
        // Print the the next element in the list (will be the first item)
        System.out.println(it.next());

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        /*
         * The "iterator()" method are available for all these interfaces:
         * > Set
         * > List
         * > Queue
         * x Map => Doesn't inherit from the "Collection" Interface
         * so it doesn't have the "iterator()" method
         * will be covered in its class file
         */

        /*
         * Loop Through a List:
         * Using the form of looping which is called "Enhanced for Loop"
         * It works with any type of collections
         */

        // Declare every element as "int" based on our list contents:
        // we can use element, luckyNumber, x, or any variable name
        // Let's name it "luckyNumber" as a singular element from the lucky numbers
        for (int luckyNumber : myLuckyNumbers) {
            System.out.println(luckyNumber);
        }

    } // main()
} // class file
