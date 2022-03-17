package tddClass;

public class AutomaticBike {
    private boolean isOn;
    private int speed;

    public void setIsON() {
        if (isOn == false) {
            this.isOn = true;
        } else if (isOn == true) {
            this.isOn = false;
        }
    }

    public boolean getIsOn() {
        return isOn;
    }

    public int accelaration() {
        if (speed >= 0 && speed <= 20) {
            speed = speed + 1;
        } else if (speed >= 21 && speed <= 30) {
            speed = speed + 2;
        } else if (speed >= 31 && speed <= 40) {
            speed = speed + 3;
        } else if (speed >= 41) {
            speed = speed + 4;
        }
        return 0;
    }

    public int getAccelaration() {
        return speed;
    }

    public void decceleration() {
        if (speed > 0 && speed <= 20) {
            speed = speed - 1;
        } else if (speed >= 21 && speed <= 30) {
            speed = speed - 2;
        } else if (speed >= 31 && speed <= 40) {
            speed = speed - 3;
        } else if (speed >= 41) {
            speed = speed - 4;
        }
    }
    public int getDecceleration() {
        return speed;
    }
    public void gearSpeed() {

        if (speed >= 41) {
            speed = speed + 4;
        } else if (speed >= 31 && speed < 40) {
            speed = speed + 3;
        } else if (speed >= 21 && speed <= 30) {
            speed = speed + 2;
        } else if (speed >= 0  && speed <=20) {
            speed = speed + 1;
        }

    }


    public int getGearSpeed() {
        return speed;
    }
}