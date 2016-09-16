/**
 * file: ComputeChange.java
 * author: Liam Healy
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14th, 2016
 * version: 1.8
 * 
 * This file contains a main method in the ComputeChange class which computes 
 * the amount of each form of currency that make up a total amount.
 */
import java.util.Scanner;

public class ComputeChange {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an amount in double, for example 11.56: ");
    String amount = input.nextLine();
    
    String remainingAmount;
    
    int numberOfOneDollars = amount.indexOf(0 + 1);
    remainingAmount = amount.substring(2);
    
    String numberOfQuarters = remainingAmount.substring(2 / 25);
    remainingAmount = remainingAmount.substring(2);
    
    String numberOfDimes = remainingAmount.substring(2 / 10);
    remainingAmount = remainingAmount.substring(2);
    
    String numberOfNickels = remainingAmount.substring(2 / 5);
    remainingAmount = remainingAmount.substring(2);
    
    String numberOfPennies = remainingAmount.substring(2 / 1);
    
    System.out.println("Your amount " + amount + " consists of");
    System.out.println("    " + numberOfOneDollars + " dollars");
    System.out.println("    " + numberOfQuarters + " quarters");
    System.out.println("    " + numberOfDimes + " dimes");
    System.out.println("    " + numberOfNickels + " nickels");
    System.out.println("    " + numberOfPennies + " pennies");
  }
}
