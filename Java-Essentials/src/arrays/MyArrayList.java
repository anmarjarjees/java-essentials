package arrays;

// import the "ArrayList" class from "java.util" package
/* 
 * ArrayList has a flexible size, we can add/remove elements
 */
import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        // Create ArrayList object "cars" of "String" data type
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Nissan");
        cars.add("Dodge");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        // .get() method to access an item in the array list:
        String car1 = cars.get(0); // access the first element
        String car2 = cars.get(1); // access the second element
        System.out.println("First Car: " + car1);
        System.out.println("Second Car: " + car2);

        // .set() method to change an item in the array list:
        // modify the third element "Dodge" to be "Jeep"
        // third element has index of 2:
        cars.set(2, "Jeep");

        System.out.println(cars);

        // .size() method returns the array size/length
        cars.size();

        // .remove() method to remove an item from the array list:
        // remove the last item:
        // cars.remove(cars)

    }

}