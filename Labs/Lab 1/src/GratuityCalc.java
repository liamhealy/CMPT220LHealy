/*
 * File: GratuityCalc.java
 * Creator: Liam Healy
 * course: CMPT 220L
 * Assignment: Lab 1
 * Due Date: 9/8/2016
 * version: 1.8
 * 
 * This file contains a main method that calculates a total value based on a subtotal and gratuity rate.
*/
import java.util.Scanner;

public class GratuityCalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();
		double tottip = (subtotal * gratuity) / 100;
		double total = subtotal + tottip;
		System.out.println("The gratuity is $" + tottip + " and total is $" + total);

	}

}
