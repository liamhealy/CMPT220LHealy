import java.math.BigDecimal;

public class squareNumbers{
  
  public static void main(String[] args){
    
	BigDecimal maxLong = new BigDecimal(Long.MAX_VALUE);
	long first = (long) Math.sqrt(Long.MAX_VALUE);
	BigDecimal decFirst = new BigDecimal(first);
	int i = 0;
	while(i < 10){
	  BigDecimal sqrd = decFirst.multiply(decFirst);
	  if(sqrd.compareTo(maxLong) > 0){
		i++;
	    System.out.println(i + "= " + decFirst);
	  }
	  decFirst = decFirst.add(BigDecimal.ONE);
	}
  }
}