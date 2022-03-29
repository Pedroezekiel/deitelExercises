package chapter2;

import java.util.Random;
import java.util.Scanner;

public class RandomMathematicalQuiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int initialAnswer;
        int userAnswer;
        int correctAnswer = 0;
        int wrongAnswer = 0;
        int number = 10;

        for(int i = 0; i <= number; i++){

            int firstNumber =  random.nextInt(100 );
            int secondNumber = random.nextInt(100);

            int operators = random.nextInt(4);
            switch (operators) {
                case 0:
                    initialAnswer = firstNumber + secondNumber;
                    System.out.printf("%d + %d = ", firstNumber, secondNumber);
                    userAnswer = input.nextInt();
                    if (userAnswer == initialAnswer) {
                        System.out.println("correct");
                        correctAnswer++;
                    } else {
                        System.out.println("wrong");
                        wrongAnswer++;
                    }
                    break;
                case 1:
                    if (firstNumber >= secondNumber) {
                        initialAnswer = firstNumber - correctAnswer;
                        System.out.printf("%d - %d =", firstNumber, secondNumber);
                        userAnswer = input.nextInt();
                    } else {
                        initialAnswer = secondNumber - firstNumber;
                        System.out.printf("%d - %d =", secondNumber, firstNumber);
                        userAnswer = input.nextInt();
                    }
                    if (userAnswer == initialAnswer) {
                        System.out.println("correct");
                        correctAnswer++;
                    } else {
                        System.out.println("wrong");
                        wrongAnswer++;
                    }
                    break;


                case 2:
                    if (firstNumber >= secondNumber) {
                        initialAnswer = firstNumber / secondNumber;
                        System.out.printf("%d / %d = ", firstNumber, secondNumber);
                        userAnswer = input.nextInt();
                    } else {
                        initialAnswer = secondNumber / firstNumber;
                        System.out.printf("%d / %d =", firstNumber, secondNumber);
                        userAnswer = input.nextInt();
                    }
                    if (initialAnswer == userAnswer) {
                        System.out.println("correct");
                        correctAnswer++;
                    } else {
                        System.out.println("wrong");
                        wrongAnswer++;
                    }
                    break;
                case 3:
                    initialAnswer = firstNumber * secondNumber;
                    System.out.printf("%d * %d = ", firstNumber, secondNumber);
                    userAnswer = input.nextInt();
                    if (userAnswer == initialAnswer) {
                        System.out.println("correct");
                        correctAnswer++;
                    } else {
                        System.out.println("wrong");
                        wrongAnswer++;
                    }
                    break;


            }

        }


        System.out.println("correctAnswer" +correctAnswer);
        System.out.println("wrongAnswer" +wrongAnswer);









    }


}

