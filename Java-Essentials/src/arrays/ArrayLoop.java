package arrays;

public class ArrayLoop {
    public static void main(String[] args) {
        String[] mySubjects = { "HTML", "CSS", "Bootstrap", "JavaScript", "jQuery", "Java", "Python" };
        // Using the "length" property to find the length of the array
        for (int i = 0; i < mySubjects.length; i++) {
            if (mySubjects[i].equals("Java")) {
                System.out.println(mySubjects[i] + " [Our current course]");
            } else {
                System.out.println(mySubjects[i]);
            }
        }
    }
}
