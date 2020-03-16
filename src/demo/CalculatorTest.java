package demo;

import org.junit.Test;

import static demo.Main.calculate;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void calculateSum(){
        String input = "1 + 3";
        assertEquals(calculate(input), "4");
    }

    @Test
    public void calculateSubstraction(){
        String input = "34 - 3";
        assertEquals(calculate(input), "31");
    }

    @Test
    public void calculateMultiplication(){
        String input = "30 * 2";
        assertEquals(calculate(input), "60");
    }


    @Test
    public void calculateDivision(){
        String input = "30 / 2";
        assertEquals(calculate(input), "15");
    }


    @Test
    public void calculateDivizionByZero(){
        String input = "34 / 0";
        assertEquals(calculate(input), "Division by zero!");
    }


}
