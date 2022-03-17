package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class KataTest {
    @Test
    public void testDrillerTest1To4() {
        //given
        Kata testDiller = new Kata();
        //when
        testDiller.copies(2);
        //assert
        assertEquals(4000, testDiller.copies(2));
    }

    @Test
    public void testDrillerTest5To9() {
        //given
        Kata testDiller = new Kata();
        //when
        testDiller.copies(6);
        //assert
        assertEquals(10800, testDiller.copies(6));
    }

    @Test
    public void testDrillerTest10To29() {
        //given
        Kata testDiller = new Kata();
        //when
        testDiller.copies(10);
        //assert
        assertEquals(16000, testDiller.copies(10));
    }

    @Test
    public void testDrillerTest30To49() {
        //given
        Kata testDiller = new Kata();
        //when
        testDiller.copies(50);
        //assert
        assertEquals(65000, testDiller.copies(50));

    }

    @Test
    public void testDrillerTest50To99() {
        //given
        Kata testDiller = new Kata();
        //when
        testDiller.copies(100);
        //assert
        assertEquals(120000, testDiller.copies(100));
    }

    @Test
    public void testDrillerTest100To199() {
        //given
        Kata testDiller = new Kata();
        //when
        testDiller.copies(100);
        //assert
        assertEquals(120000, testDiller.copies(100));
    }

    @Test
    public void testDrillerTest200To499() {
        //given
        Kata testDiller = new Kata();
        //when
        testDiller.copies(200);
        //assert
        assertEquals(220000, testDiller.copies(200));

    }

    @Test
    public void testDillerAbove500() {
        //given
        Kata testDiller = new Kata();
        //when
        testDiller.copies(500);
        //assert
        assertEquals(500000, testDiller.copies(500));
    }

    @Test
    public void evenNumbers() {

        int number = 2;
        while (number <= 100) {
            System.out.print(number + " ");
            number = number + 2;
        }
    }


}