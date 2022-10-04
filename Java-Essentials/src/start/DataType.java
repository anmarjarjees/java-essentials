/*
in VS Code
CTRL+SHIFT+P ==> Create Java Project ==> Select a new folder
make a new class file named "InputOutput.java"
OR:
File ==> Open Folder
*/
package start;

/*
 * Data Types in Java are classified into two main categories:
 * - Primitive Types => 
 * >> are the basic data types of Java that specify the size and type of variable values
 * >> they have have no additional methods (additional operation):
 * >> They all start with lowercase letters
 * > boolean => true or false * 
 * > byte => whole number (Integral) from -128 to 127
 * > short => whole number (Integral) from  -32,768 to 32,767
 * > int => Integer (whole number or Integral) from -2,147,483,648 to 2,147,483,647
 * > long => whole numbers (Integral) from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
 * > float => Decimal Numbers (Fractional Numbers/Floating point) 6 to 7 decimal digits
 * > double => Decimal Numbers (Fractional Numbers/Floating point) 15 decimal digits
 * > char => Characters (Single letter or one symbol or ASCII values) => value in single quotation mark
 * 
 * - Reference (Non-Primitive) Data Types => refer to objects
 *  Non-primitive types are created by the programmer and is not defined by Java (except for String).
 * String: a sequence of characters with double quotation marks ""
 * Since string is built on a series of characters so it's not a basic data type
 * Reference Types have operations (method)
 * Examples: Strings, Arrays, Classes, Interfaces
 * Link: https://www.w3schools.com/java/java_data_types.asp
 * 
 * Type inference:
 * It refers to the automatic detection of the type of an expression in a formal language.
 * Using the keyword "var":
 * boolean isValid; // using boolean
 *  
 * var isChecked; // using var (Type inference)
 * TWO Conditions When using var:
 * - we must initialize the variable
 * - we must declare it locally inside/within a method
 * We CANNOT use var to define a variable at the class level
 * 
 */
public class DataType {
    public static void main(String[] args) {
        // Creating our variables:
        // Syntax: DataType label = value;
        // More valid examples of working with variables:
        /*
         * type varName; => Declare a variable of a type
         * 
         * DataType varName1, varName2,...; => Declare multiple variables
         * of the SAME data type
         * 
         * DataType varName = initialValue; => Declare a variable of a type,
         * and assign an initial value
         * 
         * DataType varName1 = initialValue1, varName2 = initialValue2,... ;
         * => Declare multiple variables of the SAME data type with initial values
         */
        // You should not abbreviate your variables, class, methods, etc... in coding
        int studentAge = 23;
        double studentAverage = 93.78;
        char studentFirstInit = 'A'; // we use ' ' with char, we cannot use " " as it's for string like in C#
        char studentSecondInit = 'C';
        boolean isPassed = true;
        String studentName = "Alex Chow";
        String firstName = "Alex";
        String lastName = "Chow";

        System.out.println(studentAge); // 23
        System.out.println(studentAverage); // 93.78
        System.out.println(studentFirstInit); // A
        System.out.println(studentSecondInit); // C
        System.out.println(isPassed); // true
        System.out.println(studentName); // Alex Chow
        System.out.println(firstName); // Alex
        System.out.println(lastName); // Chow
    }
}

/*
 * Java Variable Naming Conventions:
 * - variables start with lowercase
 * - using camelCase with more than one word
 * - No spaces
 * - Cannot start with numbers
 * - no hyphens
 * - no reserved keywords
 */