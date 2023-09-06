package testCases;

import org.testng.annotations.Test;
import pageObjects.MyAgent;
import testBase.BaseClass;

public class TC_004_AddAgent extends BaseClass
{
	@Test(priority=4)
	public void addadmin()
	{
		MyAgent Ma = new MyAgent(driver);
		logger.info("*** Started TC_004_Create Agent ***");
	    Ma.clickmyagent();
	    logger.info("*** Clicked on My Agent ***");
		Ma.addagent();
		logger.info("*** Clicked on add agent Icon ***");
		Ma.setfirstname("Karthik");
		logger.info("*** Entered First Name ***");
		Ma.setlastname("Shetty");
		logger.info("*** Entered Last Name ***");
		Ma.setemail("shettykarthik007@gmail.com");
		logger.info("*** Entered Email Address ***");
		Ma.setnumber("7259546153");
		logger.info("*** Entered Number ***");
		Ma.clicksave();	
		logger.info("*** Finished TC_004_Create Agent ***");
	}
	
}