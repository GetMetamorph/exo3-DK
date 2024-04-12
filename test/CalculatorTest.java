package test;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import main.Calculator;

public class CalculatorTest {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(Arrays.asList("1", "2", "3", "4"));
        assertEquals(10, sum);
    }

    @Test
    public void testProduct() {
        Calculator calculator = new Calculator();
        int product = calculator.product(Arrays.asList("1", "2", "3", "4"));
        assertEquals(24, product);
    }
}