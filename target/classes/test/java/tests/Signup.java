package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import config.TestConfig;
import jxl.read.biff.BiffException;
import pages.LoginPage;
import pages.ReportViewPage;
import pages.SignupPage;
import utils.ReadExcelData;

public class Signup extends TestConfig {
	boolean status=false;
	@Test(priority=1)
	public void Signup_Zinda() throws BiffException, IOException {
		status=false;
		ReadExcelData testData = new ReadExcelData("Config");
		ExtentTest test = null;
		try{
		driver.navigate().to("https://prodtest.zinda.xyz/signup");
		SignupPage signupPage = new SignupPage(TestConfig.getDriver());
		signupPage.signup(testData.readData(1, 4), testData.readData(1, 5),testData.readData(1, 7),testData.readData(1, 8));
			Thread.sleep(20000);
			test = TestConfig.report.startTest("valid signup","description");
			ReportViewPage report = new ReportViewPage();
			String actual=signupPage.getjournyz().getText();
			System.out.println(actual);
			String expected="Welcome to Journyz !!";
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


