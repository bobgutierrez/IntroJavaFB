package test;

import funstuff.Zeller;
import org.junit.Assert;
import org.junit.Test;

public class TestZeller {
    @Test
    public void testOne() {
        System.out.println("Hello, I'm executing!!!!");
    }

    @Test
    public void testTwo() {
        int dayOfWeek = 5;
        int tomorrow = dayOfWeek + 1;
        Assert.assertEquals("tomorrow should be day 6", 6, tomorrow);
    }

    @Test
    public void janFirst2000IsSaturday() {
        int day = 1;
        int month = 1;
        int year = 2000;
        int dayOfWeek = Zeller.dayOfWeek(day, month, year);
        Assert.assertEquals("Day of week should be zero", 0, dayOfWeek);
    }
    @Test
    public void novSeven2018IsWednesday() {
        int dayOfWeek = Zeller.dayOfWeek(7, 11, 2018);
        Assert.assertEquals("Day of week should be four", 4, dayOfWeek);
    }
    @Test
    public void febFirst1999IsMonday() {
        Assert.assertEquals("Day of week should be two", 2, Zeller.dayOfWeek(1, 2, 1999));
    }
}
