import java.util.Scanner;

public class PercentCalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a midterm exam grade: ");
			double midterm = input.nextDouble();
		System.out.println("Please enter a final exam grade: ");
			double finalExam = input.nextDouble();
		System.out.println("Please enter a project grade: ");
			double projects = input.nextDouble();
		System.out.println("Please enter a grade for HW and Labs: ");
			double hwLabs = input.nextDouble();
		double finalGrade = (midterm + finalExam + projects + hwLabs) / 4;
		System.out.println("Your final grade is: " + finalGrade + "%");
	}

}
