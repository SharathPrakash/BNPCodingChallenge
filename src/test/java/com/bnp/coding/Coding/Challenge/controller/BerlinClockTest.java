package com.bnp.coding.Coding.Challenge.controller;

import com.bnp.coding.Coding.Challenge.model.BerlinClock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BerlinClockTest {
    @Test
    public void testGetSeconds() {
        BerlinClock berlinClock = new BerlinClock("00:00:00");
        assertEquals("Y", berlinClock.getSeconds());

        berlinClock = new BerlinClock("00:00:01");
        assertEquals("O", berlinClock.getSeconds());
    }

    @Test
    public void testGetTopHours() {
        BerlinClock berlinClock = new BerlinClock("00:00:00");
        assertEquals("OOOO", berlinClock.getTopHours());

        berlinClock = new BerlinClock("05:00:00");
        assertEquals("ROOO", berlinClock.getTopHours());

        berlinClock = new BerlinClock("10:00:00");
        assertEquals("RROO", berlinClock.getTopHours());

        berlinClock = new BerlinClock("15:00:00");
        assertEquals("RRRO", berlinClock.getTopHours());

        berlinClock = new BerlinClock("20:00:00");
        assertEquals("RRRR", berlinClock.getTopHours());

        berlinClock = new BerlinClock("23:00:00");
        assertEquals("RRRR", berlinClock.getTopHours());
    }

    @Test
    public void testGetBottomHours() {
        BerlinClock berlinClock = new BerlinClock("00:00:00");
        assertEquals("OOOO", berlinClock.getBottomHours());

        berlinClock = new BerlinClock("01:00:00");
        assertEquals("OOOO", berlinClock.getBottomHours());

        berlinClock = new BerlinClock("02:00:00");
        assertEquals("OOOO", berlinClock.getBottomHours());

        berlinClock = new BerlinClock("03:00:00");
        assertEquals("OOOO", berlinClock.getBottomHours());

        berlinClock = new BerlinClock("04:00:00");
        assertEquals("OOOO", berlinClock.getBottomHours());

        berlinClock = new BerlinClock("05:00:00");
        assertEquals("ROOO", berlinClock.getBottomHours());

        berlinClock = new BerlinClock("06:00:00");
        assertEquals("ROOO", berlinClock.getBottomHours());

        berlinClock = new BerlinClock("07:00:00");
        assertEquals("ROOO", berlinClock.getBottomHours());

        berlinClock = new BerlinClock("08:00:00");
        assertEquals("ROOO", berlinClock.getBottomHours());

        berlinClock = new BerlinClock("09:00:00");
        assertEquals("ROOO", berlinClock.getBottomHours());

        berlinClock = new BerlinClock("10:00:00");
        assertEquals("RROO", berlinClock.getBottomHours());

        berlinClock = new BerlinClock("11:00:00");
        assertEquals("RROO", berlinClock.getBottomHours());

        berlinClock = new BerlinClock("12:00:00");
        assertEquals("RROO", berlinClock.getBottomHours());

        berlinClock = new BerlinClock("13:00:00");
        assertEquals("RROO", berlinClock.getBottomHours());

        berlinClock = new BerlinClock("14:00:00");
        assertEquals("RROO", berlinClock.getBottomHours());

        berlinClock = new BerlinClock("15:00:00");
        assertEquals("RRRO", berlinClock.getBottomHours());

        berlinClock = new BerlinClock("16:00:00");
        assertEquals("RRRO", berlinClock.getBottomHours());

        berlinClock = new BerlinClock("17:00:00");
        assertEquals("RRRO", berlinClock.getBottomHours());

    }
}