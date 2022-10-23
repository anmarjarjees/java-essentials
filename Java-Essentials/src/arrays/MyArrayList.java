package arrays;

/* 
 * Array List: is part of "collections"
> Package java.util
>> Class ArrayList<E>
>>> java.lang.Object
>>>> java.util.AbstractCollection<E>
>>>>> java.util.AbstractList<E>
>>>>>> java.util.ArrayList<E>

public class ArrayList<E>
extends AbstractList<E>
implements List<E>, RandomAccess, Cloneable, Serializable

Link: https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/ArrayList.html
 * - Has Flexible size, we can add/remove elements
 * - It's part of the "java.util" package
 * - Can only hold reference data type values (elements), not primitive,
 * The good news there is solution to overcome this limitation
 */

// import the "ArrayList" class from "java.util" package
import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        /*
         * We don't have to specify a size :-)
         * 
         * Using the new keyword for the ArrayList constructor
         * and also using the diamond operator <>
         * the symbol <> is to define what is called "Generic Type"
         * = new ArrayList<>()
         * 
         * before Java 7, we used to add/repeat the same data type <string>
         * but then they just removed it to be empty
         * 
         * Old Syntax (still valid):
         * ArrayList<String> myLanguages = new ArrayList<String>();
         * 
         * New Syntax:
         * ArrayList<String> myLanguages = new ArrayList<>();
         */
        //
        ArrayList<String> myLanguages = new ArrayList<>();

        // using .add() method:
        myLanguages.add("HTML and CSS");
        myLanguages.add("JavaScript");
        myLanguages.add("PHP");
        myLanguages.add("Java");
        myLanguages.add("Python");

        // Create ArrayList object "cars" of "String" data type
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Nissan");
        cars.add("Dodge");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        // .get() method to access an item in the array list:
        String car1 = cars.get(0); // access the first element
        String car2 = cars.get(1); // access the second element
        System.out.println("First Car: " + car1);
        System.out.println("Second Car: " + car2);

        // .size() method returns the array size/length
        cars.size();

        // using the normal loops, but we cannot use .length property!
        // ArrayList has a method .size() to return is length:
        for (int i = 0; i < myLanguages.size(); i++) {
            // Yes, using .get(i) method instead of [i]
            System.out.println(myLanguages.get(i));
        } // end for

        // .set() method to change an item in the array list:
        // modify the third element "Dodge" to be "Jeep"
        // third element has index of 2:
        cars.set(2, "Jeep");

        // testing:
        System.out.println(cars);

        // .remove() method to remove an item from the array list:
        // remove the last item:
        cars.remove(cars.size() - 1);

        // testing:
        System.out.println(cars);

        /*
         * Creating an array list of integer values
         */
        ArrayList<Integer> myLuckyNumbers = new ArrayList<>();
        myLuckyNumbers.add(10);
        myLuckyNumbers.add(20);
        myLuckyNumbers.add(30);
        myLuckyNumbers.add(40);
        myLuckyNumbers.add(50);

        // notice we can get the value as primitive data type:
        int mySecondLuckyNumber = myLuckyNumbers.get(1);

        for (int i = 0; i < myLuckyNumbers.size(); i++) {
            // Yes, using .get(i) method instead of [i]
            System.out.println(myLuckyNumbers.get(i));
        } // end for

    }

}