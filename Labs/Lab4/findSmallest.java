/**
 * file: findSmallest.java
 * author: Liam Healy
 * course: CMPT 220
 * assignment: Lab 4
 * due date: September 29, 2016
 * version: 1.8
 * 
 * This program finds the minimum value in an array of double values.
 */
import java.util.Scanner;

public class findSmallest {
  public static void main(String[] args){
    
	Scanner input = new Scanner(System.in);
	double[] arr = new double[9];
    
    System.out.println("Please enter 10 integers: ");
    
    for(int i = 0; i < 9; i++){
      arr[i] = input.nextDouble();
    }
    
    System.out.println("The minimum value is: " + min(arr));
    
  }
  public static double min(double[] arrVar){
    Scanner input = new Scanner(System.in);
    double minVal = 100;
    
    for(int i = 0; i < 9; i++){
	  if(arrVar[i] < minVal){
	    minVal = arrVar[i];
	  }
    }
	return minVal;
  }
}
