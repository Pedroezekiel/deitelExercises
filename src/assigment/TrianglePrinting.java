package assigment;

public class TrianglePrinting {
    public static void main(String[] args) {
        int number = 10;
        for (int i = 0; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print("*");
            }
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
        }
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for(int j = 0; j <= number; j++){
                System.out.print("  ");
            }
        }
    }
}