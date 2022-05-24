package assigment;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayOfTenElements {
    public static void main(String[] args) {
        Random random = new Random()   ;
              int maximum = 0;
              int sum = 0;
              int average = 0;
        int[] numbers = new int[10] ;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50)   ;
            System.out.print(numbers[i]+ " ");
            if(numbers[i] > maximum ){maximum = numbers[i];}
            sum += numbers[i] ;
            average = sum/ numbers.length;

        }
        System.out.println();
        System.out.println("the maximum is: "+maximum);
        System.out.println("the sum is: "+sum);
        System.out.println("the average is: "+average);
    }
}
