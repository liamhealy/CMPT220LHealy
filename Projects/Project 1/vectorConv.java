import java.util.Scanner;
import java.util.Arrays;

public class vectorConv {
  public static void main(String[] args){
	
	System.out.println("Please enter the size of the first vector: ");
    Scanner input = new Scanner(System.in);
    int voneSize = input.nextInt();
    System.out.println("Please enter the size of the second vector: ");
    int vtwoSize = input.nextInt();
    System.out.println("Please enter the elements of the first vector: ");
    
    double[] vFirst = new double[voneSize];
    double[] vSecond = new double[vtwoSize];
    
    for(int i = 0; i < voneSize; i++){
      vFirst[i] = input.nextDouble();
    }
    
    System.out.println("Please enter the elements of the second vector: ");
    
    for(int i = 0; i < voneSize; i++){
      vSecond[i] = input.nextDouble();
    }
    
    System.out.println(Arrays.toString(vFirst) + "&" + Arrays.toString(vSecond));
    
    convolution(vFirst, vSecond);
  
  }
  
  public static void convolution(double[] arr1, double[] arr2){

	double[] cResult = new double[arr1.length + arr2.length - 1];
	for(int i = 0; i < cResult.length; i++){
      for(int j = 0; j < 2; j++){
        if(i >= 0 &&  i < cResult.length && j >= 0){
          cResult[i] = (arr1[i - j] * arr2[i]);
          System.out.println("Convolution = " + Arrays.toString(cResult));
        }
        else{
          System.out.println("The convolution went out of bounds!");
        }
        break;
      }
    }
  }
}