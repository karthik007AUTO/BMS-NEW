package testCases;

import org.testng.annotations.Test;

import pageObjects.MyAdmins;
import testBase.BaseClass;

public class TC_005_AddAdmin extends BaseClass
{
	
@Test(priority=5)
public void AddAdmin()
{
	logger.info("*** Started TC_005_AddAdmin ***");
	MyAdmins md=new MyAdmins(driver);
	md.clickmyadmin();
	logger.info("*** Clicked on MyAdmins in Homepage ***");
	md.addadmin();
	logger.info("*** Clicked on AddAdmin Icon ***");
	md.setdropdown();
	logger.info("*** Clicked on Drop Down Option ***");
	md.setFirstName("Admin");
	logger.info("*** Entered First Name ***");
	md.setLast("last");
	logger.info("*** Entered Last Name ***");
	md.setnumber("7259546153");
	logger.info("*** Entered Number ***");
	md.clickSave();
	logger.info("*** Clicked on Save ***");
	logger.info("*** Finished TC_005_AddAdmin ***");
	
}
}
