package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{	  
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	  //WebElement
	  @FindBy(xpath="//img[@title='Add Lead']")
	  WebElement addleadbtn;
	  
	  @FindBy(xpath="//div[@class='avatar-img h-12 w-12 rounded-full bg-stone-300 mt-6']")
	  WebElement menu;
	  
	  @FindBy(xpath="//a[@id='user-menu-item-2']")
	  WebElement logoutbtn;
	  
	  //ACTION METHODS
	  public void clickaddlead()
	  {
		  addleadbtn.click();
	  }
	  
	  public void clickmenu()
	  {
		  menu.click();
	  }
	  public void clicklogout()
	  {
		  logoutbtn.click();
	  }
}
