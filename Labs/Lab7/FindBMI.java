import java.util.Scanner;

public class FindBMI{
  
  public static void main(String[] args){
    BMI user = new BMI();
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter your name: ");
	user.name = input.nextLine();
	
	System.out.println("Please enter your age: ");
	user.age = input.nextInt();
	
	System.out.println("Please enter your weight(in pounds): ");
	user.weight = input.nextDouble();
	
	System.out.println("Please enter your height in feet: ");
	user.feet = input.nextDouble();
	
	System.out.println("Inches: ");
	user.inches = input.nextInt();
	
	System.out.println(user.getBMI());
  }
  
  public static class BMI{
    String name;
	int age;
	double weight;
	double feet;
	double inches;
	final double KPP = 0.45359237;
	final double MPI = 0.0254;
	
	BMI(){
	  name   = "Liam";
	  age    = 19;
	  weight = 160;
	  feet   = 5;
	  inches = 9;
	}
	
	BMI(String tempName, int tempAge, double tempWeight, double tempFeet, double tempInches){
	  tempName = name;
	  tempAge = age;
	  tempWeight = weight;
	  tempFeet = feet;
	  tempInches = inches;
	}
	
	public double getBMI(){
	  double bmi = weight * KPP / (((feet*12 + inches) * MPI) * ((feet*12 + inches) * MPI));
	  return Math.round(bmi * 100) / 100.0;
	}
	
	public String getStatus(){
	  double bmi = getBMI();
	  if(bmi < 18.5)
        return "Underweight";
	  else if(bmi < 25)
	    return "Normal";
	  else if(bmi < 30)
	    return "Overweight";
	  else
	    return "Obese";
	}
	
	public String getName(){
	  return name;
	}
	
	public int getAge(){
	  return age;
	}
	
	public double getWeight(){
	  return weight;
	}
	
    public void getHeight(){
      System.out.println(feet + " feet, " + inches + " inches");  
    }
  }
  
}