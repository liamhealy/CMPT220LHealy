/**
 * file: pentArea.java
 * author: Liam Healy
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14th, 2016
 * version: 1.8
 * 
 * This file tells the user the area of a pentagon whose side is determined
 * by user input.
 */
import java.util.Scanner;

public class pentArea {
  public static void main(String[] args){
    System.out.println("Please enter a value to represent the length from the center of a pentagon to a vertex.");
    Scanner input = new Scanner(System.in);
    double r = input.nextDouble();
    double s = 2 * r * Math.sin(Math.PI / 5);
    double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
    System.out.println("The area of the pentagon is " + Math.round(area*100)/100.0 );
  }
}
