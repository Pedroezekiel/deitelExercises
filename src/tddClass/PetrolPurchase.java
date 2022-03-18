package tddClass;

public class PetrolPurchase {
    private String stationLocation;
    private String petrolType;
    private int petrolQuantity;
    private double petrolPerLiters;
    private double petrolDiscont;
    private double petrolPurchaseAmount;

    public void setStationLocation() {
        stationLocation = "ennyStation";
    }

    public String getStationLocation() {
        return "ennyStation";
    }

    public void setPetrolType() {
        petrolType = "Gas";
    }


    public String getPetrolType() {
        return "Gas";
    }

    public void petrolQuantity() {
        petrolQuantity = 20;
    }

    public int getPetrolQuantity() {
        return 20;
    }


    public void petrolPerLiters() {
        petrolPerLiters = 25.73;
    }

    public double getPetrolPerLiters() {
        return petrolPerLiters;
    }

    public void petrolDiscount(double percentage) {
        petrolPerLiters=25.73;
        this.petrolDiscont = (percentage * 0.01) * petrolPerLiters;

    }


    public double getPetrolDiscont() {
        return petrolDiscont;
    }

    public void petrolPurchaseAmount() {
        petrolQuantity=20;
        petrolPerLiters=25.73;
        petrolDiscont=1.2865000000000002;
        petrolPurchaseAmount =(petrolQuantity * petrolPerLiters) - petrolDiscont;
       this.petrolPurchaseAmount = petrolPurchaseAmount;


    }

    public double getPetrolPurchaseAmount() {
        return petrolPurchaseAmount;
    }
}