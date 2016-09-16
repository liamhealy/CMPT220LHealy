/**
 * file: ComputeChange.java
 * author: Liam Healy
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14th, 2016
 * version: 1.8
 * 
 * This file outputs the corresponding phone key of the letter the user enters.
 */
import java.util.Scanner;

public class phoneKeys {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a letter: ");
    String letter = input.nextLine();
    int value = 0;
    
    if(letter.length() != 1){
      System.out.println("You must enter exactly one character");
      System.exit(1);	
    }
    
    char c = letter.charAt(0);
    if(c >= 'A' && c <= 'C'){
      value = 2;
      System.out.println("The corresponding number is " + value);
    }
    
    if(c >= 'D' && c <= 'F'){
      value = 3;
      System.out.println("The corresponding number is " + value);
    }
    
    if(c >= 'G' && c <= 'I'){
      value = 4;
      System.out.println("The corresponding number is " + value);
    }
    
    if(c >= 'J' && c <= 'L'){
      value = 5;
      System.out.println("The corresponding number is " + value);
    }
    
    if(c >= 'M' && c <= 'O'){
      value = 6;
      System.out.println("The corresponding number is " + value);
    }
    
    if(c >= 'P' && c <= 'S'){
      value = 7;
      System.out.println("The corresponding number is " + value);
    }
    
    if(c >= 'T' && c <= 'V'){
      value = 8;
      System.out.println("The corresponding number is " + value);
    }
    
    if(c >= 'W' && c <= 'Z'){
      value = 9;
      System.out.println("The corresponding number is " + value);
    }
    
    if(c >= '_'){
      value = 0;
      System.out.println("The corresponding number is " + value);
    }
  }
}
