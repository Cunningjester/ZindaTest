package config;


import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.relevantcodes.extentreports.ExtentReports;

public class TestConfig {

	public class report {

	}

	public static WebDriver driver;
	public static ExtentReports report;
	public static List<String> reportTexts = new ArrayList<String>();


	@BeforeSuite
	public void beforeSuite() {

		try {
			System.out.println("In Before Suite");
			report = new ExtentReports(System.getProperty("user.dir") + "/src/result/TestResult.html", true);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@BeforeTest
	public void beforeTest() {

		try {
			System.out.println("In Before Test");
			driver = DriverConfig.getDriver();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@AfterTest
	public void afterTest() {
		System.out.println("In After Test");
		driver.quit();
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("In After Suite");
		report.close();
	}

	public static WebDriver getDriver() {
		return driver;
	}
}


