package config;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import jxl.read.biff.BiffException;
import utils.ReadExcelData;

public class DriverConfig {
	public static WebDriver driver;
    static ReadExcelData testData = null;
	
	public static WebDriver getDriver() throws BiffException, IOException {
		testData = new ReadExcelData("Config");
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\zindat\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get(testData.readData(1, 0));
		return driver;
	}
	public static DesiredCapabilities getCapability() {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browser.download.folderList", 2);
		capabilities.setCapability("ignoreProtectedModeSettings", true);
		capabilities.setCapability("enableElementCacheCleanup", true);
		capabilities.setCapability("browser.download.dir", "C:\\dockDownloads");
		capabilities.setCapability("browser.helperApps.neverAsk.saveToDisk", true);
		capabilities.setCapability(CapabilityType.SUPPORTS_APPLICATION_CACHE, true);
		capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
		capabilities.setCapability(CapabilityType.ForSeleniumServer.PROXYING_EVERYTHING, true);
		return capabilities;
	}

	public static void quitDriver() {
		driver.quit();
	}
}
