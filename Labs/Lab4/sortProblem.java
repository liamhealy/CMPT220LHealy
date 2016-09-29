/**
 * file: sortProblem.java
 * author: Liam Healy
 * course: CMPT 220
 * assignment: Lab 4
 * due date: September 29, 2016
 * version: 1.8
 * 
 * This program uses an algorithm known as bubble sort to rearrange 
 * an array of doubles in ascending order.
 */
import java.util.Scanner;

public class sortProblem {
  public static void main(String[] args){
    
	Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter 10 integers in a random order: ");
	
    double[] arr = new double[10];
    
    for(int i = 0; i < 10; i++){
      arr[i] = input.nextDouble();
    }
    bubbleSort(arr);
    
  }
  
  public static void bubbleSort(double[] array){
    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array.length - i - 1; j++){
        if (array[j] > array[j + 1]){
          double a = array[j];
          array[j] = array[j + 1];
          array[j + 1] = a;
        }
      }
    System.out.println("After " + i + " iterations: ");
    System.out.println(array);
    }
  }
}
