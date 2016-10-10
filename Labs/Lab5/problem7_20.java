import java.util.Arrays;
import java.util.Scanner;

public class problem7_20 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	System.out.println("Please enter ten double values to make up an array: ");
    int[] userArray = new int[10];
    for(int i = 0; i < 10; i++){
      userArray[i] = input.nextInt();
    }
    
    selectSwap(userArray);
  }
  
  public static void selectSwap(int[] arr){
    
    for(int i = 1; i < arr.length; i++){

      int first = 0;
      for(int j = 1; j <= i; j++){
        
        if (arr[j] > arr[first]){
          first = j;
        }
        int temp = arr[first];
        arr[first] = arr[i];
        arr[i] = temp;
      }
    }
    System.out.println(Arrays.toString(arr));
    }
  }	

