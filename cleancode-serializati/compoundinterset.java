package epam.task4;

public class compoundinterset{
	void compoundinterset1(double income,double rateofinterset,double numberofyears )
	{
		double compo1=Math.pow((1+(rateofinterset/100)), numberofyears);
		double compound=compo1*income;
		System.out.println(compound);
	}

}
