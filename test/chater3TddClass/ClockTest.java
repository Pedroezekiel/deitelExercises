package chater3TddClass;

import chapter3.Clock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {
    @Test
    public void  clockHourTest(){
        //given that
     Clock clock = new Clock() ;
     //when
        clock.setClockHour(0,0,0);
        //assert
        assertEquals(0,clock.getClockHour()) ;
    }
    @Test
    public void clockSecondTest(){
        //given that
        Clock clock = new Clock();
        //when
        clock.setClockSecond (0,0,0);
        //assert
        assertEquals(0,clock.getClockSecond());
    }
    @Test
    public void clockMinuteTest(){
        //given that
        Clock clock = new Clock();
        //when
        clock.setClockMinute(0,0,0);
        //assert
        assertEquals(0,clock.getClockMinute());
    }
    @Test
    public void displayClockTest(){
        //given that
        Clock clock = new Clock();
        //when
        clock.displayClock();
        //assert
        assertEquals(0+0+0,clock.getdisplayClock());
    }
}
