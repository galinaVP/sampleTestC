import java.text.DecimalFormat;

/**
 * Created by kate on 1/12/16.
 */

public class Calculator {

    public static void main(String[] args) {
    }

    public long add(int a, int b) {
        return (long) a + b;
    }

    public int multiply(int a, int b) {

        return a * b;
    }

    public int subtraction(int a, int b) {

        return a - b;
    }

    public double division(int a, int b) {
        // if (b == 0)
        //    throw new IllegalArgumentException("Can't divide by zero");
        return (double) a / b;
    }

    public double squareRoot(int a) {
        /*if (a < 0)
        //    throw new IllegalArgumentException("It's not possible to count square root from negative value");
        DecimalFormat df = new DecimalFormat("#.##");
        double result = Math.sqrt(a);
        result = Double.parseDouble(df.format(result));
        return result;
         */
        return Math.sqrt(a);
    }

    public double pow(int a, int b) {
        // if (a == 0) throw new IllegalArgumentException("Zero can't be a value for pow");
        return Math.pow(a, b);
    }

}







