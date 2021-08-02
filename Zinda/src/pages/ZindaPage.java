package pages;

import java.awt.AWTException;
import java.sql.SQLException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WebDriverConfig;

public class ZindaPage

{


	public static int ran;

	public static String actioncategory;
	public static String actiontype;
	public static String achievement;


	int num1, num2, num3; 
	int set2, set3; 

	public String number;


	WebDriverConfig drvr = WebDriverConfig.getObject();

	public ZindaPage() 

	{

		PageFactory.initElements(drvr.driver, this);

	}


	@FindBy(id="username")
	WebElement emailAddress;

	@FindBy(id="login_password")
	WebElement loginPassword;

	@FindBy(id="login-submit")
	WebElement loginButton;
	
	@FindBy(xpath="/html/body/nav/div/div[2]/ul/li[5]/a")
	WebElement organizationtabTop;

	@FindBy(xpath="/html/body/div[1]/div/div/form/div/div[1]/div/div[2]/button")
	WebElement addorganizationButton;

	@FindBy(id="company_name")
	WebElement comapnynametextField;

	@FindBy(id="org_country")
	WebElement countrydropDown;

	@FindBy(id="company_email")
	WebElement administratoremailidtextFiled;

	@FindBy(id="company_email_domain")
	WebElement companyemailidtextFiled;

	@FindBy(id="company_expUsers")
	WebElement numberofuserstextFiled;

	@FindBy(xpath="/html/body/div/form/div/div[3]/div[1]/div[2]/div/label")
	WebElement categoryThumbnail;

	@FindBy(id="create-company")
	WebElement createButton;

	@FindBy(xpath="/html/body/form/div/div/div/div[3]/div[1]/div[1]/div[1]/div[1]")
	WebElement orgName;

	@FindBy(xpath="/html/body/form/div/div/div/div[3]/div[1]/div[1]/div[2]/div")
	WebElement orgEmail;

	@FindBy(xpath="/html/body/form/div/div/div/div[3]/div[1]/div[1]/div[3]/div")
	WebElement orgDomain;

	@FindBy(xpath="/html/body/form/div/div/div/div[3]/div[1]/div[1]/div[4]/div[1]")
	WebElement orgCountry;

	@FindBy(xpath="/html/body/form/div/div/div/div[4]/div/ul/li[1]/a")
	WebElement usersTab;

	@FindBy(xpath="/html/body/form/div/div/div/div[4]/div/ul/li[3]/a")
	WebElement projectsTab;

	@FindBy(xpath="/html/body/form/div/div/div/div[4]/div/ul/li[4]/a")
	WebElement settingsTab;

	@FindBy(xpath="/html/body/nav/div/div[2]/ul/li[7]/a")
	WebElement actionsTab;

	@FindBy(xpath="/html/body/div[1]/form/div[2]/div/div[2]/div[2]/button")
	WebElement actioncategoryName;

	@FindBy(xpath="/html/body/div[1]/form/div[2]/div/div[2]/div[2]/div/ul/li[3]/a/span[1]")
	WebElement costReduction;

	@FindBy(id="action_input")
	WebElement action;

	@FindBy(xpath="action_input")
	WebElement points;

	@FindBy(xpath="/html/body/div[1]/form/div[2]/div/div[3]/div/div[3]/div[2]/label")
	WebElement inputType;

	@FindBy(xpath="/html/body/nav/div/div[2]/ul/li[9]/a/i")
	WebElement prelogoutButton;

	@FindBy(xpath="/html/body/nav/div/div[2]/ul/li[9]/ul/li/a")
	WebElement logoutButton;

	@FindBy(xpath="/html/body/div/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/span[2]")
	WebElement projectsThumbnail;

	@FindBy(xpath="/html/body/div/div/div[1]/div[2]/div/div[2]/div/div[2]/div[1]/span[2]")
	WebElement campaignsThumbnail;

	@FindBy(xpath="/html/body/div/div/div[1]/div[2]/div/div[3]/div/div[2]/div[1]/span[2]")
	WebElement circlesThumbnail;

