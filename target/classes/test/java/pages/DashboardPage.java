package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
public static WebDriver driver;

public DashboardPage(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver, this);
}
@FindBy(linkText="/users/registry")
public WebElement journyz;

@FindBy(linkText="#")
public WebElement Toggle;

@FindBy(linkText="/users/campaign")
public WebElement Myjournyz;

@FindBy(linkText="/users/circle")
public WebElement Mycircle;

@FindBy(linkText="/users/actionlog")
public WebElement Myactions;

@FindBy(linkText="/users/notifications")
public WebElement Notifications;

@FindBy(linkText="/users")
public WebElement Dashboard;





}
