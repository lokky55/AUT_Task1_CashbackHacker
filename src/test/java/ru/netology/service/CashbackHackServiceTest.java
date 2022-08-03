package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain100() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain900() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int actual = service.remain(1100);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain0() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }
}