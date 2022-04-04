package assigment;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("enter student name");
            String studentName = scanner.next();
            System.out.println("enter student grade");
            String studentGrade =scanner.next();
        switch (studentGrade) {
            case "A":
                countA++;
                break;
            case "B":
                countB++;
                break;
            case "C":
                countC++;
                break;
            case "D":
                countD++;
                break;
            default:
                System.out.println("invalid score");


        }

        }
            System.out.println(countA +"Score A");
            System.out.println(countB +"score B");
            System.out.println(countC +"score C");
            System.out.println(countD +"score D");


        }





}