package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConst
{
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	
	
	
	@BeforeMethod
	public void launchApp(String browser)
	{
	
		 System.setProperty(CHROME_KEY,CHROME_VALUE);
		 driver=new ChromeDriver();
		 wait=new WebDriverWait(driver,10);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     driver.get(APP_URL);
	    
	}
	
	
}
