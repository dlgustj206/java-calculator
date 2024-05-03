package test;

import controller.CalculatorController;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class CalculatorControllerTest {

    @Test
    public void testStartCalculator() {
        String input = "1\n4\n+\n2\n2\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        CalculatorController controller = new CalculatorController();
        controller.startCalculator();

        assertEquals(0, System.out.checkError());
    }
}