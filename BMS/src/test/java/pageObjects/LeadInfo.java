package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadInfo extends BasePage
{
	private JavascriptExecutor javascriptExecutor;
	public LeadInfo(WebDriver driver)
	{
		super(driver);
		javascriptExecutor = (JavascriptExecutor) driver;
	}
	
	//Elements
		@FindBy(xpath="//tbody/tr[1]/td[2]")
		WebElement Lead;
		
		@FindBy(xpath="//img[@title='Add Lead']")
		WebElement Addleadbtn;
		
		@FindBy(xpath="//input[@formcontrolname='firstName']")
		WebElement Firstnametxt;
		
		@FindBy(xpath="//input[@name='last-name']")
		WebElement Lastnametxt;
		
		@FindBy(xpath="//button[normalize-space()='SAVE']")
		WebElement Savebtn;
		
		//This is a SVG Element Normal xpaths will not work for This - Unique SVG Xpath we have to Write
		@FindBy(xpath="//*[local-name()='svg'][contains(@class,'h-8 w-8 text-black ml-[1em] cursor-pointer')]")
		WebElement Deletebtn;
		
		@FindBy(xpath="//button[normalize-space()='Yes, delete it!']")
		WebElement Yesbtn;
		
		@FindBy(xpath="//button[normalize-space()='OK']")
		WebElement Okbtn;
		
		@FindBy(xpath="//*[name()='path' and contains(@fill-rule,'nonzero')]")
		WebElement attachicon;
		
		@FindBy(xpath="//div[@class='ql-editor ql-blank']")
		WebElement commentinput;
		
		@FindBy(xpath="//*[local-name()='svg'][contains(@class,'w-[17px] cursor-pointer float-right')]")
		WebElement postbtn;
		
		@FindBy(xpath="//button[normalize-space()='Yes']")
		WebElement popupyes;
		
		@FindBy(xpath="//button[normalize-space()='OK']")
		WebElement popupok;
		
		@FindBy(xpath="//*[local-name()='svg'][contains(@class,'h-6 w-6 cursor-pointer float-right svgDelete')]")
		WebElement deletecommentbtn;
		
		//ACTION METHOD
		
		public void clickaddlead()
		{
			javascriptExecutor.executeScript("arguments[0].click();", Addleadbtn);
		}
		
		public void setfirstname(String firstname)
		{
			Firstnametxt.sendKeys(firstname);
		}
		
		public void setlastname(String lastname)
		{
			Firstnametxt.sendKeys(lastname);
		}
		
		public void clicksave()
		{
			javascriptExecutor.executeScript("arguments[0].click();", Savebtn);
		}
		
		public void clickdelete() 
		{
			Deletebtn.click();
		}
		
		public void clicklead()
		{
			  javascriptExecutor.executeScript("arguments[0].click();", Lead);
		}
		
		public void clickicon() throws AWTException
		{
			attachicon.click();
			Robot r = new Robot();
			r.delay(1000);
			StringSelection ss= new StringSelection("D:\\File  Formats\\Advanced Formats\\sample11.pdf");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		
		public void clickyes()
		{
			javascriptExecutor.executeScript("arguments[0].click();", Yesbtn);
		}
		
		public void OK()
		{
			javascriptExecutor.executeScript("arguments[0].click();", Okbtn);		
		}
		
		public void comment()
		{
			commentinput.sendKeys("Hi I am Writting a Comment");
		}
		
		public void post()
		{
			postbtn.click();
		}
		
		public void popup()
		{
			popupyes.click();
		}
		
		public void ok()
		{
			popupok.click();
		}
		
		public void deleteCMNT()
		{
			deletecommentbtn.click();
		}
	}

	
	
	
