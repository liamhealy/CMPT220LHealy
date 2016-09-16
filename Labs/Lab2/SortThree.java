/**
 * file: ComputeChange.java
 * author: Liam Healy
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14th, 2016
 * version: 1.8
 * 
 * This file sorts three user-entered int's in non-decreasing order. 
 */
import java.util.Scanner;

public class SortThree {
  public static void main(String[] args){
    Scanner num = new Scanner(System.in);
	System.out.println("Enter three integers in any order and they will be sorted in non-decreasing order.");
	System.out.println("1st Number: ");
	int firstNum = num.nextInt();
	System.out.println("2nd Number: ");
	int secNum = num.nextInt();
	System.out.println("3rd Number: ");
	int thirdNum = num.nextInt();
	if(firstNum >= thirdNum && firstNum >= secNum && secNum >= thirdNum){
	  System.out.println(thirdNum + "," + secNum + "," + firstNum);
	}
	else if(firstNum >= thirdNum && firstNum >= secNum && thirdNum >= secNum){
	  System.out.println(secNum + "," + thirdNum + "," + firstNum);
	}
	else if(secNum >= thirdNum && secNum >= firstNum && firstNum >= thirdNum){
	  System.out.println(thirdNum + "," + firstNum + "," + secNum);
	}
	else if(secNum >= thirdNum && secNum >= firstNum && thirdNum >= firstNum){
	  System.out.println(firstNum + "," + thirdNum + "," + secNum);
	}
	else if(thirdNum >= secNum && thirdNum >= firstNum && secNum >= firstNum){
	  System.out.println(firstNum + "," + secNum + "," + thirdNum);	
	}
	else if(thirdNum >= secNum && thirdNum >= firstNum && firstNum >= secNum){
	  System.out.println(secNum + "," + firstNum + "," + thirdNum);	
	}
	  
  }
}
