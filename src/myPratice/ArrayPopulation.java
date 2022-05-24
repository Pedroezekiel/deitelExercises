package myPratice;
import java.util.Scanner;
public class ArrayPopulation {
    public static void main(String[] args) {

        int[][] nums = {{1,1} , {1,1,1}};
        

        int sum = 0;
        for( int counter = 0; counter < nums.length; counter++ ) {
            for (int i = 0; i < nums[counter].length; i++){
                sum = sum + nums[counter][i];

            }
        }
        System.out.println(sum);

    }
}
