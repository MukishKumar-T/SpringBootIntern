package org.example;

import org.junit.Test;
//import com.training.demo.controllers.Calculator;
//import org.junit.jupiter.api.Test;
import org.example.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator cal = new Calculator();

    @Test
    public void testAddition(){
        assertEquals(7,cal.add(4,3));
    }

    @Test
    public void testSub(){
        assertEquals(2,cal.sub(3,1));
    }

    @Test
    public void testMul(){
        assertEquals(21,cal.mul(3,7));
    }

    @Test
    public void testDiv(){
        assertEquals(4,cal.div(8,2));
    }
}
