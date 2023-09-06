package testCases;

import org.testng.annotations.Test;
import pageObjects.LeadInfo;
import testBase.BaseClass;

public class TC_007_AddComment extends BaseClass
{
	
@Test(priority=7)
public void AddComment()
{
	logger.info("*** Started TC_007_Add Comment ***");  
	  LeadInfo li=new LeadInfo(driver);
	  li.clicklead();
	  logger.info(" Clicked on a Lead ");
	  li.comment();
	  logger.info(" Written a Comment ");
	  li.post();
	  logger.info(" Clicked on Post Button ");
	  li.popup();
	  logger.info(" Clicked on Yes in PopUp ");
	  li.ok();
	  logger.info(" Clicked on OK in PopUp ");
	  logger.info("*** Finished TC_007_Add Comment ***");  
}
}
