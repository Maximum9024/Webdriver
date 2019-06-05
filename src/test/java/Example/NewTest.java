package Example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	private WebDriver driver;
  @Test
  public void f()
  {
	
	  String url="http://demo.guru99.com/test/guru99home/";
	  driver.get(url);
	  String title = driver.getTitle();
	  Assert.assertTrue(title.contains("Demo Guru99 Page"));;
  }
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMafora\\Desktop\\Automation\\seleniumtools\\chromedriver.exe");
	 driver = new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest()
  {
	  driver.quit();
  }

}
