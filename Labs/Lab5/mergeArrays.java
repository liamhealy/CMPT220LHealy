import java.util.Arrays;
import java.util.Scanner;

public class mergeArrays {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
	System.out.println("Please enter two sorted lists of values, but keep in mind \nthat the first number input indicates the size of the list.\nArray 1: ");
    
	int[] arr1 = new int[input.nextInt() - 1];
	
	for(int i = 0; i < arr1.length - 1; i ++){
      
      arr1[i] = input.nextInt();  
	}
	System.out.println("Array 2: ");
	
	int[] arr2 = new int[input.nextInt()];
	
	for(int i = 0; i < arr2.length - 1; i++){
	  
	  arr2[i] = input.nextInt();
	}
    merge(arr1, arr2);
  }
  
  public static void merge(int[] a, int[] b){
    int[] arr = new int[a.length + b.length];
    int int1 = 0, int2 = 0, int3 = 0;
    while(int1 < a.length && int2 < b.length){
      if(a[int1] < b[int2]){
        
    	arr[int3] = a[int1];
        int1++;
      }
      else{
        
    	arr[int3] = b[int2];
        int2++;
      }
      
      int3++;
    
    }
    
    while(int1 < a.length){
       
      arr[int3] = a[int1];
      int1++;
      int3++;
    }
     
    while(int2 < b.length){
       
      arr[int3] = b[int2];
      int2++;
      int3++;
    }
    
   System.out.println("The sorted merge of the two strings is: " + Arrays.toString(arr));
  }
 
}
