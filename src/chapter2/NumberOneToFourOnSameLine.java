package chapter2;

public class NumberOneToFourOnSameLine {
    public static void main(String[] args) {
        int numberOne = 1;
        int numberTwo = 2;
        int numberThree = 3;
        int numberFour = 4;

        System.out.println(numberOne+" "+numberTwo+" "+numberThree+" "+numberFour);
        System.out.printf("%d %d %d %d %n",numberOne,numberTwo,numberThree,numberFour);
        System.out.print(numberOne+" ");

        System.out.print(numberTwo+" ");

        System.out.print(numberThree+" ");

        System.out.println(numberFour+" ");
    }
}
