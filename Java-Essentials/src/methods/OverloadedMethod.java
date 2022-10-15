package methods;

/**
 * OverloadedMethod:
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

    // The 3 methods below still fine since we are passing a different data types:
    // First: passing => double score
    public String getScore(double score) {
        return "Nothing just testing Overloaded Methods :-)";
    }

    // Second: passing => double score1, double score2
    public String getScore(double score1, double score2) {
        return "Nothing just testing Overloaded Methods again :-)";
    }

    // Third: passing => no arguments
    public String getScore() {
        return "Nothing just testing Overloaded Methods again :-)";
    }

    /*
     * NOTE:
     * This method below is commented because it throws an error
     * > public boolean getScore() {...}
     * > public String getScore() {...}
     * 
     * Error: Duplicate method getScore() in type OverloadedMethod
     * Because both have the same signiture getScore()
     * even if they different return data type!
     * 
     * Solution: keep only one of them or change the signiture of one of them:
     */

    /*
     * public boolean getScore() {
     * return true;
     * }
     */

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