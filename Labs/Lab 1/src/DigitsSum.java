/*
 * File: DigitsSum.java
 * Creator: Liam Healy
 * course: CMPT 220L
 * Assignment: Lab 1
 * Due Date: 9/8/2016
 * version: 1.8
 * 
 * This file contains a main method that adds the digits of a number it reads from the console.
*/
import java.util.Scanner;

public class DigitsSum {

	public static void main(String[] args) {
		System.out.println("Please enter a number between 0 and 1000: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int sumDigits = 0;
		while(number > 0){
			sumDigits = sumDigits + (number % 10);
			number = number / 10;
		}
		System.out.println("The sum of the digits is " + sumDigits);
	}

}
