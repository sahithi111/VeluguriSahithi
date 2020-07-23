package epam.task41;

import java.util.Scanner;
import java.util.logging.Logger;

public class construction {
	private static final Logger logger=Logger.getLogger("construction.class");
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		double s1=sc.nextDouble();
		building b=new building();
		b.build(s,s1);
		sc.close();
	}

}
