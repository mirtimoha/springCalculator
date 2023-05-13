package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void plus1() {
        Integer num1 = 10;
        Integer num2 = 20;
        Integer expectedResult = 30;

        Assertions.assertEquals(expectedResult, calculatorService.plus(num1, num2));
    }
    @Test
    public void plus2() {
        Integer num1 = -10;
        Integer num2 = 33;
        Integer expectedResult = 23;

        Assertions.assertEquals(expectedResult, calculatorService.plus(num1, num2));
    }
    @Test
    public void minus1() {
        Integer num1 = 10;
        Integer num2 = 20;
        Integer expectedResult = -10;

        Assertions.assertEquals(expectedResult, calculatorService.minus(num1, num2));
    }
    @Test
    public void minus2() {
        Integer num1 = 4;
        Integer num2 = 2;
        Integer expectedResult = 2;

        Assertions.assertEquals(expectedResult, calculatorService.minus(num1, num2));
    }
    @Test
    public void multiply1() {
        Integer num1 = 2;
        Integer num2 = 2;
        Integer expectedResult = 4;

        Assertions.assertEquals(expectedResult, calculatorService.multiply(num1, num2));
    }
    @Test
    public void multiply2() {
        Integer num1 = 4;
        Integer num2 = 5;
        Integer expectedResult = 20;

        Assertions.assertEquals(expectedResult, calculatorService.multiply(num1, num2));
    }
    @Test
    public void divide1() {
        Integer num1 = 20;
        Integer num2 = 4;
        Integer expectedResult = 5;

        Assertions.assertEquals(expectedResult, calculatorService.divide(num1, num2));
    }
    @Test
    public void divide2() {
        Integer num1 = 100;
        Integer num2 = 10;
        Integer expectedResult = 10;

        Assertions.assertEquals(expectedResult, calculatorService.divide(num1, num2));
    }
    @Test
    public void divideIfZero() {
        Integer num1 = 100;
        Integer num2 = 0;

        Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(num1, num2));
    }
}
