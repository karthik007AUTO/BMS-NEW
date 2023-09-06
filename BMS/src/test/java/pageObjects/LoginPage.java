package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage
{
 // WebDriver ldriver;
  
 // public LoginPage(WebDriver rdriver)
 // {
//	  ldriver=rdriver;
	//  PageFactory.initElements(rdriver, this);
 // }
  
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	
  // WebElements
  @FindBy(xpath="//input[@id='input28']")
  WebElement usernametxt;
  
  @FindBy(xpath="//input[@type='password']")
  WebElement passwordtxt;
  
  @FindBy(xpath="//label[normalize-space()='Keep me signed in']")
  WebElement Checkbox;
  
  @FindBy(xpath="//input[@value='Sign in']")
  WebElement loginbtn;
  
  // ACTION METHODS
  public void setUserName(String uname)
  {
	  usernametxt.sendKeys(uname);
  }
  
  public void setPassWord(String pwd)
  {
	  passwordtxt.sendKeys(pwd);
  }
  
  public void clickCheckBox()
  {
	  Checkbox.click();
  }
  
  public void clickLogin()
  {
	  loginbtn.click();
  }
  
  
  
  
  
  
  
  
  
  
}
