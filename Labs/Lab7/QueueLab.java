import java.util.Arrays;

public class QueueLab{

  public static void main(String[] args){
    Queue test = new Queue(20);
    for(int i = 0; i < test.arrValues.length; i++){
	  test.arrValues[i] = i;
	}
	
	while(test.empty() == false){
	  System.out.println(test.dequeue() + "\nArray: " + Arrays.toString(test.arrValues));
	}
  }
}