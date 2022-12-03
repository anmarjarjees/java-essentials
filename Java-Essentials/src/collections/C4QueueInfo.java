package collections;

import java.util.LinkedList;
import java.util.Queue;

/* 
 * For holding Items to be processed in order
 * - Ordered collection
 * - It allows duplicates
 * - first in / first out (FIFO) algorithm
 * 
 * The most common implementation of the "Queue" interface
 * is through the "LinkedList" class
 */
public class C4QueueInfo {
    public static void main(String[] args) {
        Queue<String> myLanguages = new LinkedList<>();

        // using .add() method:
        myLanguages.add("HTML and CSS");
        myLanguages.add("JavaScript");
        myLanguages.add("PHP");
        myLanguages.add("Java");
        myLanguages.add("Python");

        System.out.println(myLanguages);

        // FIFO: .remove() => we don't have to specify the element name,
        // it will move the first object (element)
        // .remove() => returns the element that was removed so we can retrieve (store)
        /*
         * NOTE:
         * The first element in the queue is called "The head"
         * os remove() => returns the head of this queue
         * Return it as an object so we cannot use String
         * Object java.util.Queue.remove()
         * Error: Type mismatch: cannot convert from Object to String
         * 
         * we can use the general data type "var" or "Object"
         * 
         * The last element is known as the "tail"
         */
        var firstObj = myLanguages.remove(); // this will remove (serve) the first element "HTML and CSS"

        System.out.println("Removed Object/Element: " + firstObj); // HTML and CSS
        System.out.println(firstObj.getClass()); // class java.lang.String

        /*
         * Queue has the peek() method to returns the head of the queue
         * which is the fist/current item to be processed
         * so we can use this method to know the head of the queue before removing it
         */
        System.out.println("The fist Object/Element (Head of the Queue): " + myLanguages.peek());

    } // main()
} // class file
