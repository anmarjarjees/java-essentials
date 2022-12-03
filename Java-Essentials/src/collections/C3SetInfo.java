package collections;

// we need to import "Set" Interface:
import java.util.Set;

// importing "HashSet" class
import java.util.HashSet;

// importing "TreeSet" class
import java.util.TreeSet;

// "Stream" Interface
import java.util.stream.Stream;

public class C3SetInfo {
    public static void main(String[] args) {
        /*
         * Set is a unique collection of unordered objects
         * 
         * Remember that "Set" is an interface,
         * We cannot instantiate an interface => new Set()!
         * 
         * So we can create our object based on the one of
         * the classes that implements the "Set" interface
         * 
         * There are different implementation for "Set" Interface
         * In Java Collection API.
         * Some of these implementations include:
         * - HashSet
         * - TreeSet
         * - LinkedHastSet
         * as a concrete implementation for "Set" class
         * 
         * We also have to set the generic type like <String>
         * 
         * Notice that Set can hold any type of object
         */
        Set<String> myLanguages = new HashSet<>();

        // using .add() method:
        myLanguages.add("HTML and CSS");
        myLanguages.add("JavaScript");
        myLanguages.add("PHP");
        myLanguages.add("Java");
        myLanguages.add("Python");

        System.out.println(myLanguages);
        // Random order as Set doesn't preserve the insertion order:
        // [Java, HTML and CSS, JavaScript, PHP, Python]

        /*
         * With LinkedList and ArrayList
         * There is an order for the elements
         * 
         * myArrayList.add(2, "Bootstrap");
         * myLinkedList.add(2, "Bootstrap");
         * 
         * In the "Set" there is no order
         * Set is just an unordered collection of unique elements
         */

        // Error line of code:
        // myLanguages.add(2, "Bootstrap");
        /*
         * Error:
         * The method add(String) in the type Set<String> is not applicable for the
         * arguments (int, String)
         */

        System.out.println("We have " + myLanguages.size() + " languages to learn");

        /*
         * Unlike List(ArrayList, LinkedList)
         * Set has a unique set of elements,
         * we cannot add the same element/value more than on time
         * When adding an element that's already exists,
         * it will just be ignored:
         */
        myLanguages.add("Bootstrap");
        System.out.println(myLanguages);

        myLanguages.add("PHP");
        System.out.println(myLanguages);

        /*
         * To check if the Set object contains a certain element,
         * we can use .contains() method return a boolean value
         */
        System.out.println("Is C# language also included? It's " + myLanguages.contains("C#"));

        // Looping/iterating through the set:

        // looping with procedural method:
        for (String language : myLanguages) {
            System.out.println(language);
        }

        /*
         * NOTE:
         * In "Set", add() method returns a boolean value
         * - true for adding
         * - false for not adding
         */
        System.out.println(myLanguages.add("Python")); // false

        /*
         * - "TreeSet" class
         * 
         * NOTE:
         * TreeSet does order its elements/values
         * by sorting them Asc
         */

        Set<String> myCourses = new TreeSet<>();

        myCourses.add("UML");
        myCourses.add("AWP");
        myCourses.add("Java");
        myCourses.add("Database");
        System.out.println(myCourses);

        myCourses.add("Networking");
        System.out.println(myCourses);

        // remove element:
        myCourses.remove("Networking");

        // also .clear() and .isEmpty()

        /*
         * Another way of creating and adding a collection of elements at once
         * by using the Static Method .of()
         * 
         * This method accepts a comma delimited list of elements/objects
         * 
         * Set<DataType> myVariable = Set.of(e1, e2, e3, ...)
         * 
         * IMPORTANT NOTE:
         * ===============
         * Because .of() method returns an "unmodifiable" set that contains all
         * elements.
         * Our collection became an "Immutable Object"
         * which is an object with a fixed state that cannot be changed after it is
         * constructed
         */
        Set<String> colors = Set.of("Blue", "Red", "Green", "Yellow");
        System.out.println("Colors: " + colors);

        // Trying add/remove:
        /*
         * The code below will not throw a "compilation" error
         * but it will in the runtime:
         * Error: Exception in thread "main" java.lang.UnsupportedOperationException
         */
        // colors.add("White"); // Error
        // colors.remove("Yellow"); // Error

        /*
         * Iterate using forEach methods of Streams and List
         * We can use this method with ArrayList/LinkedList/Set
         */

        // 1. Creating a Stream object of "String" elements:
        Stream<String> myStream = myLanguages.stream();

        // 2. Calling .forEach() for the "Stream" object
        /*
         * Using Java "Lambda expression" ->
         * which is: Anonymous block of code that accepts parameters and returns a value
         * - Like a method but without a name
         * - It can be written and executed in-line
         * (without being called by other methods)
         * - it can have { } if we need to add multiple statements
         */
        myStream.forEach((String element) -> {
            System.out.println(element);
        });

        // Or with Less lines of Code with Functional Iteration and Lambda Expression
        /*
         * I used the variable "language"
         * to indicate the content of the set
         * we can use any variable name like "value", "element",...
         */
        myLanguages.forEach(language -> System.out.println(language));
        // OR with ( and ): (language) -> System.out.println(language)

        myLanguages.forEach(language -> {
            language = "Language: " + language;
            System.out.println(language);
        });

        // Or even using the shorthand/concise way of Lambda Expression:
        myCourses.forEach(System.out::println);

    } // main()
} // class file
