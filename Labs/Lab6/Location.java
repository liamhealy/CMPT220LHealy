public class Location{
  
  int row;
  int column;
  double maxValue;
  
  Location(){
    row = 0;
	column= 0;
	maxValue = 0;
  }
  
  Location(int tempRow, int tempColumn, double tempMax){
    
	tempRow     = row;
	tempColumn  = column;
	tempMax     = maxValue;
	
  }
  
  public static Location locateLargest(double[][] arr){
	
	double maxValue = arr[0][0];
	int row = 0;
	int column = 0;
	for(int i = 0; i < arr.length; i++){
	  for(int j = 0; j < arr[i].length; j++){
	    if(arr[i][j] > maxValue){
		  maxValue = arr[i][j];
		  row = i;
		  column = j;
		}
	  }
	}
	System.out.println("The location of the largest element is: " + maxValue + "\n"
					   + " at " + "(" + row + "," + column + ")");
	return new Location();
  }
  
}