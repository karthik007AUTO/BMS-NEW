package testBase;
import java.time.Duration;
import java.util.ResourceBundle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pageObjects.LoginPage;

public class BaseClass 
{
  public String baseURL="https://lms-test.software-development.biz/";
  public String username="shijumathew@amt.in";
  public String password="Amtindia@1234";
  public static WebDriver driver;
  
  public Logger logger;
  public ResourceBundle rb;
  
  
  @BeforeClass
  @Parameters("browser")
  public void setup(String br)
  {
	  rb=ResourceBundle.getBundle("config");
	  logger=LogManager.getLogger(this.getClass());
	  if (br.equals("chrome"))
	  {
		  ChromeOptions ops = new ChromeOptions();
		  ops.addArguments("--remote-allow-origins=*");
		  driver=new ChromeDriver(ops);
	  }
	  else if (br.equals("edge"))
	  {
		  EdgeOptions ops = new EdgeOptions();
		  ops.addArguments("--remote-allow-origins=*");
		  driver=new EdgeDriver(ops);
	  }
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	  driver.get(baseURL);
	  LoginPage lp=new LoginPage(driver);
	  lp.setUserName(username);
	  lp.setPassWord(password);
	  lp.clickCheckBox();
	  lp.clickLogin();
  }
  
  @AfterClass
  public void logout() throws InterruptedException
  { 
	  driver.close();
  }
}
