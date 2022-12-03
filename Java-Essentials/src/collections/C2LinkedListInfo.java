package collections;

import java.util.ArrayList;
/* 
 * "LinkedList" class
 * is similar to ArrayList class
 * - contains elements (objects) of the same data type
 * - has the same list of methods like ArrayList because both LinkedList and ArrayList implement the "List" interface
 * 
 * We can use both of them in the same way, but LinkedList and ArrayList are built in different way so they are implemented in different ways behind the scenes.
 * We can choose which one to use based on our application because we need to think about the performance
 * To check the differences:
 * Link: https://www.w3schools.com/java/java_linkedlist.asp
 * 
 * Use an ArrayList for storing and accessing data, 
 * and LinkedList to manipulate data.
 */
// Import the LinkedList class
import java.util.LinkedList;

public class C2LinkedListInfo {
    public static void main(String[] args) {
        LinkedList<String> carsLinkedList = new LinkedList<>();
        carsLinkedList.add("Toyota");
        carsLinkedList.add("Nissan");
        carsLinkedList.add("Dodge");
        carsLinkedList.add("Ford");
        /*
         * [Toyota] <=> [Nissan] <=> [Dodge] <=> [Ford]
         */

        ArrayList<String> carsArrayList = new ArrayList<>();
        carsArrayList.add("Toyota");
        carsArrayList.add("Nissan");
        carsArrayList.add("Dodge");
        carsArrayList.add("Ford");
        /*
         * { Toyota, Nissan, Dodge, Ford }
         */

        System.out.println(carsLinkedList);
        System.out.println(carsArrayList);
        // Identical Output for both:
        // [Toyota, Nissan, Dodge, Ford]

        // Getting the second element from ArrayList
        carsArrayList.get(1);
        /*
         * Since ArrayList is using an Array to store the values
         * Is very fast as Java will immediately jump to the right element
         * based on the index value.
         * It takes the same amount of time to grab the element in index 0
         * or the element in index 1000
         */

        // Getting element from LinkedList
        carsLinkedList.get(1);
        /*
         * Is more complex/slower as Java will have a reference
         * to the first element and the last element in the list (nothing in between)
         * Java follow the next/previous pointers to reach the right element
         */

        // Adding/Removing Element (LinkedList)=> add a second element "BMW"
        /*
         * Java will insert the node new node for "BMW"
         * in between the first node "Toyota" and the second node "Nissan"
         * then change the next pointers for both "Toyota" and "Nissan"
         * without affecting the other nodes in the list
         * so it will be much faster than ArrayList
         * 
         * The same thing with removing element
         */
        carsLinkedList.add(1, "BMW");

        // Adding/Removing Element (ArrayList)=> add a second element "BMW"
        /*
         * As array are fixed in Java, the size/length cannot be changed
         * Java has to destroy the current array and build a new one
         * as the new added element will affect the array length
         * so it will be much slower than LinkedList
         * 
         * The same issue with removing element
         */
        carsArrayList.add(1, "BMW");

        System.out.println(carsLinkedList);
        System.out.println(carsArrayList);
        // [Toyota, BMW, Nissan, Dodge, Ford]

        /*
         * However, the difference in performance cannot be noticed
         * with small list of data.
         */

    } // end main()
} // end LinkedListInfo
