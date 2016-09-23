import java.util.Scanner;
public class Driver_lab3{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double x1, y1, x2, y2, p;
    double result;
    
    while(input.hasNext()){
      x1 = input.nextDouble();
      if (x1==0){
        break;
      }
      y1 = input.nextDouble();
      x2 = input.nextDouble();
      y2 = input.nextDouble();
      p  = input.nextDouble();
      result = Math.pow(Math.pow(Math.abs(x1 - x2), p)+
        Math.pow(Math.abs(y1 - y2), p), 1/p);
      System.out.format("%.10f\n",result);
    }
  }
}