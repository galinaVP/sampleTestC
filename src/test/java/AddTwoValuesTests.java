import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static java.lang.String.*;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTests {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        int a = 10;
        int b = 5;
        int exp = 15;
        assertEquals(format("%s + %s must be %s", a, b, exp),
                exp, calc.add(a, b));
    }

    @Test
    public void testAddTwoNegativeValues() {
        int a = -10;
        int b = -5;
        int exp = -15;
        assertEquals(format("%s + %s must be %s", a, b, exp),
                exp, calc.add(a, b));
    }

    @Test
    public void testAddOneNegativeAnotherPositive() {
        int a = 10;
        int b = -10;
        int exp = 0;
        assertEquals(format("%s + %s must be %s", a, b, exp),
                exp, calc.add(a, b));
    }

    // how can we catch issue with long value for two int?
    @Test
    public void testAddResultIsLong() {
        int a = 2147483645;
        int b = 2147483645;
        long exp = (long) a + b;
        assertEquals(format("%s + %s must be %s", a, b, exp),
                exp, calc.add(a, b));
    }

    @Test
    public void testDivision() {
        int a = 1;
        int b = 2;
        double exp = 0.5;
        assertEquals(format("%s / %s must be %s", a, b, exp),
                exp, calc.division(a, b));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        int a = 2;
        int b = 0;
        calc.division(a, b);
    }

    @Test
    public void testDivisionFromZero() {
        int a = 0;
        int b = 2;
        double exp = 0;
        assertEquals(format("%s / %s must be %s", a, b, exp),
                exp, calc.division(a, b));
    }

    @Test
    public void testSquareRootResultInt() {
        int a = 100;
        double exp = 10;
        assertEquals(exp, calc.squareRoot(a));
    }

    @Test
    public void testSquareRootResultDouble(){
        int a = 700;
        double exp = 26.46;
        assertEquals(exp, calc.squareRoot(a));
    }
    @Test (expected = IllegalArgumentException.class)
    public void testSquareRootFromNegative(){
        int a = -100;
        calc.squareRoot(a);
    }
    @Test
    public void testPowPositiveToPositive(){
        int a = 2;
        int b = 3;
        double exp = 8;
        assertEquals(format("%s pow to %s must be %s",a,b,exp), exp, calc.pow(a,b));
        System.out.println( a +" pow to " + b + " equal " + exp);
    }
    @Test
    public void testPowPositiveToNegative(){
        int a = 2;
        int b = -3;
        double exp = 0.125;
        assertEquals(format("%s pow to %s must be %s",a,b,exp), exp, calc.pow(a,b));
        System.out.println( a +" pow to " + b + " equal " + exp);
    }

    @Test
    public void testPowNegativeToPositive(){
        int a = -2;
        int b = 3;
        double exp = -8;
        assertEquals(format("%s pow to %s must be %s",a,b,exp),exp, calc.pow(a,b));
        System.out.println( a +" pow to " + b + " equal " + exp);
    }
    @Test
    public void testPowPositiveToZero(){
        int a = 2;
        int b = 0;
        double exp = 1;
        assertEquals(format("%s pow to %s must be %s",a,b,exp),exp, calc.pow(a,b));
        System.out.println( a +" pow to " + b + " equal " + exp);
    }
    @Test (expected = IllegalArgumentException.class)
    public void testPowZeroToPositive(){
        int a = 0;
        int b = 2;
        calc.pow(a,b);
    }

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!!");

    }
}
