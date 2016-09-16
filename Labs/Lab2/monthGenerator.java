/**
 * file: monthGenerator.java
 * author: Liam Healy
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14th, 2016
 * version: 1.8
 * 
 * This file generates a random int and based off of the value it holds
 * it outputs the corresponding month.
 */
import java.util.Scanner;
import java.util.Random;

public class monthGenerator{

  public static void main(String[] args){
    double randomInt = (1 + Math.random() * (12));
    
    if(randomInt >= 12){
      System.out.println("The month is December.");
    }
    else if(randomInt >= 11){
      System.out.println("The month is November.");
    }
    else if(randomInt >= 10){
      System.out.println("The month is October.");
    }
    else if(randomInt >= 9){
      System.out.println("The month is September.");
    }
    else if(randomInt >= 8){
      System.out.println("The month is August.");
    }
    else if(randomInt >= 7){
      System.out.println("The month is July.");
    }
    else if(randomInt >= 6){
      System.out.println("The month is June.");
    }
    else if(randomInt >= 5){
      System.out.println("The month is May.");
    }
    else if(randomInt >= 4){
      System.out.println("The month is April.");
    }
    else if(randomInt >= 3){
      System.out.println("The month is March.");
    }
    else if(randomInt >= 2){
      System.out.println("The month is February.");
    }
    else if(randomInt >= 1){
      System.out.println("The month is January.");
    }
   
  }
}