/**
 * file: countAverage.java
 * author: Liam Healy
 * course: CMPT 220
 * assignment: Lab 3
 * due date: September 22nd, 2016
 * version: 1.8
 * 
 * This file contains a method sumDigits that determines the sum of the digits of a three-digit integer.
 */
import java.util.Scanner;

public class addDigits {
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a 3-digit integer: ");
	long num = input.nextInt();
	System.out.println("The sum of the digits is " + sumDigits(num));
  }
  
  public static int sumDigits(long x){
    long num1 = x / 100;
    long num2 = x % 100 / 10;
    long num3 = x % 10;
    long sumDig = num1 + num2 + num3;
    return (int)sumDig;
  }
}
