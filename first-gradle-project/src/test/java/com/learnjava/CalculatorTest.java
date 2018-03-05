package com.learnjava;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    Calculator calculator;

    List<Integer> integerList;

    @Before
    public void setUp(){

        calculator = new Calculator();
        integerList = new ArrayList<>();
    }

    @Test
    public void perFormAdditionTest(){

        integerList.add(2);
        integerList.add(3);
        int result = calculator.performAddition(integerList);
        assertEquals(5,result);
        assertTrue(result!=0);
    }

}
