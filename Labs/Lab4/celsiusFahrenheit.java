/**
 * file: celsiusFahrenheit.java
 * author: Liam Healy
 * course: CMPT 220
 * assignment: Lab 4
 * due date: September 29, 2016
 * version: 1.8
 * 
 * This program converts temperature readings in celsius to fahrenheit and
 * fahrenheit to celsius.
 */
import java.util.Scanner;

public class celsiusFahrenheit {
  public static void main(String[] args){
    
    double celDeg = 40;
    double farDeg = 120;
	  
    System.out.printf("%-10s%-10s | %15s%12s \n", 
    "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
    //("The celsius temperature " + celDeg + " in fahrenheit is equal to :" + celToFar(celDeg));
    
    System.out.println("--------------------------------------------------");
    
    for(celDeg = 40, farDeg = 120; celDeg > 30; celDeg--, farDeg = farDeg - 10){  
      System.out.printf("%-10.1f%-10.1f | %15.1f%12.2f \n", 
      celDeg, celToFar(celDeg), farDeg, farToCel(farDeg));	
    }
  }
  
  public static double celToFar(double celsius){
    double toFar = (9.0 / 5) * celsius + 32;
    return toFar;
  }
  
  public static double farToCel(double far){
    double toCel = (5.0 / 9) * far - 32;
    return toCel;
  }
}
