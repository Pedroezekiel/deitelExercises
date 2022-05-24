package chapter2;
import java.util.Scanner;
public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int comparingNumber = 100;
        System.out.println("enter number");
        int userInput = scanner.nextInt();
        int numberSquared = userInput*userInput;
        if(numberSquared >= comparingNumber){
            System.out.printf("%d >= %d%n",comparingNumber,numberSquared);
        }
        if(numberSquared==comparingNumber){
            System.out.printf("%d == %d%n", numberSquared,comparingNumber);
        }
        if(numberSquared!=comparingNumber){
            System.out.printf("%d != %d%n", comparingNumber,numberSquared);
        }
        if(numberSquared<=comparingNumber){
            System.out.printf("%d <= %d%n", numberSquared,comparingNumber);
        }
    }
}
