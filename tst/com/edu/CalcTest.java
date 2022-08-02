package com.edu;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {

    @Test
    public void check() {
        /*
        int i = 0;
        i = 10 / i;
        */
        /*
        if (true) {
            throw new RuntimeException("hahaha");
        }
        */
        Assert.assertEquals(5, 2+3.0001, 0.001);
    }

    @Test
    public void checkAdd1() {
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        expected = 8;
        actual = calc.add(4, 4);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void checkAdd2() {
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        expected = 9;
        actual = calc.add(4, 5);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void checkDiv1() {
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        expected = 4;
        actual = calc.div(20, 5);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void checkDiv2() {
        Calc calc = new Calc();
        double actual;
        double expected;
        //
        expected = 2.5;
        actual = calc.div(20, 8);
        Assert.assertEquals(expected, actual, 0.001);
    }
}
