package classes_objects;
/*
 * Objects/class can store/have two members:
 * - fields (variables)
 * - behaviour (methods)
 * 
 * Creating a class for a Rectangle object:
 * Thinking about the class "Rectangle" as an object
 * to come up with its characteristics and specs of a rectangle
 * and the actions that we can perform on a rectangle
 * 
 * "private", "public", "protected", and "default" called "Access Modifiers" also called "Visibility Modifiers"
 * 
 * NOTE#1: 
 * This class doesn't have a main method, 
 * as we are not intended to execute any of the method
 * within the class itself!
 * We just want to build it as "Blueprint" for other objects
 * or it is called a "General Representation"
 * 
 * NOTE#2: 
 * When creating a class in JavaScript:
 * - Adding "public" to make accessible everywhere and this is the way to go with almost all the time
 * - We cannot use "private" or "protected" for a class definition, these modifiers can be used for the class' members
 * - If you don't use "public" and leave it empty, Java will use the "default" access modifier
 */

public class Rectangle {
    /*
     * Declaring the global variable of an object:
     * Inside an object (class) these variables are called "fields"
     * 
     * A rectangle can have a length and width
     * 
     * If a class has no modifier (the default, also known as package-private),
     * it is visible only within its own package (packages are named groups of
     * related classes)
     * Link:
     * 
     * public fields are AGAINST encapsulations
     * so we should make them private:
     * - public: Any other class or instance of that class can access this public
     * field/method
     * - private: this private field/method can be accessed by by the same class or
     * within the class itself
     * 
     * Encapsulation: specifies that:
     * - the data of a class which are fields should be "private"
     * - the behaviour of a class which are methods can be "public" to its
     * instances/objects or other classes
     * 
     * NOTE:
     * We cannot add the keywords "protected", "private" access modifiers to classes
     * or interfaces.
     * we will have this error: "Default methods are allowed only in interfaces"
     * As the error indicates, the keyword "default" can be used only with
     * interfaces
     * (Interfaces will be covered later...)
     * So in case no "private", "public", "protected" keyword is added
     * Java will implicitly use the "default" modifier but we CANNOT type the
     * keyword "default".
     * Creating a class without any access modifier, Java will set it to "default"
     * 
     * Example:
     * This class is accessible by all the classes inside its package
     * but it is not accessible from outside this package,
     * and the same rule for default field/method are also accessible inside the
     * package
     * 
     * class Circle {
     * // field
     * // behaviour
     * }
     *
     * 
     * These modifiers can used to set the visibility of or determine how to access
     * the:
     * - data (filed)
     * - methods
     * - Class constructor
     * - and the class itself
     * 
     * "default" =>
     * "protected" => only other classes within the same package that inherit from
     * the current class can access it (notice that protected field cannot be
     * accessed by an object)
     * 
     * Link: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
     */
    private double length;
    private double width;

    /*
     * Thinking about the actions (methods)?
     * How can we use the rectangle fields?
     * 
     * To find the parameter of this rectangle:
     * Perimeter = 2 × (a + b)
     */
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateArea() {
        return length * width;
    }
    /*
     * In order to be able to run these two methods:
     * - calculatePerimeter()
     * - calculateArea()
     * 
     * We need to know the value of length and width
     * 
     * We can set values to these two methods either by:
     * - using Constructor method (function)
     * - Getter and Setter methods for each field:
     */

    // get the length()
    public double getLength() {
        return length;
    }

    // set the length()
    public void setLength(double length) {
        this.length = length;
    }

    // do the same for width:
    public double getWidth() {
        return width;
    }

    // set the width()
    public void setWidth(double width) {
        this.width = width;
    }

    /*
     * The following method has no access modifier,
     * so it will be set to "default"
     * remember that we cannot add "default"!
     * Error: Default methods are allowed only in interfaces
     */
    void saySomething() {
        System.out.println("My current shape is 'Rectangle'");
    }

}
