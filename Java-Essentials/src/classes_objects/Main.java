package classes_objects;

// We need to import class "List" from java.util package
import java.util.List;
import java.io.Console;
// We need to import class "ArrayList" from java.util package
import java.util.ArrayList;

// Scanner for getting user's input
import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

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

        scanner.close();
    }

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

}
