import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ActionKeywords {
  public static WebDriver driver;
  
  public static void OpenBrowser()
  {
	     System.setProperty("webdriver.chrome.driver", "D:\\EduSol\\Selenium Jar Files\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
	  /*System.setProperty("webdriver.gecko.driver", "D:\\EduSol\\Selenium Jar Files\\Selenium Webdrivers\\geckodriver.exe");
	 driver=new FirefoxDriver();*/
  }
  public static void navigate()
  {
	  driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	  driver.get("http://www.gmail.com");
	  driver.manage().window().maximize();
  }
  public static void InputUsername()
  {
  driver.findElement(By.id("identifierId")).sendKeys("shahinsayyed8421@gmail.com");
  }
  
  public static void ClickNext()
  {
  driver.findElement(By.className("VfPpkd-RLmnJb")).click();
  }
  
  public static void InputPassworde()
  {
  driver.findElement(By.name("password")).sendKeys("shahin@123456");
  }
  
  public static void ClickSignin()
  {
	  driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
  }
  
  
  public static void CloseBrowser()
  {
	  driver.close();
  }
  
}
