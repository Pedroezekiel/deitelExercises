package myPratice;

public class Array {
    public static void main(String[] args) {
//       char[][] arrays = new char[][];
//       arrays[0][0] = "X";
//       arrays[0][1] = "O";
//       arrays[0][2] = "X";
//       arrays[1][0] = "X";
//       arrays[1][1] = "X";
//       arrays[1][2] = "X";
//       arrays[2][0] = "O";
//       arrays[2][1] = "X";
//       arrays[2][2] = "O";
//       System.out.print(arrays[0][0]+ " ");
//       System.out.print(arrays[0][1]+ " ");
//       System.out.println(arrays[0][2]+ " ");
//       System.out.print(arrays[1][0]+ " ");
//       System.out.print(arrays[1][1]+ " ");
//       System.out.println(arrays[1][2]+ " ");
//       System.out.print(arrays[2][0]+ " ");
//       System.out.print(arrays[2][1]+ " ");
//       System.out.print(arrays[2][2]+ " ");
//
//       int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
//      System.out.println(myIntArray[9]);
//
//       int[] numbers = new int[300];
//       for (int i = 0; i < numbers.length; i++) {
//           System.out.print(" ");
//       }
//        System.out.println();
//       for (int i = 0; i < numbers.length;i++){
//            System.out.print((numbers[i]=i+1)+" ");
        char[][]letters={{'x','O',' '}, {'X','X','X'},{'X','X','X'}};
        for (int i = 0;i <= 2;i++){
            for (int j=0;j<=2;j++){
                System.out.print(letters[i][j]+" ");
            }
            System.out.println();

        }



    }


    }

