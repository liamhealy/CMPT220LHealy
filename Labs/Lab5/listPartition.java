import java.util.Scanner;

public class listPartition {
  public static void main(String[] args){
    System.out.println("Please enter a list in which the first number indicates"
    		           + "\nthe size of the list: ");
    Scanner input = new Scanner(System.in);
    int[] userList = new int[input.nextInt() - 1];
    
    for(int i = 0; i < userList.length; i++){
      userList[i] = input.nextInt();
    }
    partition(userList);
  }
  
  public static int[] partition(int[] list){
    int pivot = list[0], temp;
	
	for(int i = 1; i < list.length; i++){
	  if(list[i] <= pivot){
	    temp = list[i];
	    list[i] = pivot;
	    list[i - 1] = list[i];
	    list[i - 1] = temp;
	  }
	  
	  else if(list[i] > pivot){
	    list[i] = pivot++;
	  }
    }
  return list;
  }
}