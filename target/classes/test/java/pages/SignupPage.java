package pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
public static WebDriver driver;

public SignupPage(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(name="first_name")
public WebElement fname;

@FindBy(name="last_name")
public WebElement lname;

@FindBy(name="email")
public WebElement em;

@FindBy(name="org_name")
public WebElement oname;

@FindBy(name="description")
public WebElement desc;

@FindBy(name="terms_accepted")
public WebElement chk;

@FindBy(name="signupSubmit")
public WebElement submit;

@FindBy(xpath="//*[@id=\"pwdinfo\"]/div[3]/div[1]/b")
public WebElement journyz;

public WebElement getjournyz()
{
	return journyz;
}

public void signup(String first,String second,String compnm,String des)
{
	fname.sendKeys(first);
	lname.sendKeys(second);
	em.click();
	Random randomGenerator = new Random();  
	int randomInt = randomGenerator.nextInt(1000);  
	em.sendKeys("sandeep"+ randomInt +"@yopmail.com");  
	oname.sendKeys(compnm);
	desc.sendKeys(des);
	chk.click();
	submit.click();
	
}

}
