package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import config.TestConfig;
import jxl.read.biff.BiffException;
import pages.JournyzPage;
import pages.LoginPage;
import pages.ReportViewPage;
import utils.ReadExcelData;

public class Logging_action extends TestConfig{
	boolean status;
	
	@Test(priority=0)
	public void login() throws BiffException,IOException{
		ReadExcelData testData = new ReadExcelData("Config");
		ExtentTest test = null;
		try{
		LoginPage loginPage = new LoginPage(TestConfig.getDriver());
		loginPage.login(testData.readData(1, 1), testData.readData(1, 2));
			Thread.sleep(2000);
			test = TestConfig.report.startTest("valid login","description");
			ReportViewPage report = new ReportViewPage();
			String actual=LoginPage.driver.getCurrentUrl();
			System.out.println(actual);
			String expected="https://app.journyz.com/users/index";
			if(actual.equals(expected))
			{
				status=true;
				test.log(LogStatus.PASS, "Test Passed");
			} else {
				status=false;
				test.log(LogStatus.FAIL, "Test Failed");
			}
}

catch(Exception e)
{
	test.log(LogStatus.FAIL, "Test Failed");
	System.out.println(e.getMessage());
}
finally {
	Assert.assertEquals(status, true);
	TestConfig.report.endTest(test);
}
	}
	@Test(priority=1)
	public void actionLog() throws BiffException,IOException{
		ReadExcelData testData = new ReadExcelData("Log");
		ExtentTest test = null;
		try{
		JournyzPage journyzPage = new JournyzPage(TestConfig.getDriver());
		journyzPage.actionlogs(testData.readData(1,2),testData.readData(1,4));
		assertEquals(driver.findElement(By.xpath("//*[@id=\"actions\"]/div/div[2]/div/div[1]/span[1]")).getText(),"Reduce Electricity Bills");
		journyzPage.actionlog2(testData.readData(1,4));
		Thread.sleep(10000);
		journyzPage.actionlog3(testData.readData(1,5), testData.readData(1,6), testData.readData(1,7));
		Thread.sleep(10000);
		journyzPage.actionlog4(testData.readData(1,8));
		Thread.sleep(10000);
			test = TestConfig.report.startTest("logging action","description");
			ReportViewPage report = new ReportViewPage();
			String actual=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[6]")).getText();
			System.out.println(actual);
			String expected=" Your action has been logged successfully.";
			if(actual.equals(expected))
			{
				status=true;
				test.log(LogStatus.PASS, "Test Passed");
			} else {
				test.log(LogStatus.FAIL, "Test Failed");
			}
			}

catch(Exception e)
{
	test.log(LogStatus.FAIL, "Test Failed");
	System.out.println(e.getMessage());
}
finally {
	Assert.assertEquals(status, true);
	TestConfig.report.endTest(test);
}
	}

}
