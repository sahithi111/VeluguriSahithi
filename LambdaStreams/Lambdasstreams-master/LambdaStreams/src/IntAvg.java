import java.util.*; 
import java.util.stream.IntStream; 

public class IntAvg {
	 public static void main(String[] args) 
	    {
		 	int a[]= {11,2,55,44,66,7,88,99};
	        IntStream stream = IntStream.of(a); 
	        OptionalDouble obj = stream.average(); 
	        if (obj.isPresent()) { 
	            System.out.println(obj.getAsDouble()); 
	        } 
	        else { 
	            System.out.println("-1"); 
	        } 
	    } 

}
