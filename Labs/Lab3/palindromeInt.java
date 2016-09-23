import java.util.Scanner;

public class palindromeInt{
  public static void main(String[] args){
    System.out.println("Please enter a three digit integer: ");
    Scanner input = new Scanner(System.in);
    int numberEx = input.nextInt();
    System.out.println("The palindrome is :" + reverse(numberEx));
    System.out.println("To verify, palindrome = " + isPalindrome(reverse(numberEx)));
  }
  
  public static int reverse(int number){
    int digOne = number / 100;
    int digTwo = number / 100 % 10;
    int digThree = number % 10;
    int reverseNum = digThree + digTwo + digOne;
    return reverseNum;
  }
  
  public static boolean isPalindrome(int numberEx){  
    if (reverse(numberEx) == (numberEx)){
    	return true;
    }
    else{
    	return false;
    }
  }
}