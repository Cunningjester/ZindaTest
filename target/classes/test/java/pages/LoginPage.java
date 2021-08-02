package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public static WebDriver driver;

public LoginPage(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(name="email")
public WebElement mail;

@FindBy(name="password")
public WebElement pass;

@FindBy(linkText="/user/forgotpassword")
public WebElement forgot;

@FindBy(name="login-submit")
public WebElement login;

public void login(String userid,String password)
{
mail.clear();
pass.clear();

mail.sendKeys(userid);

pass.sendKeys(password);

login.click();
}
}
