/* 
Please be advised that all these code will be covered in details

The file name is a class with the name of Hello (Capital H)
So we should name our class file to be Hello in the code also

public => Access Specifier
class => Java Keyword for "Class"
Helle => Just our class name
*/
public class Hello {
    /*
     * function main() has void => doesn't return anything
     * 
     * static => function can run without the need to instantiate an object
     * It's the default function to be called for any Java program
     * 
     * String[] ards => an array for the command line arguments
     * it can be used if we want to receive input from the command line
     * 
     * System => Java predefined class
     * out => output stream object
     * println => method for printing in a new line
     */
    public static void main(String[] args) {
        System.out.println("Hello Java!");
    }
}