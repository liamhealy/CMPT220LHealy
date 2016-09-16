/**
 * file: polyArea.java
 * author: Liam Healy
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14th, 2016
 * version: 1.8
 * 
 * This file generates the area of a polygon based off of the number of sides
 * and length of one of the sides, all based off of user input.
 */
import java.util.Scanner;

public class polyArea {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the number of sides of a random polygon:");
    double l = input.nextDouble();
    System.out.println("Please enter the length of one of the sides:");
    double s = input.nextDouble();
    double area = (l * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / l));
    System.out.println("The area of the figure is " + area);
  }
}
