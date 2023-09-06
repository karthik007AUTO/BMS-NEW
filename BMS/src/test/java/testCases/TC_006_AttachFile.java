package testCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pageObjects.LeadInfo;
import testBase.BaseClass;

public class TC_006_AttachFile extends BaseClass
{
@Test(priority=6)	
public void AttachFile() throws AWTException
{
	logger.info("*** Started TC_006_Attach File ***");
	  LeadInfo li=new LeadInfo(driver);
	  li.clickaddlead();
	  logger.info("clicked on AddLead");
	  li.setfirstname("karthik");
	  logger.info("Entered First Name");
	  li.setlastname("shetty");
	  logger.info("Entered Last name");
	  li.clickicon();
	  logger.info(" Attach Completed");
	  li.clicksave();
	  logger.info("Clicked on SAVE Button");
	  logger.info("*** Finished TC_006_Attach File ***");
}
}
