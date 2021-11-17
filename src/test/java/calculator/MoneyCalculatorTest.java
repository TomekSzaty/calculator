package calculator;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyCalculatorTest {

    @Test
    public  void addingMoneyCalculatorTest() {
        MoneyCalculator moneyCalculator = new MoneyCalculator();
        assertEquals(new BigDecimal("24.60"), moneyCalculator.sum(new BigDecimal("0.40"), new BigDecimal("24.20")));
    }
}
