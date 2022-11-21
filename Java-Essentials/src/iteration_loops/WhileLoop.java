package iteration_loops;

public class WhileLoop {
    public static void main(String[] args) {
        /*
         * While loop to print the numbers the "odd' numbers 1 to 10
         * 1 3 5 7...9
         */

        /*
         * System.out.println("1");
         * System.out.println("3");
         * System.out.println("5");
         * System.out.println("7");
         */

        int count = 1;
        while (count < 10) {
            // my code to be repeated
            System.out.println(count); // 1 3 5
            // count++; // adding 1
            // we can use this way:
            // count = count + 2; // 3 + 2 = 5 + 2 = 7 ... 9
            // or using the shorthand way:
            count += 2; // Java, JavaScript, Python, PHP, C#
        } // end while

        // at the end of the above loop => count = 11
        System.out.println("the value of count variable after the loop: " + count);

        // even numbers: 0 to 10:
        count = 0; // reset the count value to be 0
        while (count <= 10) {
            // my code to be repeated
            System.out.println(count); // 0 2
            count += 2; // 0 + 2 => 2 + 2 => 4...
        } // end while
    } // end main()
} // end class file
