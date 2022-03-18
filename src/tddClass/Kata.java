package tddClass;

public class Kata {


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
            return true;
        }
        return false;
    }


    public int num(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {
        int largestNumber = firstNumber;
        if (secondNumber > largestNumber) {
            largestNumber = secondNumber;
        }
        if (thirdNumber > largestNumber) {
            largestNumber = thirdNumber;
        }
        if (fourthNumber > largestNumber) {
            largestNumber = fourthNumber;
        }
        if (fifthNumber > largestNumber) {
            largestNumber = fifthNumber;
        }
        return largestNumber;
    }

    public int numbers(int number) {

        int count;
        int factors = 0;
        for (count = 1; count <= number; count++) {
            if (number % count == 0) factors++;

        }
        return factors;
    }

    public boolean primeNumbers(int primeNum) {

        int prime;
        int number = 0;
        for (prime = 1; prime <= primeNum; prime++) {
            if (primeNum % prime == 0) number++;}

            if (number == 2) {
            return true;}
           else{
               return false;
            }

    }
}