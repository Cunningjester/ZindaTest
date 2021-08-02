package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

public class JournyzPage {
public static WebDriver driver;

public JournyzPage(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
//@FindBy(xpath="//*[@id='carousel_31']/div/div[2]/div/div/a/div[2]/div[1]")
@FindBy(xpath="//div[@id='carousel_31']//div[@class='campaign-name-detail'][contains(text(),'Testing')]")
public WebElement jname;

@FindBy(xpath="//*[@id='project-actions']")
public WebElement actnow;

@FindBy(linkText="#actionlogs")
public WebElement actionlogs;

@FindBy(linkText="#details")
public WebElement actiondetails;

@FindBy(xpath="//*[@id='camp-leader-board']")
public WebElement leaderboard;

@FindBy(linkText="#reports")
public WebElement reports;

@FindBy(linkText="#cAchievements")
public WebElement achievements;

@FindBy(xpath="//*[@id='bs-example-navbar-collapse-1']/ul/li[2]/a")
public WebElement journyz;

@FindBy(id="searchTxt")
public WebElement search;

@FindBy(id="searchUsersBtn")
public WebElement btn;

@FindBy(xpath="//*[@id=\"actions\"]/div/div[1]/div/div[2]/span/i")
public WebElement action1;

@FindBy(xpath="//*[@id='actionsModal']/div/div/div[3]/div/textarea")
public WebElement log1;


@FindBy(xpath="//*[@id=\"actions\"]/div/div[2]/div/div[2]/span/i")
public WebElement action2;

@FindBy(xpath="//*[@id=\"actions\"]/div/div[3]/div/div[2]/span/i")
public WebElement action3;

@FindBy(xpath="//*[@id=\"actions\"]/div/div[4]/div/div[2]/span/i")
public WebElement action4;

@FindBy(xpath="//div[@id='actionsModal']//div[@class='modal-body']")
public WebElement cli;

//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]")
@FindBy(xpath="//div[@class='checkoff-action mandatory']//span[@class='onoffswitch-inner']")
public WebElement chkoff;

@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/input[1]")
public WebElement fdate;

@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[1]/input[1]")
public WebElement edate;

@FindBy(xpath="//*[@id=\"actionsModal\"]/div/div/div[3]/div[4]/input")
public WebElement qty;

@FindBy(xpath="//*[@id=\"actionsModal\"]/div/div/div[4]/button[2]")
public WebElement dn;

//@FindBy("className="fa fa-plus")
//public WebElement add;
//@FindBy(xpath="//*[@id='actionsModal']/div/div/div[3]/div[1]/label")

@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/label[1]/img[1]")
public WebElement pic;

//@FindBy(xpath="//*[@id='actionsModal']/div/div/div[4]/button[2]")
@FindBy(xpath="//*[@id=\"actionsModal\"]/div/div/div[4]/button[2]")
public WebElement done;

@FindBy(xpath=" /html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]")
public WebElement el;

@FindBy(xpath="//*[@id=\"search-user\"]")
public WebElement sh;

@FindBy(xpath="//*[@id=\"userdetail-821\"]/label/span[1]")
public WebElement snm;

@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]")
public WebElement click;

@FindBy(xpath="//div[@id='actionsModal']//li[3]")
public WebElement im;

@FindBy(xpath="//*[@id=\"actionsModal\"]/div/div/div[6]/div/text()")
public WebElement txt;

public WebElement gettxt() {
	return txt;
}
public void actionlogs(String log,String rec)throws AWTException, InterruptedException
{
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(journyz));
	journyz.click();
	search.sendKeys(rec);
	btn.click();
	jname.click();
	actnow.click();
	action1.click();
	log1.sendKeys(log);
	done.click();
	Thread.sleep(2000);
	}
	public void actionlog2(String rec)throws AWTException, InterruptedException, IOException
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(action2));
//		journyz.click();
//		search.sendKeys(rec);
//		btn.click();
//		jname.click();
//		actnow.click();
		action2.click();
		Thread.sleep(500);
		pic.click();
		StringSelection ss = new StringSelection("D:\\New folder\\My LosT LovE\\capt.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 Robot robot = new Robot();
		 robot.delay(250);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.delay(250);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 done.click();
		 Thread.sleep(2000);
		}
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//WebElement pic = driver.findElement(By.xpath("//*[@id='actionsModal']/div/div/div[3]/div[1]/label"));
	//pic.sendKeys("D:\\New folder\\My LosT LovE\\capt.jpg");
	public void actionlog3(String df,String fd,String q)throws AWTException, InterruptedException, IOException
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(action3));
		action3.click();
		chkoff.click();
		fdate.sendKeys(df);
		edate.sendKeys(fd);
		el.click();
		qty.sendKeys(q);
		done.click();
		Thread.sleep(2000);
	}
	public void actionlog4(String sn)throws AWTException, InterruptedException, IOException
	{WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(action4));
		action4.click();
		sh.sendKeys(sn);
		snm.click();
		cli.click();
		im.click();
		done.click();
		Thread.sleep(2000);
	}
}
//Runtime.getRuntime().exec("E:\\AutoIT\\fileup1.exe");
