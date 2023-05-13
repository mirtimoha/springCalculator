package pro.sky.calculator;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceImplParametrizedTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> argsForPlus() {
        return Stream.of(
                Arguments.of(1, 1, 2),
                Arguments.of(2, 1, 3),
                Arguments.of(0, 0, 0),
                Arguments.of(-1,-1,-2)
        );
    }
    public static Stream<Arguments> argsForMinus() {
        return Stream.of(
                Arguments.of(1, 1, 0),
                Arguments.of(2, 1, 1),
                Arguments.of(0, 0, 0),
                Arguments.of(-1,-1,0)
        );
    }

    public static Stream<Arguments> argsForMultiply() {
        return Stream.of(
                Arguments.of(1, 1, 1),
                Arguments.of(2, 1, 2),
                Arguments.of(0, 0, 0),
                Arguments.of(-1,-1, 1)
        );
    }
    public static Stream<Arguments> argsForDivide() {
        return Stream.of(
                Arguments.of(1, 1, 1),
                Arguments.of(2, 1, 2),
                Arguments.of(0, 1, 0),
                Arguments.of(-1,-1,1)
        );
    }

    @ParameterizedTest
    @MethodSource("argsForPlus")
    public void plus(Integer num1, Integer num2, Integer expectedResult) {
        Assertions.assertEquals(expectedResult, calculatorService.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("argsForMinus")
    public void minus(Integer num1, Integer num2, Integer expectedResult) {
        Assertions.assertEquals(expectedResult, calculatorService.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("argsForMultiply")
    public void multiply(Integer num1, Integer num2, Integer expectedResult) {
        Assertions.assertEquals(expectedResult, calculatorService.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("argsForDivide")
    public void divide(Integer num1, Integer num2, Integer expectedResult) {
        Assertions.assertEquals(expectedResult, calculatorService.divide(num1, num2));
    }
}
