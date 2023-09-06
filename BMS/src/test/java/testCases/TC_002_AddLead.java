package testCases;

import org.testng.annotations.Test;

import pageObjects.LeadInfo;
import testBase.BaseClass;

public class TC_002_AddLead extends BaseClass
{
  @Test(priority=2)
  public void AddLead()
  {
	  logger.info("*** Started TC_002_AddLead ***");
	  LeadInfo li=new LeadInfo(driver);
	  li.clickaddlead();
	  logger.info("clicked on AddLead");
	  li.setfirstname("karthik");
	  logger.info("Entered First Name");
	  li.setlastname("shetty");
	  logger.info("Entered Last name");
	  li.clicksave();
	  logger.info("Clicked on Save Button");
	  logger.info("*** Finished TC_002_AddLead ***");
  }
}
