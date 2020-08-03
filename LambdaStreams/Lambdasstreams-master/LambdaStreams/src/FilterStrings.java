import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class FilterStrings {
	public static List<String> search(List<String> list) 
	{
		return list
				.stream()
				.filter(s -> s.startsWith("a") && s.length()==3)
				.collect(Collectors.toList());
	}
	public static void main(String args[]) 
	{	
		List<String> arraylist = new ArrayList<String>();
		 arraylist.add("abc"); 
	        arraylist.add("axy"); 
	        arraylist.add("azz");
	        arraylist.add("xyz");
	        arraylist.add("abcd");
	        arraylist.add("tuv");
	        arraylist.add("wxyz");
	        List<String> s = search(arraylist); 
	        System.out.println(s);	
	}
}