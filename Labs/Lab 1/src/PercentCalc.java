/*
 * File: PercentCalc.java
 * Creator: Liam Healy
 * course: CMPT 220L
 * Assignment: Lab 1
 * Due Date: 9/8/2016
 * version: 1.8
 * 
 * This file contains a main method that calculates the average of the grades entered in the console.
*/
import java.util.Scanner;

public class PercentCalc {

  // == you are using tabs!!!
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a midterm exam grade: ");
			double midterm = input.nextDouble();
		System.out.println("Please enter a final exam grade: ");
			double finalExam = input.nextDouble();
		System.out.println("Please enter a project grade: ");
			double projects = input.nextDouble();
		System.out.println("Please enter a grade for HW and Labs: ");
			double hwLabs = input.nextDouble();
		double finalGrade = (midterm + finalExam + projects + hwLabs) / 4;
		System.out.println("Your final grade is: " + finalGrade + "%");
	}

}
