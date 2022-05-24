package myPratice;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of student");
        int studentNumber = scanner.nextInt();

        System.out.println("Enter students subjects");
        int studentsSubjects = scanner.nextInt();
        System.out.println("enter student 1 score");
      int[][] score = new int[studentNumber][studentsSubjects];
        for (int i = 0; i < studentNumber; i++){
            for(int j =0;j < studentsSubjects;j++){
                score[i][j] = scanner.nextInt();;
            }
            System.out.println("enter student 2 score");
        }
        for (int i = 0; i < studentNumber; i++){
            for(int j =0;j < studentsSubjects;j++){
                System.out.print(score[i][j]+"   ");
            }
            System.out.println();

        }
                //System.out.println((score[i][i] = i + 1) + " ");


        }
    }
