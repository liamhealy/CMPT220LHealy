/*
 * File: FarenheitCalc.java
 * Creator: Liam Healy
 * course: CMPT 220L
 * Assignment: Lab 1
 * Due Date: 9/8/2016
 * version: 1.8
 * 
 * This file contains a main method that converts a value in degrees Celsius to Farenheit.
*/

// == this program is wrong, you are supposed to ask the user to enter celsius.
public class FarenheitCalc {

  // == you are using tabs!!!
	public static void main(String[] args) {
		double celsius = 25.2;
    // == the following line goes over 80 characters
		System.out.println("The current temperature in celsius is " + celsius + ", that means in Farenheit it's... ");
		double farenheit = (9 / 5) * celsius + 32;
		System.out.println(farenheit);
	}

}


