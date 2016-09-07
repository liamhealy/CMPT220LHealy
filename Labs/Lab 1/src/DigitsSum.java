import java.util.Scanner;

public class DigitsSum {

	public static void main(String[] args) {
		System.out.println("Please enter a number between 0 and 1000: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int sumDigits = 0;
		while(number > 0){
			sumDigits = sumDigits + (number % 10);
			number = number / 10;
		}
		System.out.println("The sum of the digits is " + sumDigits);
	}

}
