package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class CashbackHackServiceTest {

    @Test
    public void remainTest1() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int amount = 1;

        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    public void remainTest900() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int amount = 900;

        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    public void remainTest1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int amount = 1000;

        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    public void remainTest999() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int amount = 999;

        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    public void remainTest1001() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int amount = 1001;

        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }
}