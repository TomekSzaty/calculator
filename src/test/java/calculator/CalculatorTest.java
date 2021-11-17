package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public  void sumCalculateTest() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.sum(5, 5));
    }

}