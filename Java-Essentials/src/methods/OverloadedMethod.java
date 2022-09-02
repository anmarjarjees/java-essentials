package methods;

/**
 * OverloadedMethod
 * 
 * When two methods or more:
 * - living (created) inside the same class
 * - have the same name
 * - have different signatures (different parameter lists) =>
 * > either different data type parameters
 * > or different number of parameters or both
 * This is called "Overloaded"
 */
public class OverloadedMethod {
    public static void main(String[] args) {

    }

    // Example of Overloaded Methods
    // They both have the same name but they are different in their parameter list
    public String getScore(int score) {
        if (score <= 50) {
            return "Low Score";
        } else if (score <= 70) {
            return "Moderate Score";
        } else if (score <= 100) {
            return "High Score";
        } else {
            return "Invalid Score!";
        }
    }

    // Below still fine since we are passing a different data type
    public String getScore(double score) {
        return "Nothing just testing Overloaded Methods :-)";
    }

    // The function below will generate an error:
    // The error: Duplicate method getScore(double) in type OverloadedMethod
    // public String getScore(double value) {
    // return "Nothing just testing Overloaded Methods :-)";
    // }

    public int getScore(String score) {
        return (switch (score) {
            // we can use comma(s) to combine two or more conditions
            // (listing all the applicable cases delimited by a comma)
            case "HIGH" -> 100;
            case "Moderate" -> 70;
            case "LOW" -> 50;
            default -> 0;
        });
    }
}
// end class OverloadedMethod