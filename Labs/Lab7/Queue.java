import java.util.Arrays;

public class Queue{
  static int[] arrValues;
  static int size;
  
  
  public Queue(){
    int size = 8;
  }
  
  public Queue(int tempSize){
    arrValues = new int[tempSize];
  }
  
  public static void enqueue(int v){
    if(size >= arrValues.length){
	  int[] temp = new int[arrValues.length * 2];
	  System.arraycopy(arrValues, 0, temp, 0, arrValues.length);
	  arrValues = temp;
	}
	arrValues[size++] = v;
  }
  
  public static int dequeue(){
	int head = 0;
	int first = arrValues[head];
    int[] n = new int[arrValues.length - 1];
	System.arraycopy(arrValues, 1, n, head, n.length);
	arrValues = n;
	return first;
  }
  
  public static boolean empty(){
    if(arrValues.length == 0){
	  return true;
	}
    else{
      return false;
	}
  }
  
  public static int getSize(){
    return size;
  }
}
