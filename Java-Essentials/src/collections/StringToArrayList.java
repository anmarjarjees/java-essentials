package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToArrayList {
    public static void main(String[] args) {
        /*
         * For converting a string into ArrayList,
         * we can use:
         * - .split() => String Method
         * - .asList() =>
         * - .add()
         */
        String myStr = "We are studying Java Programming Language";

        // Step#1: String to a simple Array
        // ********************************
        String myStrArray[] = myStr.split(" ");

        // for testing:
        for (int i = 0; i < myStrArray.length; i++) {
            // Printing the indices (indexes) of the array with the value of each index:
            System.out.println("Index: " + i + " => " + myStrArray[i]);
        }
        System.out.println();

        // Step#2: Using the abstract method "asList()" of the class "Arrays"
        // ******************************************************************
        // "Arrays" class => needs to be imported
        /*
         * This class contains various methods for manipulating arrays (such as sorting
         * and searching). This class also contains a static factory that allows arrays
         * to be viewed as lists.
         * 
         * Link: https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
         * 
         * Using .asList() method:
         * Parameters: a the array by which the list will be backed
         * Returns: a list view of the specified array
         * Returns a fixed-size list backed by the specified array
         * 
         * Examples:
         * List<Integer> values = Arrays.asList(numbers);
         * List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
         * 
         * Link:
         * https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#asList-T...-
         * 
         * "List" Interface:
         * Link: https://docs.oracle.com/javase/8/docs/api/java/util/List.html
         */

        // Arrays.asList(...) returns a "List" object
        // "List" Interface => needs to be imported
        List<String> myStrList = Arrays.asList(myStrArray);

        // Step#3: creating the ArrayList object by passing the returned List
        // ******************************************************************
        // ArrayList
        // object from the previous step to the ArrayList Constructor:
        ArrayList<String> finalArrayList = new ArrayList<>(myStrList);
        finalArrayList.forEach(System.out::println);

        System.out.println();

        /*
         * NOTE:
         * We can combine the 3 steps into one single line as shown below:
         */
        String mySchool = "ABC Advanced Learning Academy";
        ArrayList<String> myArrayList = new ArrayList<>(Arrays.asList(mySchool.split(" ")));
        myArrayList.forEach(System.out::println);
        System.out.println();

        /*
         * Converting String of numbers into an integer or double ArrayList:
         * Using forEach()
         * Link:
         * https://docs.oracle.com/javase/10/docs/api/java/util/ArrayList.html#forEach(
         * java.util.function.Consumer)
         */
        String numberStr = "10 20 30 40 50 60 70";
        /*
         * Below we are calling .split() method inside .asList() method
         * as parameters for ArrayList:
         * You can split your code into 3 steps for more readability
         * as we did in the first step
         */
        ArrayList<String> numStrArrList = new ArrayList<>(Arrays.asList(numberStr.split(" ")));
        // for testing:
        numStrArrList.forEach(System.out::println);
        System.out.println();

        ArrayList<Integer> intArrayList = new ArrayList<>();
        numStrArrList.forEach((item) -> intArrayList.add(Integer.parseInt(item)));

        // for testing:
        numStrArrList.forEach(System.out::println);
        System.out.println();

        // Let's find the total for all the numeric integer values of the numberStr
        // Link: https://www.w3schools.com/java/java_foreach_loop.asp
        double total = 0;
        for (double number : intArrayList) {
            total += number;
        }
        System.out.println("Total: " + total);
    } // end main()
} // end class file
