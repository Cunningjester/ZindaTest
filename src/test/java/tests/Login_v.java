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
import utils.ReadExcelData;

public class Login_v extends TestConfig{
	boolean status=false;
	
	@Test(priority=1)
	public void Verification_for_Valid_Login_Functionality_Check() throws BiffException, IOException {
		status=false;
		ReadExcelData testData = new ReadExcelData("Config");
		ExtentTest test = null;
		try{
		LoginPage loginPage = new LoginPage(TestConfig.getDriver());
		loginPage.login(testData.readData(1, 1), testData.readData(1, 2));
			Thread.sleep(20000);
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
