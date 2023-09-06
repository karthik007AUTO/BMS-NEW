package testCases;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_LogOut extends BaseClass
{
	
 @Test(priority=1)
 public void logoutTest() throws InterruptedException
 {
	 logger.debug("Automation ");
	 logger.info("*** Started TC_001_LogOut ***");
	 HomePage hp=new HomePage(driver);
	 hp.clickmenu();
	 logger.info("Clicked on menu icon");
	 hp.clicklogout();
	 logger.info("Clicked on logout option");
	 logger.info("*** Finished TC_001_LogOut ***");	 
 }
}
