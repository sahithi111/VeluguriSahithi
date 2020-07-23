package epam.task4;

import java.util.Scanner;

public class compute{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double income=sc.nextDouble(); 
		double  rateofinterset=sc.nextDouble();
		double numberofyears=sc.nextDouble();
		simpleinterset s=new simpleinterset();
		compoundinterset c=new compoundinterset();
		s.simpleinterset1(income,rateofinterset,numberofyears);
		c.compoundinterset1(income,rateofinterset,numberofyears);
		
	}
}
