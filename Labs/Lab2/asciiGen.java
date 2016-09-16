/**
 * file: asciiGen.java
 * author: Liam Healy
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14th, 2016
 * version: 1.8
 * 
 * This file contains a converter that outputs the user's input's 
 * corresponding ASCII code.
 */
import java.util.Random;
import java.util.Scanner;

public class asciiGen {
  public static void main(String[] args){
    Random gen = new Random();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an ASCII code: ");
	int ascii = (int) input.nextInt();
	char c = (char) ascii;
	System.out.println("The char for ASCII code " + ascii + " is " + c);    
  }
}

