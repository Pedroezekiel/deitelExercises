package tddClass;

public class Kata {
    private int number;

    public int copies(int number) {
        if (number > 1 && number <= 4) {
            number = number * 2000;
        } else if (number > 4 && number <= 9) {
            number = number * 1800;
        } else if (number > 9 && number <= 29) {
            number = number * 1600;
        } else if (number > 29 && number <= 49) {
            number = number * 1500;
        } else if (number > 49 && number <= 99) {
            number = number * 1300;
        } else if (number > 99 && number <= 199) {
            number = number * 1200;
        } else if (number > 199 && number <= 499) {
            number = number * 1100;
        } else if (number > 499) {
            number = number * 1000;
        }
        return number;


    }


    public boolean takingInNumbers(int num) {

        if (num % 2 == 0) {
            return true;}
        return  false;

    }


}
