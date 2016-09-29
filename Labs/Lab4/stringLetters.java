/**
 * file: stringLetters.java
 * author: Liam Healy
 * course: CMPT 220
 * assignment: Lab 4
 * due date: September 29, 2016
 * version: 1.8
 * 
 * This program adds the number of characters in a user-input string.
 */
import java.util.Scanner;

public class stringLetters {
  public static void main(String[] args){
    System.out.println("Please enter a String: ");
    Scanner input = new Scanner(System.in);
    String userInput = input.nextLine();
    System.out.println("The number of characters in the string " + userInput + " is " + countLetter(userInput));
  }
  
  public static int countLetter(String s){
    int value = 0;
    for(int i = 0; i < s.length(); i++){
      value = i + 1;
    }
    return value;
  }
}
