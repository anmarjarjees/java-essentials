package start;

/*
 * Strings with 0 index starting point (0 based index)
 * 
 * .charAt() => string method to access a character index
 * returns the character in that index
 * 
 * Think about the keyword method as an operation
 * 
 * Concatenating
 */
public class Strings {
    public static void main(String[] args) throws Exception {
        String studentName = "Alex Chow";
        String firstName = "Alex";
        String lastName = "Chow";
        double studentAverage = 93.78;
        // Notice that VS code will show us the "index:" is 0
        char studentFirstInit = firstName.charAt(0);
        char studentSecondInit = lastName.charAt(0);

        System.out.println(studentFirstInit); // A
        System.out.println(studentSecondInit); // C
        System.out.println(studentName); // Alex Chow
        System.out.println(firstName); // Alex
        System.out.println(lastName); // Chow

        // Concatenating with the "+" as the concatenation operator as in JS:
        System.out.println(firstName + " " + lastName + " has the average of " + studentAverage);
        // Alex Chow has the average of 93.78
    }
}