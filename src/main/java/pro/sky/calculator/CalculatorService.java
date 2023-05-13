package pro.sky.calculator;

import org.springframework.stereotype.Service;



public interface CalculatorService {
    String hello();
    Integer plus(Integer num1, Integer num2);
    Integer minus(Integer num1, Integer num2);
    Integer divide(Integer num1, Integer num2);
    Integer multiply(Integer num1, Integer num2);
}
