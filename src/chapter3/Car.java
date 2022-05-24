package chapter3;
public class Car {
    private String carModel;
    private String carYear;
    private double carPrice;

    public void setCarModel() {carModel = "S63 coupe";}
    public String getCarModel(){return  carModel;}

    public void setCarYear() {carYear = "2022";}
    public String getCarYear() {return  carYear;}

    public void setCarPrice() {carPrice = 7000_000.00;}
    public double getCarPrice() {return carPrice;}

    public void setSecondCarModel() { carModel ="Aventador";}
    public String getSecondCarModelTest() {return  carModel;}

    public void setSecondCarYear() {carYear = "2020";}
    public String getSecondCarYear() {return  carYear;}

    public void setSecondCarPrice() {carPrice=501_953.00;}
    public double getSecondCarPrice() {return  carPrice;}

    public void carDiscount(double discountPercentage) {
        carPrice = 7000_000.00;
        carPrice= (carPrice-  00.5);
    }

    public double getCarDiscount() {return carPrice;}

    public void secondCarDiscount(double discountPercentage) {
        carPrice =  501_953.00;
         carPrice= (carPrice  - 0.07);
    }
    public double getSecondCarDiscount() {return carPrice;}
}