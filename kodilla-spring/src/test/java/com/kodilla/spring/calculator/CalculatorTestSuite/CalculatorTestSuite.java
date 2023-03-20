package com.kodilla.spring.calculator.CalculatorTestSuite;

import com.kodilla.spring.calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;
    @Test
    void testCalculations(){
        //Given
        double add;
        double sub;
        double mul;
        double div;
        //When
        add = calculator.add(5,5);
        sub = calculator.sub(5,5);
        mul = calculator.mul(5,5);
        div = calculator.div(5,5);
        //Then
        assertEquals(10,add);
        assertEquals(0,sub);
        assertEquals(25,mul);
        assertEquals(1,div);
    }
}
