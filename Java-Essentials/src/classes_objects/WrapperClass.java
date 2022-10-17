package classes_objects;

/*
 * Wrapper Class: provides a way to use primitive data types (int, boolean, etc..) as objects
 * All the 8 primitive data types have their 8 Wrapper classes:
 * int => Integer
 * double => Double
 * float => Float
 * char = Character
 * boolean = Boolean
 * short => Short
 * long => Long
 * byte => Byte 
 * 
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
        System.out.println("Practising Wrapper Class:");

        System.out.println(exam2); // exam2 is an object that has properties/methods

        /*
         * Wrapper class can convert primitive data type
         * to an object (Reference data type)
         * 
         * Which is commonly used with ArrayList as it will be discussed later...
         */
        String strNumber = "200";
        strNumber += 50;

        System.out.println(strNumber); // 20050 <==> for concatenating

        // reset the value of strNumber to "200" again:
        strNumber = "200";
        int numericValue = Integer.parseInt(strNumber);
        numericValue += 50;
        System.out.println(numericValue); // 250

        // another example:
        String strAvg = "89.73";

        double avg = Double.parseDouble(strAvg);
        System.out.println(avg); // 89.73

    } // end main()
}
