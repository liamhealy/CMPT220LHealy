/**
 * file: largestInt.java
 * author: Liam Healy
 * course: CMPT 220
 * assignment: Lab 3
 * due date: September 22nd, 2016
 * version: 1.8
 * 
 * This file determines the largest possible double such that double^3 is still greater than 12000.
 */
public class largestInt{
  public static void main(String[] args){
    double n = 12000;
    while(12000 < Math.pow(n, 3)){
      n--;
    }
    System.out.println(n);
  }
}
      
