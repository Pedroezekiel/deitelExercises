package myPratice;
import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Hello My people,
                Enter:
                1 -> Login
                2 -> register
                3 -> logout
                """);
        int userInput = scanner.nextInt();

        switch (userInput){
            case 1: {
                System.out.println("Enter your name");
                scanner.next();
                System.out.println("Enter your password");
               String password =  scanner.next();
                System.out.println("\n".repeat(50));
                switch (password){
                    case "ojo":
                        System.out.println("Correct");
                        break;
                    case "florence":
                        System.out.println("Incorrect password");
                        break;

                }


            }
        }

//        if(userInput == 1){
//            System.out.println("One");
//        }
//        if (userInput == 2){
//            System.out.println("Two");
//        }
//        if(userInput == 3){
//            System.out.println("Three");
//        }

//
//
//            for (int i = 1; i<=12; i++){
//                int result = i * number;
//                System.out.println(number+" * "+i+" = "+ result);
//
//
//            }

        }
    }

