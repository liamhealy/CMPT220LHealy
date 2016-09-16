/**
 * file: licensePlate.java
 * author: Liam Healy
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14th, 2016
 * version: 1.8
 * 
 * This file generates a random license plate letter (3) and number (4) combination
 */
import java.util.Random;

public class licensePlate {
  public static void main(String[] args){
	  int firstHalf = (int)(0000 + Math.random() * (9999));
	  //double digitOne = (65.0 + Math.random() * 90.0);
	  //double digitTwo = (65.0 + Math.random() * 90.0);
	  //double digitThree = (65.0 + Math.random() * 90.0);
      
	  
	  char A = (char)((int)'A' + Math.random()*((int)'Z'-(int)'A' + 1));
	  char B = (char)((int)'A' + Math.random()*((int)'Z'-(int)'A' + 1));
	  char C = (char)((int)'A' + Math.random()*((int)'Z'-(int)'A' + 1));
	  System.out.println("License Plate: " + A + B + C + "-" + firstHalf);
  }
}
