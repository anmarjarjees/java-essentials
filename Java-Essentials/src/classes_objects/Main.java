package classes_objects;
/*
 * This class "Main" contains the entry point to our application "main()"
 */

// We need to import class "List" from java.util package
import java.util.List;
// We need to import class "ArrayList" from java.util package
import java.util.ArrayList;

// Scanner for getting user's input
import java.util.Scanner;

public class Main {
    // Declare our Scanner object inside the main class "Main"
    // to be globally available
    /*
     * NOTE:
     * This Scanner object variable "scanner" will be used
     * inside one or more static method inside this class
     * 
     * So don't forget the rule:
     * we cannot refer to any entity of class inside a static method
     * unless we make this entity static also.
     * 
     * in the example below, we need to use this "scanner"
     * inside a static method named "getStudent()"
     * so scanner has to be defined as "static"
     */
    static Scanner scanner = new Scanner(System.in);

    /*
     * Don't forget "static" for the entry point method
     */
    public static void main(String[] args) {
        /*
         * NOTE: We don't need to import our class "Rectangle"
         * since this class is inside the same package "classes_objects"
         */
        Rectangle rec1 = new Rectangle();
        rec1.setLength(42);
        rec1.setWidth(98);
        rec1.calculateArea();
        rec1.calculatePerimeter();
        // output the results:...

        // so do with other constructors
        Rectangle rec2 = new Rectangle();
        /*
         * NOTE:
         * All Java objects have a toString() method,
         * this method is automatically invoked when you print the object
         * System.out.println(myObject); // invokes myObject.toString()
         */
        System.out.println(rec2); // classes_objects.Rectangle@36baf30c

        Student stud1 = new Student("Alex Chow", 95);
        Student stud2 = new Student("Sam Simpson", 87);
        Student stud3 = new Student("Martin Smith", 91);
        Student stud4 = new Student("Sarah Gray", 88);

        Student stud5 = getStudent();
        System.out.println("You entered this name: " + stud5.getName());
        System.out.println("You entered this average: " + stud5.getAverage());

        /*
         * saving these students into a collection variable
         * Since the array size is fixed, let's use ArrayList so we can add new items
         * directly
         */
        List<Student> students = new ArrayList<Student>();
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
        students.add(stud4);
        students.add(stud5);

        System.out.println("The average of all the students in the class is:" + getClassAverage(students));

        // Calling/Using the WrapperClass
        WrapperClass wClassObj = new WrapperClass();
        wClassObj.getWrapperVariables();

        /*
         * More examples: Wrapping Variable with a class name
         */
        System.out.println();
        System.out.println("Wrapping Class Simple Examples:");
        int value1 = 10;
        System.out.println(value1);

        Integer value2 = 10;
        System.out.println(value2);

        // more example // Float
        Double salary1 = 90.90;
        System.out.println(salary1);

        double salary2 = 90.90;
        System.out.println(salary2);

        int result = salary1.compareTo(salary2); // 0, negative, positive
        System.out.println(result);
        System.out.println("End of Wrapping Class simple example");
        System.out.println();

        scanner.close();

        // Creating an object from our custom WrapperClass:
        WrapperClass wrapClass = new WrapperClass();
        wrapClass.getWrapperVariables();
    } // end main()

    // We can pass our custom objects as arguments also:

    // example1:
    public static Student getStudent() {
        System.out.println("Enter the student name:");
        String name = scanner.nextLine();

        System.out.println("Enter the student average:");
        double avg = scanner.nextDouble();

        return new Student(name, avg);
    }

    // example2:
    public static double getClassAverage(List<Student> studentList) {
        /*
         * Looping through the ArrayList elements,
         * we can use for loop or while loop
         */
        // complete the logic below:
        for (Student student : studentList) {
            // do your code...
        }
        return 0;
    }
    // Or we can create a method for that return a student object:
    // do it here...

} // end class Main
