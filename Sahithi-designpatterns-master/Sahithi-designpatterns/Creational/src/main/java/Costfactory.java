
public class Costfactory {
public Specialization getPhone(String s)
{
	if (s.equals("oneplus8"))
{
	return new oneplus8();
}
	else if(s.equals("oneplus9"))
			{
		return new oneplus9();
				
			}
	else if(s.equals("oneplus10"))
	{
		return new oneplus10();
		
	}
	else
	{
		return(null);
	}
	
	
	
	
}
}
