/**
 * file: monthDays.java
 * author: Liam Healy
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14th, 2016
 * version: 1.8
 * 
 * This file tells the user how many days were in the month the user entered, based on the year the user entered. 
 */
import java.util.Scanner;

public class monthDays {
  public static void main(String[] args){
	System.out.println("Please enter a month number:");
    Scanner input = new Scanner(System.in);
	int month = input.nextInt();
	System.out.println("Please enter a year:");
	int year  = input.nextInt();
	int numDays = 0;
	String monthName = null;
	boolean isLeapYear = 
	(year %4 == 0 && year % 100 != 0) || (year % 400 == 0);
	switch(month){
	  case 1: numDays = 31; monthName = "January"; break;
	  case 2: numDays = 28; monthName = "February"; 
	  if(isLeapYear = true){
	    numDays = 29;  
	  }break;
	  case 3: numDays = 31; monthName = "March"; break;
	  case 4: numDays = 30; monthName = "April"; break;
	  case 5: numDays = 31; monthName = "May"; break;
	  case 6: numDays = 30; monthName = "June"; break;
	  case 7: numDays = 31; monthName = "July"; break;
	  case 8: numDays = 31; monthName = "August"; break;
	  case 9: numDays = 30; monthName = "September"; break;
	  case 10: numDays = 31; monthName = "October"; break;
	  case 11: numDays = 30; monthName = "November"; break;
	  case 12: numDays = 31; monthName = "December"; break;
	  default: System.out.println("Invalid month number..."); return;
	}
	System.out.println("The month " + monthName + ", " + year + " had " + numDays + " days.");
  }
}
