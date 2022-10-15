package methods;

public class Calculation {
    private int num1;
    private int num2;

    public Calculation(int x, int y) {
        num1 = x;
        num2 = x;
    }

    private boolean areNumbers() {
        // checking if these num1 and num2 are numeric values
        return true;
    }

    // add method:
    public int add() {
        // call the areNumbers() first to check if num1 and num2 are numeric values
        if (areNumbers()) {
            return num1 + num2;
        } else {
            return 0;
        }
    }

    // sub method:

    // div method:

    // mul method:
}
