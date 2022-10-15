package classes_objects;

public class Student {
    /*
     * Constructor Information List:
     * - For creating (constructing) an object from its class (blueprint)
     * - For initializing/set a value to one or more fields in an object
     * - Any class has a built-in constructor called the "Default Constructor"
     * Default Constructor doesn't have any parameters
     * - The default constructor (no parameters and empty) is always defined
     * implicitly by OOP language
     * so no need to write/declare it in any langue if doesn't do anything beyond
     * just the construction!
     * - It has an access modifier which is "public"
     * - no return data type no "void" as it's not like a normal method even if it
     * looks like
     * - The name of the constructor is the same name exactly as its class (Pascal
     * Case)
     * - it optionally have a list of parameter or no parameters
     * - We can multiple instructor but with different signiture*:
     * 
     * - Constructors or methods can't have same signature.
     * 
     * Different Signiture, means any one or all of the following:
     * - different number of parameters
     * - different order of parameters
     * - different data types of parameters
     * 
     * Notice that parameter's name is neglected,
     * so having different name/titles for the parameters doesn't mean different
     * signiture.
     * 
     * NOTE:
     * Constructor can be "private" in a very special cases to be used with
     * "Singleton design Pattern"
     * In software engineering, the singleton pattern is a software design pattern
     * that restricts the instantiation of a class to one "single" instance. This is
     * useful when exactly one object is needed to coordinate actions across the
     * system.
     * Link: https://en.wikipedia.org/wiki/Singleton_pattern#:~:text=In%20software%
     * 20engineering%2C%20the%20singleton,coordinate%20actions%20across%20the%
     * 20system.
     */
    private String name; // is set to null by default
    private double average; // is set to 0.0 by default

    // Override the default constructor to set default values for the class fields
    public Student() {
        name = null;
        average = 0;
    }

    // Adding another constructor:
    public Student(String name) {
        this.name = name;
        average = 0;
    }

    public Student(String name, double average) {
        // Instead of direct assignning
        /*
         * this.name = name;
         * this.average = average;
         */
        // we can invoke our setters (if available) for better validation
        setName(name);
        setAverage(average);
    }

    // add getters and setters:
    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    /*
     * We can set the name field with a simple setter:
     * 
     * public void setName(String name) {
     * this.name = name;
     * }
     * 
     * But it's better to add some validation:
     */
    public void setName(String name) {
        if (name.length() > 40) {
            System.out.println("Maximum 40 characters");
        } else {
            this.name = name;
        }
    }

    public void setAverage(Double avg) {
        if (avg > 100 || avg < 0) {
            System.out.println("Invalid Average Value");
        } else {
            average = avg;
        }
    }
}
