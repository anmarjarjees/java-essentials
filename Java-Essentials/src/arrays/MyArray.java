package arrays;

/*
 * Arrays are special variables for containing multiple values
 * Instead of many variable for saving multiple values
 * we can have one variable for saving multiple values
 *  
 * DataType[] variableName = new DataType[x]
 * where x is the number of the values inside the array and it's FIXED (no more no less) 
 * so x represents the length of the array
 * 
 * NOTE:
 * All values in the array must be of the same data type (Remember Java is a strongly data type)
 */
public class MyArray {
    public static void main(String[] args) {
        int myLuckyNumber = 7; // if I want to use one number

        // Question: What if we have 5 lucky numbers:
        int myLuckyNumber1 = 9;
        int myLuckyNumber2 = 3;
        int myLuckyNumber3 = 10;
        int myLuckyNumber4 = 25;
        int myLuckyNumber5 = 30;

        // Using an array instead:
        int[] myLuckyNumbers = new int[5];

        /*
         * - Arrays can have multiple values
         * - Each element (value) inside the array:
         * > has a unique index
         * > can act as individual variable
         * > can be accessed through its index value
         * (like StudentID for a student or employee UD for an employee)
         * We can think about the index as the ID to target every individual element in
         * the array
         * which the address to access that specific value
         * - Arrays in Java like many other languages are 0 based index,
         * so the first element/item in the array has the index of 0
         * - in the above example:
         * the value/element 10 has the index of 2
         */

        // adding values to an array:
        // myArrayName[i]=value;
        // Where i is the index
        // Don't forget that we have to start from 0:
        myLuckyNumbers[0] = 9;
        myLuckyNumbers[1] = 3;
        myLuckyNumbers[2] = 10;
        myLuckyNumbers[3] = 25;
        myLuckyNumbers[4] = 30;
        /*
         * | 9 | 3 |10 |25 |30 | => The array's values
         * | 0 | 1 | 2 | 3 | 4 | => The indices for each value
         * (each value has a unique index)
         */
        System.out.println("My first luck number is " + myLuckyNumbers[0]);

        // Creating a String array to save students' names
        String[] students = new String[6];
        students[0] = "Alex Chow";
        students[1] = "Martin Smith";
        students[2] = "Sam Simpson";
        students[3] = "Sarah Grandson";
        students[4] = "Kate Wilson";
        students[5] = "Elena Chow";

        System.out.println("The first students in the list is " + students[0]);

        // If you know the values of an array you can insert them all at once,
        // we can place the values in a comma-separated list, inside curly braces:
        // let's create an array named "languages" to contain a list of programming
        // The length of "languages" array will equal to the number of elements:
        String[] languages = { "HTML", "CSS", "JavaScript", "PHP", "Python" };
        System.out.println("our third language in the list is " + languages[2]);
        System.out.println(languages[3] + " is very popular language for back-end web development");

        /*
         * Arrays are fixed we cannot add new elements!
         */
        // adding a new element:
        // languages[5] = "Java"; // Error: Index 5 out of bounds for length 5

        // We can change an existing element by its index:
        // replace "PHP" in index 4 with "Java"
        languages[4] = "Java";

        System.out.println("Our current semester language in the list is " + languages[4]);

        /*
         * Don't forget that Java is an object-oriented programming language,
         * meaning everything in Java is an object.
         * 
         * Array as an object has properties and methods like any other language"
         */

        // Using .length property to find the length of an array:
        String[] mySubjects = { "HTML", "CSS", "Bootstrap", "JavaScript", "jQuery", "Python" };
        System.out.println(mySubjects.length);

        /*
         * You have noticed that by convention, Arrays' varaible names are plural
         * since they store multiple values
         */

    }
}
