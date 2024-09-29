package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void isTriangle() {
        int a, b, c;
        a = 0;
        b = 0;
        c = 0;
        boolean expect = false;

        boolean actual = Main.isTriangle(a, b, c);

        assertEquals(expect, actual);

        a = 1;
        b = 1;
        c = 3;
        //expect = false;
        actual = Main.isTriangle(a, b, c);

        assertEquals(expect, actual);

        a = -1;
        b = -2;
        c = 4;
        //expect = false;
        actual = Main.isTriangle(a, b, c);

        assertEquals(expect, actual);


    }

    @org.junit.jupiter.api.Test
    void distance() {
        String expect =  "2,24";
        String actual = String.format("%.2f", Main.distance(0, 0, 2, 1));

        assertEquals(expect, actual);

        expect = "4.0";
        actual = String.format("%s", Main.distance(0, 0, 4, 0));

        assertEquals(expect, actual);
    }

    @org.junit.jupiter.api.Test
    void powerLoop() {
        double actual = Main.powerLoop(2, 2);
        double expect = Math.pow(2,2);

        assertEquals(expect, actual);

        actual = Main.powerLoop(5,4);
        expect = Math.pow(5,4);

        assertEquals(expect, actual);
    }

    @Test
    void power() {
        double a = 2;
        double n = 8;
        double expect = Main.power(a, (int) n);
        double actual = Math.pow(a, n);

        assertEquals(expect, actual);

        a = -1;
        expect = Main.power(a, (int) n);
        actual = -1;

        assertEquals(expect, actual);
    }

    @Test
    void tribonacci() {
        int expect = Main.tribonacci(20);
        int actual = 35890;

        assertEquals(expect, actual);

        expect = Main.tribonacci(-5);
        actual = 0;

        assertEquals(expect, actual);
    }
}