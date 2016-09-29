/**
 * file: futureTuition.java
 * author: Liam Healy
 * course: CMPT 220
 * assignment: Lab 3
 * due date: September 22nd, 2016
 * version: 1.8
 * 
 * This file calculates the tuition of one year of school with a steady 5% increase over 10 years, plus the cost of four years afterwards.
 */
public class futureTuition {
  public static void main(String[] args){
    double tuition = 10000.0;
    double yearlyIncrease = .05;
    for (int i = 0;i < 10;i++){
      tuition = ((tuition*yearlyIncrease)+tuition);
      tuition ++;
    }
    System.out.printf("The beginning cost after ten years is $%.2f\n", tuition);
    double fourYear = tuition * 4.0;
    System.out.printf("The total cost of four years of school is $%.2f", fourYear);
  }
}
