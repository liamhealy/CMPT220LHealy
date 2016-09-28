/**
 * file: countAverage.java
 * author: Liam Healy
 * course: CMPT 220
 * assignment: Lab 3
 * due date: September 22nd, 2016
 * version: 1.8
 * 
 * This file contains a do/while loop that counts the number of integers entered and their associations.
 */
import java.util.Scanner;

public class countAverage {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	float average;
	int i = 0;
	int tot = 0;
	int pos = 0;
	int neg = 0;
	int num = 0;
    System.out.println("Enter an integer, the input ends if it is 0: ");
    do{
      num += i;
      tot++;
      if(i > 0){
        pos++;
      }
      else if(i < 0){
        neg++; 
      }
    }while((i = input.nextInt()) != 0);
     average = num / tot;
    System.out.println("The number of positives is " + pos);
    System.out.println("The number of negatives is " + neg);
    System.out.println("The total is " + tot);
    System.out.println("The average is " + average);
  }
}
