package assignments;

import org.junit.jupiter.api.Test;

;import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArrayOfTenNumbers{
    @Test
    public void sumArrayTest() {
        //given that
        ArrayOfTenNumber numbers = new ArrayOfTenNumber();
        //when
        numbers.sumOfArray();
        //assert
        assertEquals( 90,numbers.sumOfArray());
    }
    @Test
    public void maximumArrayTest(){
        //given that
        ArrayOfTenNumber number = new ArrayOfTenNumber();
        //when
        number.maximumOfArray();
        //assert
        assertEquals(9,number.maximumOfArray());
    }
    @Test
    public void averageArrayTest(){
        //given that
        ArrayOfTenNumber number = new ArrayOfTenNumber();
        //when
        number.averageOfArray();
        //assert
        assertEquals(17,number.averageOfArray());
    }


}