package chapter2;

import java.util.Scanner;
public class CylinderVolume{
 public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);

 System.out.print("enter radius:");
 double radius = scanner.nextDouble();

 System.out.print("enter length:");
 double length = scanner.nextDouble();

 double area =radius* radius* 3.14;
 double volume = area * length;
 
 System.out.printf("The area is: %.0f%n", area);
 System.out.printf("The volume is: %.0f", volume);


 }

}