	@FindBy(xpath="/html/body/div/nav/div[2]/div/div[2]/ul/li[2]/a")
	WebElement projectsTab1;

	@FindBy(xpath="/html/body/div/nav/div[2]/div/div[2]/ul/li[1]/a")
	WebElement dashboardTab1;

	@FindBy(xpath="/html/body/nav/div/div[2]/ul/li[3]/a")
	WebElement campaignsTab1;

	@FindBy(xpath="/html/body/nav/div/div[2]/ul/li[4]/a")
	WebElement circlesTab11;

	@FindBy(xpath="/html/body/nav/div/div[2]/ul/li[5]/a")
	WebElement gamificationTab1;

	@FindBy(id="create-project-btn")
	WebElement createnewprojectButton;

	@FindBy(id="projectName")
	WebElement projectnametextField;

	@FindBy(id="editor")
	WebElement projectEditor;

	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[2]/form/div[3]/div/div[2]/label[1]")
	WebElement globalcheckBox;

	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[2]/form/div[4]/div/div/div[1]/div/div/div[1]/button")
	WebElement actioncategorydropDown;

	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[2]/form/div[4]/div/div/div[1]/div/div/div[1]/div/div/input")
	WebElement actioncategorytextField;

	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[2]/form/div[4]/div/div/div[1]/div/div/div[1]/div/ul/li[1]/a/span[1]")
	WebElement costing;

	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[2]/form/div[4]/div/div/div[4]/div[1]/div/div[1]/button")
	WebElement actiondropDown;

	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[2]/form/div[4]/div/div/div[4]/div[1]/div/div[1]/div/div/input")
	WebElement actiondropdowntextField;

	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[2]/form/div[4]/div/div/div[6]/div[1]/label")
	WebElement enableGamification;

	@FindBy(id="points_1")
	WebElement pointstextField;

	@FindBy(id="add-points-sender")
	WebElement shoutoutPoint;

	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[2]/form/div[4]/div/div/div[6]/div[2]/div[4]/div/div[1]/div/div[1]/button")
	WebElement achievementdropDown;

	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[2]/form/div[4]/div/div/div[6]/div[2]/div[4]/div/div[1]/div/div[1]/div/div/input")
	WebElement achievementsearchdropDown;

	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[2]/form/div[4]/div/div/div[6]/div[2]/div[4]/div/div[2]/div/input")
	WebElement achievementPoints;

	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[2]/form/div[4]/div/div/div[4]/div[2]/div[3]/div/div[1]/div/div[1]/button")
	WebElement achievementsdropDown;

	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[2]/form/div[4]/div/div/div[4]/div[2]/div[3]/div/div[1]/div/div[1]/div/ul/li[1]/a/span[1]")
	WebElement master;

	@FindBy(id="rules_1_1")
	WebElement numberofAchievements;

	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[2]/form/div[5]/div[1]/div[2]/div/label/img[2]")
	WebElement categorythumbnailFirst;

	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[2]/form/div[5]/div[2]/button")
	WebElement createprojectButton;

	@FindBy(id="project-actions")
	WebElement projectactionsTab;

	@FindBy(id="project-activity-log")
	WebElement activitylogTab;

	@FindBy(id="project-details")
	WebElement detailsTab;

	@FindBy(id="searchTxt")
	WebElement projectssearchtextField;

	@FindBy(id="searchUsersBtn")
	WebElement projectssearchButton;

	@FindBy(xpath="/html/body/div/div[1]/div/div[3]/ul/li[1]/a/span[1]")
	WebElement projectThumbnail;

	@FindBy(xpath="/html/body/div/div[1]/div/div[3]/ul/li/a/img")
	WebElement projectlistingThumbnail;

	@FindBy(xpath="/html/body/div/div[1]/div/div[3]/ul/li[1]/div/div/div[1]/span")
	WebElement visitpageButton;

	@FindBy(id="create-project-btn")
	WebElement editprojectButton;

