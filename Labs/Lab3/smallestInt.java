
public class smallestInt {
  public static void main(String[] args){
    double n = 0;
	while(Math.pow(n, 2) < 12000){
      n++;
    }
    System.out.println(n);
  }
}

