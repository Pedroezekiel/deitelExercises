  package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionTest {

    @Test
    public void actionOn() {
        //given
        AirCondition onOff = new AirCondition();
        //when
        onOff.setTurnOn();
        //assert
        assertEquals(true, onOff.getTurnOn());
    }
    @Test
    public void actionOff(){
        //given
     AirCondition onOff = new AirCondition();
       //when
     onOff.setTurnOn();
     onOff.setTurnOn();
      //assert
     assertEquals(false,onOff.getTurnOn());
    }
   @Test
   public void actionIncreaseTemp(){
            AirCondition onOff = new AirCondition();

            onOff.increase("increasreTemperature");
            assertEquals("increase", onOff.increase("increae"));
        }
    @Test
    public void actionDecreaseTemp(){
    AirCondition        onOff = new AirCondition();
    onOff.decrease("decreaseTemperature");
    assertEquals("decrease", onOff.decrease("decrease"));
    }
    @Test
    public void actionIncreaseTempBeyondThirty(){
    AirCondition onOff = new AirCondition();
    onOff.actionIncrease(30);
    assertEquals(30,onOff.actionIncrease(30));
    }
    @Test
    public void actiondecreaseTempBelowSixteen(){
    AirCondition onOff = new AirCondition();
    onOff.actionDecrease(16);
    assertEquals(16,onOff.actionDecrease(16));




    }



}