	@FindBy(id="projectLogo")
	WebElement projectlogouploadButton;

	@FindBy(id="create-project-btn")
	WebElement createnewcircleButton;

	@FindBy(id="circleLogo")
	WebElement newcircleimguploadButton;

	@FindBy(xpath="/html/body/div/div/div/form/div/div[3]/button")
	WebElement createcircleButton;

	@FindBy(id="create-project-btn")
	WebElement createnewcampaignButton;

	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[2]/form/div[4]/div[2]/button")
	WebElement createcampaignButton;

	@FindBy(id="circleName")
	WebElement circlenametextField;

	@FindBy(xpath="/html/body/div/div/div/form/div/div[1]/div[2]/div/div/input")
	WebElement selectusertextFiled;

	@FindBy(id="searchTxt")
	WebElement circlesearchtextField;

	@FindBy(xpath="/html/body/div/div/div/ul/li/span[3]")
	WebElement circletumbnail;

	@FindBy(xpath="/html/body/div/div/div/ul/div/div/div[2]/div/div[1]/span")
	WebElement circlesvisitButton;

	@FindBy(xpath="/html/body/div/div/div/ul/li/img")
	WebElement circlesearchThumbnail;

	@FindBy(id="campaignName")
	WebElement campaignnametextField;

	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div/div[1]/button")
	WebElement selectprojectdropDown;

















	public int randomnumber() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{

		Thread.sleep(1000);
		ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
		Thread.sleep(1000);
		return num1;

	}



