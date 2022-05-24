package chapter2;
import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
    int userInput = scanner.nextInt();
        System.out.println("enter second number");
    int userInput2 = scanner.nextInt();
    int userInputSquared = userInput*userInput;
    int userInput2Squared = userInput2*userInput2;
        System.out.printf("%d%n",userInputSquared);
        System.out.printf("%d%n",userInput2Squared);
        System.out.println(userInputSquared+userInput2Squared);
        System.out.print(userInputSquared-userInput2Squared);
    }
}
