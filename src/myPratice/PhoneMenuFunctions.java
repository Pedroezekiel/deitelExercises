package myPratice;
import java.util.Scanner;


public class PhoneMenuFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Enter:
                1 -> Phone book
                2 -> Messages
                3 -> Chat
                4 -> Call register
                5 -> Tones
                6 -> Setting
                7 -> Call divert
                8 -> Games
                9 -> Calculator
                10 -> Reminders
                11 -> Clock
                12 -> Profiles
                13 -> Sim services                                                                                                                                                     
                  """);

        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("""
                        1 -> Search
                        2 -> Service Nos.
                        3 -> Add names
                        4 -> Erase
                        5 -> Edit
                        6 -> Assign tone
                        7 -> send b' card
                        8 -> Options
                        9 -> speed dials
                        10 -> Voice tags
                        """);
                System.out.println("enter a digit");
                break;
           // int optionsFunction = scanner.nextInt();
            case 8:
                System.out.println("""
                        1 -> Type of view
                        2 -> Memory Status
                        """);
                break;
        }

        switch (userInput) {
            case 2:
                System.out.println("""
                        1 -> Write message
                        2 -> Inbox
                        3 -> Outbox
                        4 -> Picture messages
                        5 -> Temlates
                        6 -> Smileys
                        7 -> Messege settings
                        8 -> Info service
                        9 -> Voice mailbox number
                        10 -> Serice command editor
                        """);
                System.out.println("entetr a digit");
                break;
           // int messegeSetting = scanner.nextInt();
            case 7:
                System.out.println("""
                        1 -> Set 1^2
                        2 -> common^3
                        """);

                int messageFunction = scanner.nextInt();
                switch (userInput) {
                    case 1:
                        System.out.println("""
                                1 -> Message center number
                                2 -> Messages sent as
                                3 -> Messages validity
                                """);
                    case 2:
                        System.out.println("""
                                1 -> Delivery reports
                                2 -> Reply via same centre
                                3 -> Character support""");


                }
        }
    }
}