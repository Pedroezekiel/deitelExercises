package chater3TddClass;

import chapter3.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CarApplicationTest {
    @Test
    public void carModelTest() {
        //given that
        Car benz = new Car();
        //when
        benz.setCarModel();
        //assert
        assertEquals("S63 coupe", benz.getCarModel());
    }

    @Test
    public void carYearTest() {
        //given that
        Car benz = new Car();
        //when
        benz.setCarYear();
        //assert
        assertEquals("2022", benz.getCarYear());
    }

    @Test
    public void carPriceTest() {
        //given that
        Car benz = new Car();
        //when
        benz.setCarPrice();
        //assert
        assertEquals(7000_000.00, benz.getCarPrice());
    }

    @Test
    public void secondCarModelTest() {
        //given that
        Car lamborghini = new Car();
        //when
        lamborghini.setSecondCarModel();
        assertEquals("Aventador", lamborghini.getSecondCarModelTest());
    }

    @Test
    public void secondCarYearTest() {
        //given that
        Car lamborghini = new Car();
        //when
        lamborghini.setSecondCarYear();
        assertEquals("2020", lamborghini.getSecondCarYear());
    }

    @Test
    public void secondCarPriceTest() {
        //given that
        Car lamborghini = new Car();
        //when
        lamborghini.setSecondCarPrice();
        //assert
        assertEquals(501_953.00, lamborghini.getSecondCarPrice());
    }

    @Test
    public void carDiscount() {
        //given that
     Car benz = new Car();
     //when
        benz.carDiscount (5);
        //assert
        assertEquals(6_999_999.5,benz.getCarDiscount());
    }
    @Test
    public void secondCarDiscount(){
        //given that
        Car  lamborghini = new Car();
        //when
        lamborghini.secondCarDiscount(7);
        //assert
        assertEquals(501_952.93,lamborghini.getSecondCarDiscount());
    }
}