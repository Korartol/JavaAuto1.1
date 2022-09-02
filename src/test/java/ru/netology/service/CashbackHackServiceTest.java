package ru.netology.service;

//import org.junit.Test;
//
//import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {

    @Test
    public void remainTest1() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int amount = 1;

        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void remainTest900() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int amount = 900;

        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void remainTest1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int amount = 1000;

        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void remainTest999() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int amount = 999;

        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void remainTest1001() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int amount = 1001;

        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }
}