package calculator;

import java.math.BigDecimal;

public class MoneyCalculator {
    public BigDecimal sum(BigDecimal x, BigDecimal y) {
        return x.add(y);
    }
    public BigDecimal subtract(BigDecimal x, BigDecimal y) {
        return x.subtract(y);
    }
}
