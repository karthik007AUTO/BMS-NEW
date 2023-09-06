package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MyAdmins extends BasePage
{
	private JavascriptExecutor javascriptExecutor;
	public MyAdmins(WebDriver driver) 
	{
		super(driver);
		javascriptExecutor = (JavascriptExecutor) driver;
	}

	//Elements
	@FindBy(xpath="//label[normalize-space()='My Admins']")
	WebElement MyAdmin;
	
	@FindBy(xpath="(//img[@title='Add Admin'])[1]")
	WebElement AddAdmin;
	
	@FindBy(xpath="//select[@id='admin']")
	WebElement Drop;
	
	@FindBy(xpath="//input[@id='names']")
	WebElement FirstNametxt;
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement LastNametxt;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement Phone;
	
	@FindBy(xpath="//button[normalize-space()='SAVE']")
	WebElement SaveBtn;
	
	//Action Methods
	public void clickmyadmin()
	{
		javascriptExecutor.executeScript("arguments[0].click();", MyAdmin);
	}
	
	public void addadmin()
	{
		javascriptExecutor.executeScript("arguments[0].click();", AddAdmin);
	}
	
	public void setdropdown()
	{
		Select drop=new Select(Drop);
		drop.selectByValue("Master");
	}
	
	public void setFirstName(String FirstName)
	{
		FirstNametxt.sendKeys(FirstName);
	}
	
	public void setLast(String LastName)
	{
		LastNametxt.sendKeys(LastName);
	}
	
	public void setnumber(String Number)
	{
		Phone.sendKeys(Number);
	}
	
	public void clickSave()
	{
		SaveBtn.click();
	}
	
}
