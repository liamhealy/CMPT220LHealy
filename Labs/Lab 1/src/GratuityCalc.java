import java.util.Scanner;

public class GratuityCalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();
		double tottip = (subtotal * gratuity) / 100;
		double total = subtotal + tottip;
		System.out.println("The gratuity is $" + tottip + " and total is $" + total);

	}

}
