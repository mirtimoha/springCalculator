package pro.sky.calculator;

import org.springframework.stereotype.Service;


public interface CalculatorService {
    String hello();
    String plus(Integer num1, Integer num2);
    String minus(Integer num1, Integer num2);
    String divide(Integer num1, Integer num2);
    String multiply(Integer num1, Integer num2);
}
