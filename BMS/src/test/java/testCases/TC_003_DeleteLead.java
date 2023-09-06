package testCases;

import org.testng.annotations.Test;

import pageObjects.LeadInfo;
import testBase.BaseClass;

public class TC_003_DeleteLead extends BaseClass
{
	@Test(priority=3)
	  public void DeleteLeadTest() throws InterruptedException
{
	logger.info("*** Started TC_003_DeleteLead ***");  
	  LeadInfo li=new LeadInfo(driver);
	  li.clicklead();
	  logger.info("Clicked on a Lead");
	  li.clickdelete();
	  logger.info("Clicked on a Delete");
	  li.clickyes();
	  logger.info("Clicked on Yes Delete it");
	  li.OK();
	  logger.info("Clicked on OK ");
	 logger.info("*** Finished TC_003_DeleteLead ***");
}
}