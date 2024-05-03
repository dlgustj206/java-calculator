package test;

import static org.junit.Assert.assertEquals;

import model.CalculatorModel;
import org.junit.Before;
import org.junit.Test;

public class CalculatorModelTest {

    private CalculatorModel model;

    @Before
    public void setUp() {
        model = new CalculatorModel();
    }

    @Test
    public void testAddition() {
        assertEquals(4, model.calculate(2, 2, "+"));
    }

    @Test
    public void testSubtraction() {
        assertEquals(3, model.calculate(5, 2, "-"));
    }

    @Test
    public void testMultiplication() {
        assertEquals(12, model.calculate(4, 3, "*"));
    }

    @Test
    public void testDivision() {
        assertEquals(2, model.calculate(6, 3, "/"));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        model.calculate(5, 0, "/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOperator() {
        model.calculate(4, 2, "%");
    }
}