	public void login(String emailaddress, String password) throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		emailAddress.sendKeys(emailaddress);
		loginPassword.sendKeys(password);
		loginButton.click();

	}


	public void Organization_Creation() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{

		Thread.sleep(3000);
		ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
		Thread.sleep(1000);
		organizationtabTop.click();
		Thread.sleep(1000);
		addorganizationButton.click();
		//System.out.println(ran);
		Thread.sleep(1000);
		comapnynametextField.sendKeys(ran+"Prince@"+ran+".com");
		countrydropDown.click();
		countrydropDown.sendKeys(Keys.DOWN);
		countrydropDown.sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		administratoremailidtextFiled.sendKeys(ran+"Prince@"+ran+".com");
//		companyemailidtextFiled.sendKeys(ran+"Prince@"+ran+".com");
		numberofuserstextFiled.sendKeys("10");
		Thread.sleep(1000);
		categoryThumbnail.click();
		Thread.sleep(1000);
		createButton.click();



	}


	public void userstabclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		usersTab.click();

	}

	public void projectstabclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		usersTab.click();

	}


	public void settingstabclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		usersTab.click();

	}

	public void projectactionstabclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		projectactionsTab.click();

	}


	public void actionstabclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		actionsTab.click();

	}
	public void logout() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		prelogoutButton.click();
		Thread.sleep(1000);
		logoutButton.click();

	}

	public void projectstableftclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		projectsTab1.click();

	}


	public void dashboardtabclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		dashboardTab1.click();

	}


	public void campaignstabclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		campaignsTab1.click();

	}


	public void circlestabclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		circlesTab11.click();

	}


	public void gamificationtabclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		gamificationTab1.click();

	}

	public void projectthumbnailclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		projectsThumbnail.click();

	}

	public void projectlistingthumbnailclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		projectlistingThumbnail.click();

	}

	public void campaignhumbnailclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		campaignsThumbnail.click();

	}

	public void circleshumbnailclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		circlesThumbnail.click();

	}


	public void createproject() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{

		Thread.sleep(1000);
		ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
		Thread.sleep(1000);

		projectsThumbnail.click();
		createnewprojectButton.click();
		projectnametextField.sendKeys(ran+"Tiger Preservation");
		projectEditor.sendKeys("This project is for the preservation of tigers");

		globalcheckBox.click();
		actioncategorydropDown.click();
		actioncategorytextField.click();
		actioncategorytextField.sendKeys(Keys.ARROW_DOWN);
		actioncategorytextField.sendKeys(Keys.ARROW_DOWN);
		actioncategorytextField.sendKeys(Keys.ENTER);

		Thread.sleep(1000);

		actioncategory=actioncategorytextField.getAttribute("value");
		System.out.println(actioncategory);
		actiondropDown.click();
		actiondropdowntextField.click();
		actiondropdowntextField.sendKeys(Keys.ARROW_DOWN);
		actiondropdowntextField.sendKeys(Keys.ENTER);

		Thread.sleep(1000);

		actiontype=actiondropdowntextField.getAttribute("value");

		enableGamification.click();
		Thread.sleep(1000);
		pointstextField.clear();
		Thread.sleep(1000);
		pointstextField.sendKeys("10");
		Thread.sleep(1000);
		achievementdropDown.click();
		achievementsearchdropDown.click();
		achievementsearchdropDown.sendKeys(Keys.ARROW_DOWN);
		achievementsearchdropDown.sendKeys(Keys.ARROW_DOWN);
		achievementsearchdropDown.sendKeys(Keys.ENTER);
		achievementPoints.sendKeys("25");

		categorythumbnailFirst.click();
		createprojectButton.click();

	}

	public void projectactiontabclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		projectactionsTab.click();

	}

	public void activitylogtabclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		activitylogTab.click();

	}

	public void detailstabclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		detailsTab.click();

	}


	public void projectsearch() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		projectsTab1.click();
		projectssearchtextField.sendKeys(ran+"Tiger Preservation");
		projectssearchButton.click();

	}

	public void visitpagebuttonclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		visitpageButton.click();

	}

	public void editprojectbuttonclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		editprojectButton.click();

	}

	public void createnewcirclebuttonclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		createnewcircleButton.click();

	}

	public void imageupload() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, AWTException 


	{
		Thread.sleep(1000);
		newcircleimguploadButton.click();
		Thread.sleep(1000);
		newcircleimguploadButton.clear();
		Thread.sleep(1000);
		newcircleimguploadButton.sendKeys("C:\\Users\\binish\\Desktop\\employee_ben_new_web.jpg");

	}

	public void createcirclebuttonclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		createcircleButton.click();

	}

	public void createnewproejectbuttonclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		createnewprojectButton.click();

	}

	public void createprojectbuttonclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		createprojectButton.click();

	}


	public void createnewcampaignbuttonclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		createnewcampaignButton.click();

	}


	public void createcampaignbuttonclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		createcampaignButton.click();

	}


	public void circlecreation() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		circlesTab11.click();
		Thread.sleep(1000);
		createnewcircleButton.click();
		Thread.sleep(1000);
		circlenametextField.sendKeys(ran+"RIT Fans");
		Thread.sleep(1000);
		selectusertextFiled.sendKeys("Binish James");
		Thread.sleep(1000);
		selectusertextFiled.click();
		Thread.sleep(1000);
		selectusertextFiled.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		selectusertextFiled.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		circlenametextField.click();
		Thread.sleep(1000);
		createcircleButton.click();
		Thread.sleep(1000);
		circlesearchtextField.sendKeys(ran+"RIT Fans");
		Thread.sleep(1000);
		projectssearchButton.click();

	}


	public void circlesearchthumbnailclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		circlesearchThumbnail.click();

	}


	public void circlesvisitbuttonclick() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		circlesvisitButton.click();

	}

	public void createcampaign() throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 


	{
		Thread.sleep(1000);
		campaignsTab1.click();
		Thread.sleep(1000);
		createprojectButton.click();
		Thread.sleep(1000);
		campaignnametextField.sendKeys(ran+"Airbus A 380 Safety Measures");
		Thread.sleep(1000);
		selectprojectdropDown.click();
		Thread.sleep(1000);
		selectprojectdropDown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		selectprojectdropDown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		selectprojectdropDown.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		categoryThumbnail.click();
		Thread.sleep(1000);
		createcampaignButton.click();

	}












}