package pageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

	public class MyAgent extends BasePage
	{
		private JavascriptExecutor javascriptExecutor;
		public MyAgent(WebDriver driver)
		{
			super(driver);
			javascriptExecutor = (JavascriptExecutor) driver;
		}
		
		//Elements
		@FindBy(xpath="//label[normalize-space()='My Agents']")
		WebElement MyAgent;
		
		@FindBy(xpath="//img[@title='Add Agent']")
		WebElement AddAgent;
		
		@FindBy(xpath="//input[@id='names']")
		WebElement FirstNametxt;
		
		@FindBy(xpath="//input[@id='lastName']")
		WebElement LastNametxt;
		
		@FindBy(xpath="//input[@id='email']")
		WebElement Emailtxt;
		
		@FindBy(xpath="//input[@id='mobiles']")
		WebElement Mobiletxt;
		
		@FindBy(xpath="//select[@id='state']")
		WebElement Dropdown;
		
		@FindBy(xpath="//button[normalize-space()='SAVE']")
		WebElement Savebtn;
		
		
		
		//ACTION METHODS
		public void clickmyagent()
		{
			javascriptExecutor.executeScript("arguments[0].click();", MyAgent);
			//MyAgent.click();
		}
		
		public void addagent()
		{
			javascriptExecutor.executeScript("arguments[0].click();", AddAgent);
			//AddAgent.click();
		}
		
		public void setfirstname(String FirstName)
		{
			FirstNametxt.sendKeys(FirstName);
		}
		
		public void setlastname(String LastName)
		{
			LastNametxt.sendKeys(LastName);
		}
		
		public void setemail(String Email)
		{
			Emailtxt.sendKeys(Email);
		}
		
		public void setnumber(String number)
		{
			Mobiletxt.sendKeys(number);
		}
		
		public void setoption()
		{
			Select drop=new Select(Dropdown);
			drop.selectByValue("Alaska");
		}
		
		public void clicksave()
		{
			Savebtn.click();;
		}
		
	}


