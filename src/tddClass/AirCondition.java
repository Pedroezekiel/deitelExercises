package tddClass;

public class AirCondition {
    private boolean turnOn;

    public void setTurnOn() {
        if(turnOn == false){turnOn=true;}
        else if(turnOn == true){turnOn=false;}

    }
    public boolean getTurnOn() {
        return turnOn;
    }



    public int actionIncrease(int temperature){
        if(temperature>30)
            temperature=30;
        return temperature;
    }

    public String increase(String increasreTemperature) {
        return "increase";
    }

    public String decrease(String decreaseTemperature) {
        return "decrease";
    }

    public int actionDecrease(int temperature) {
        if(temperature<16)
            temperature=16;
        return temperature;
    }

}
