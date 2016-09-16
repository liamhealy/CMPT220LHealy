/**
 * file: Lottery.java
 * author: Liam Healy
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14th, 2016
 * version: 1.8
 * 
 * This file generates a 3-digit lottery number which the user must try to guess exactly.
 */
import java.util.Random;
import java.util.Scanner;

public class Lottery {
  public static void main(String[] args){
    int lottoNum = (int)(100 + Math.random() * (999));
    System.out.println("Welcome to the lottery game, to play just enter a 3-digit lottery number guess.");
    Scanner input = new Scanner(System.in);
    int lottoGuess = input.nextInt();
    int result;
    
    //Get digit values from user input:
    int guessDigit1 = lottoGuess / 100; 
    int guessDigit2 = lottoGuess % 100 / 10;
    int guessDigit3 = lottoGuess % 10;
    
    //Get digit values from generated integer:
    int lottoDigit1 = lottoNum / 100; 
    int lottoDigit2 = lottoNum % 100 / 10;
    int lottoDigit3 = lottoNum % 10;
    
    if(lottoNum == lottoGuess){
      result = 1;
      //Exact match
    }
    else if(guessDigit1 == lottoDigit2
    	 && guessDigit2 == lottoDigit3
    	 && guessDigit3 == lottoDigit1){
      result = 2;
      //Match all digits
    }
    else if(guessDigit1 == lottoDigit1
    	 || guessDigit1 == lottoDigit2
    	 || guessDigit1 == lottoDigit3
    	 || guessDigit2 == lottoDigit1
    	 || guessDigit2 == lottoDigit2
    	 || guessDigit2 == lottoDigit3
    	 || guessDigit3 == lottoDigit1
    	 || guessDigit3 == lottoDigit2
    	 || guessDigit3 == lottoDigit3){
      result = 3;
      //Match one digit
    }
    else{
      result = 0;
    }
    
    switch(result){
      case 0: System.out.println("Sorry, no luck. Play again. The number was " + lottoNum);break;
      case 1: System.out.println("You're guess was an exact match! You win $10,000! The number was " + lottoNum);break;
      case 2: System.out.println("All of your guess's digits were in the lottery number, you win $3,000! The number was " + lottoNum);break;
      case 3: System.out.println("You matched one digit, you win $1,000! The number was " + lottoNum);break;
    }
  }
}
