package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.SeleneseTestBase;

@SuppressWarnings("deprecation")
public class WebDriverConfig 

{


	public WebDriver driver =null;


	//String build  = "http://demo-app.zinda.xyz/admin/users/login";
	
	
	String build  = "https://app.socially360.com/view/137/42_137_5";


	private WebDriverConfig()

	{
		driver = new FirefoxDriver();
		driver.get(build);
		driver.manage().window().maximize();                
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	private static boolean hasObject = false;
	private static WebDriverConfig singletonObject = null;

	public static WebDriverConfig getObject()

	{
		if (hasObject)

		{
			return singletonObject;
		} 

		else 

		{
			hasObject = true;
			singletonObject = new WebDriverConfig();
			return singletonObject;
		}
	}

	public static WebDriver getCurrentDriver() 

	{
		return null;
	}

	public SeleneseTestBase findElement(By cssSelector) 

	{
		return null;
	}


}
