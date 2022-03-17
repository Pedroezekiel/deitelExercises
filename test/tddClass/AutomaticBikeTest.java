package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AutomaticBikeTest {

    @Test
    public void onTest() {
        //given
        AutomaticBike myBike = new AutomaticBike();
        //when
        myBike.setIsON();
        //assert
        assertEquals(true, myBike.getIsOn());
    }

    @Test
    public void offTest() {
        //given
        AutomaticBike myBike = new AutomaticBike();
        //when
        myBike.setIsON();
        myBike.setIsON();
        //assert
        assertEquals(false, myBike.getIsOn());
    }

    @Test
    public void accelerationTest() {
        //given
        AutomaticBike myBike = new AutomaticBike();
        //when
        myBike.accelaration();
        myBike.accelaration();
        myBike.accelaration();
        assertEquals(3, myBike.getAccelaration());
    }

    @Test
    public void deccelerationTest() {
        //given
        AutomaticBike myBike = new AutomaticBike();

        //when
        myBike.accelaration();
        myBike.accelaration();
        myBike.accelaration();
        myBike.accelaration();
        myBike.decceleration();
        myBike.decceleration();
        myBike.decceleration();
        myBike.decceleration();
        myBike.decceleration();
        myBike.decceleration();

        //assert
        assertEquals(0, myBike.getDecceleration());
    }

    @Test
    public void gearSpeedTest() {
        //given
        AutomaticBike myBike = new AutomaticBike();
        //when
        int speed = 0;
        while (speed >= 0 && speed <= 20) {
            speed = speed + 1;
            assertEquals(20, myBike.getGearSpeed());

        }


    }
}