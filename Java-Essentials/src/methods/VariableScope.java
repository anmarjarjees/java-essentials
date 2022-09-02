package methods;

import java.util.Scanner;

/*
 * Variable Scope:
 * Variable can be accessed/used 
 * within the block (scope) in which they were defined
 * 
 * The scope of the variable is inside the curly  { } braces
 * in which it was defined
 * 
 * So the scope of the variable is based on any level of code:
 * - varaible declared inside a method block {}:
 * it can be used inside { } of this method
 * 
 * - varaible declared inside a decision structure like an if block {}:
 * it can be used inside { } of this if statement
 * 
 *  - varaible declared inside a loop structure like for loop block {}:
 * it can be used inside { } of this for loop 
 * 
 * and so on...
 * 
 * so the variable scope is determined by the curly braces
 * in which the variable is defined
 * 
 * Global vs Local:
 * variables that are defined inside methods, conditions, loops are or any other blocks are called local variables. Global variables are defined outside of methods or other block just withing the scope of the main class {}. So the scope of the global variable is the entire class. Global variables can be referenced from any where in the class.
 * 
 * variables can have the same names since they are defined in different scope.
 * 
 * NOTE: scope topic when using methods will mush clear when we start OOP topics
 * 
 * Link: https://www.w3schools.com/java/java_scope.asp
 */
public class VariableScope {
    // Adding some samples of local and global variable:

    // Here is a global variable (within the scope of the main class):
    // This global variable can be referenced form anywhere in the class
    // As it's declared in the class level
    String myGlobalVar = "I am the content of your Global variable :-)";

    public static void main(String[] args) {

        String currentLang = "Java";
        System.out.println("We are studying " + currentLang + " Language.");

        /*
         * Block Scope
         * A block of code refers to all of the code between curly braces {}.
         * Variables declared inside blocks of code
         * are only accessible by the code between the curly braces,
         * which follows the line in which the variable was declared:
         */
        if (true) {
            String nextLang = "C#";
            System.out.println(
                    "Yes, you are studying " + currentLang + " Language. Later, you should learn " + nextLang
                            + " as you will need it in the next semester to build ASP.NET Web Applications");
        }

        // Using the same variable "currentLang" within the same scope of the main()
        // method
        currentLang = "HTML and CSS"; // reassign a value to the same variable "currentLang"
        if (true) {
            /*
             * Notice that this variable "nextLang" is not the same as the previous one!
             * Each one is declared in a separate block *
             */
            String nextLang = "JavaScript";
            System.out.println(
                    "After learning " + currentLang + ", the next logical step is to learn " + nextLang);
        }

        // System.out.println(nextLang); // This line will throw an error

    } // end main

    //
    public static void welcomeEmp() {
        System.out.println("What's your name?");
        Scanner input = new Scanner(System.in);
        /*
         * Method Scope:
         * Variables declared directly inside a method
         * are available anywhere in the method
         * following the line of code in which they were declared:
         * 
         * empName variable is declared inside this method so it has a local scope to
         * this method only
         */
        String empName = input.next();
        System.out.println("Welcome " + empName + ". ");
        System.out.println(empName + " will be your instructor for " + " course.");
        input.close();
    } // end welcomeEmp

    // NOTE:
    // These methods myMethod1 and MyMethod2 doesn't have the keyword "static"
    // So they cannot be called/used within the class itself
    // have to be called/used through the instance (object) of "VariableScope" class
    // I had to make them "not static" so we can access
    // and practice the idea a global non-static varaible "myGlobalVar"
    /*
     * If you keep the keyword "static",
     * Java will through this error:
     * "Cannot make a static reference to the non-static field myGlobalVar"
     * unless if we convert the global variable to be static variable,
     * so it can be used by a static method. These topics will be covered in the
     * section of OOP
     */
    public void myMethod1() {
        String myLocal = "I am the text of the local varaible \"myLocal\" inside myMethod1";
        System.out.println("myLocal variable 1: " + myLocal);
        System.out.println("The global variable myGlobalVar:" + myGlobalVar);
    }

    public void MyMethod2() {
        String myLocal = "I am the text of the local varaible \"myLocal\" inside myMethod2";
        System.out.println("myLocal variable 2: " + myLocal);
        // Let's try to create a local variable (method scope) with the same name as the
        // global one:
        // Java will use the value of this local "myGlobalVar" as it has a lesser scope
        // Java will not use the value of the global "myGlobarVar" as it has a wider
        // scope
        String myGlobalVar = "Don't be confused, I am no more Global variable :-(";
        System.out.println("The global variable myGlobalVar (I don't think so):" + myGlobalVar);
        /*
         * To force Java calling the initial global varaible "myGlobalVar"
         * and ignore the closest one "myGlobalVar"
         * we can use the keyword "this"
         * we are telling Java to use "myGlobalVar" of "this" class
         * or that belongs to "this" class
         */
        System.out.println("The global variable myGlobalVar (Yes this is the real global):" + this.myGlobalVar);
    }
} // End class "VariableScope"
