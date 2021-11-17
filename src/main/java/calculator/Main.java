package calculator;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Calculator object = new Calculator();
        MoneyCalculator moneyCalculator = new MoneyCalculator();
        Summary summary = new Summary();

        System.out.println(object.sum(3, 2));
        System.out.println(object.subtract(3, 2));
        System.out.println(object.multiplication(6, 3));
        System.out.println(object.division(6, 3));

        summary.setSum(1);
        summary.setAverage(1.0F);

        System.out.println(summary.getSum() + " " + summary.getAverage());

        System.out.println(moneyCalculator.sum(new BigDecimal("10.10"), new BigDecimal("10.20")));
        System.out.println(moneyCalculator.subtract(new BigDecimal("10.10"), new BigDecimal("5.05")));
    }
}
