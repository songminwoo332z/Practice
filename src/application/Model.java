package application;

public class Model {

    public int calculate(String operator, int x, int y) {
        if (operator.equals("+")) {
            return x + y;
        } else if (operator.equals("-")) {
            return x - y;
        } else if (operator.equals("*")) {
            return x * y;
        } else if (operator.equals("%")) {
            return x * y / 100;
        } else {
            return x / y;
        }
    }
}
