package epam.task41;

import java.util.logging.Logger;

public class building {
private static final Logger logger=Logger.getLogger("building.class");
void build(String s,double s1) {
	if(s.equals("standard materials"))
	{
		logger.info(""+1500*s1);
	}
	else if(s.equals("above standard materials"))
	{
		logger.info(""+1500*s1);	
	}
	else if(s.equals("high standard materials"))
	{
		logger.info(""+1800*s1);
	}
	else if(s.equals("high standard and fully automated"))
	{
		logger.info(""+2500*s1);
	}
}
}