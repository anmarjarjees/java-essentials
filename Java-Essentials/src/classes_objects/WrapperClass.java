package classes_objects;

/*
 * Wrapper Class: provides a way to use primitive data types (int, boolean, etc..) as objects
 * All the primitive data types have Wrapper class
 * Link https://www.w3schools.com/java/java_wrapper_classes.asp
 */
public class WrapperClass {
    // no need for a constructor, using the default one => new WrapperClass()

    public void getWrapperVariables() {
        int exam1 = 86; // int is primitive data type
        Integer exam2 = 89; // Integer => is wrapper class for the primitive data type "int"

        /*
         * exam1 is a simple int variable with value of 86
         * exam2 is an object
         */
        System.out.println(exam1);
        System.out.println(exam2);
    }
}
