/**
 * file: smallestInt.java
 * author: Liam Healy
 * course: CMPT 220
 * assignment: Lab 3
 * due date: September 22nd, 2016
 * version: 1.8
 * 
 * This file determines the largest possible double, n, such that n^2 is less than 12000.
 */
public class smallestInt {
  public static void main(String[] args){
    double n = 0;
	while(Math.pow(n, 2) < 12000){
      n++;
    }
    System.out.println(n);
  }
}

