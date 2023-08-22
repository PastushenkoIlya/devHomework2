package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void sumTest(){
        //given
        Calc calc = new Calc();
        //when
        int res = calc.sum(2,8);
        //then
        assertEquals(10, res);
    }
    @Test
    void subTest(){
        //given
        Calc calc = new Calc();
        //when
        int result = calc.sub(8,2);
        int expected = 6;
        //Then
        assertEquals(expected, result);
    }

    @Test
    void multiplicationTest(){
        //given
        Calc calc = new Calc();
        //when
        int result = calc.multiplication(5,-7);
        int expected = -35;
        //then
        assertEquals(expected, result);

    }
    @Test
    void divTest(){
        //given
        Calc calc = new Calc();
        //when
        int result = calc.div(180, 3);
        int expected = 60;
        //then
        assertEquals(expected, result);

    }
    @Test
    void divByZeroTest(){
        //given
        Calc calc = new Calc();
        //when & then

        assertThrows(ArithmeticException.class, () -> calc.div(5,0));
    }
    @Test
    void sqrtTest(){
        //given
        Calc calc = new Calc();
        //when
        double result = calc.sqrt(16);
        double expected = 4;
        //then
        assertEquals(expected, result);
    }
    @Test
    void sqrtNegativeArgTest(){
        //given
        Calc calc = new Calc();
        //when & then
        assertThrows(ArithmeticException.class, () -> calc.sqrt(-20));
    }





}