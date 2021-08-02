package tests;

import java.io.IOException;
import java.sql.SQLException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.ZindaPage;
import utils.CustomVerification;
import utils.ReadExcelCsv;
import utils.WebDriverConfig;

public class ZindaTest

{
	WebDriverConfig drvr = WebDriverConfig.getObject();
	WebDriver brsr = drvr.driver;
	ZindaPage obj = new ZindaPage();
	public static int kasd;


	CustomVerification customverification = new CustomVerification();

	public String asd;

	int commonNum;

	String actioncategoryfinal;

	String actiontypefinal;




	@Test(priority=1,dataProvider = "regCSVData", dataProviderClass = ReadExcelCsv.class)

	public void Zinda_admin_login_functionality_checking(ReadExcelCsv csv) throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		int kasd=obj.randomnumber();
		obj.login(csv.getUserName(),csv.getPassword());
		asd=brsr.findElement(By.xpath("/html/body/div[1]/div[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Dashboard"),"Sign in Successful");
		customverification.checkForVerificationErrors();


	}	


	@Test(priority=2,dataProvider = "regCSVData", dataProviderClass = ReadExcelCsv.class)

	public void Zinda_admin_Orgnaization_creation_checking(ReadExcelCsv csv) throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{


		obj.Organization_Creation();

		int num=ZindaPage.ran;

		commonNum=num;



	}	


	@Test(priority=3)

	public void Zinda_admin_organization_deatails_page_domain_name_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{


		asd=brsr.findElement(By.xpath("/html/body/form/div/div/div/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals(commonNum+"Prince@"+commonNum+".com"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}	

	@Test(priority=4)

	public void Zinda_admin_organization_deatails_page_country_name_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{


		asd=brsr.findElement(By.xpath("/html/body/form/div/div/div/div[3]/div[1]/div[1]/div[4]/div[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("US"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}	

	@Test(priority=5)

	public void Zinda_admin_organization_deatails_page_number_of_users_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{


		asd=brsr.findElement(By.xpath("/html/body/form/div/div/div/div[3]/div[1]/div[3]/div[1]/span[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("1"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}	


	@Test(priority=6)

	public void Zinda_admin_organization_deatails_page_number_of_projects_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{


		asd=brsr.findElement(By.xpath("/html/body/form/div/div/div/div[3]/div[1]/div[3]/div[2]/span[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("0"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}	


	@Test(priority=7)

	public void Zinda_admin_organization_deatails_page_description_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{


		asd=brsr.findElement(By.xpath("/html/body/form/div/div/div/div[3]/div[2]/div[1]/div[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("No description added yet. Click on edit to add."),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}	


	@Test(priority=8)

	public void Zinda_admin_organization_deatails_page_categories_label_exist_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{


		asd=brsr.findElement(By.xpath("/html/body/form/div/div/div/div[3]/div[2]/div[2]/label")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Categories:"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}	

	@Test(priority=9)

	public void Zinda_admin_organization_deatails_page_users_tab_functionality_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		obj.userstabclick();
		Thread.sleep(2000);
		asd=brsr.findElement(By.xpath("/html/body/form/div/div/div/div[4]/div/div/div/div[1]/div/table/thead/tr/th[3]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Status"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}	

	@Test(priority=10)

	public void Zinda_admin_organization_deatails_page_users_status_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/form/div/div/div/div[4]/div/div/div/div[1]/div/table/tbody/tr/td[3]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Active"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}	


	@Test(priority=12)

	public void Zinda_admin_organization_deatails_page_settings_tab_functionality_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/form/div/div/div/div[4]/div/div/div/div[1]/div/div[1]/span[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Show"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}	




	@Test(priority=13)

	public void Zinda_admin_organization_action_tab_functionality_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		obj.actionstabclick();
		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div[1]/div[1]/div")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Actions"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}	


	@Test(priority=14)

	public void Zinda_admin_organization_actions_action_category_name_label_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[2]/label")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Action category name:"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}	

	@Test(priority=15)

	public void Zinda_admin_organization_actions_action_label_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[3]/div/div[1]/label")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Action:"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}	

	@Test(priority=16)

	public void Zinda_admin_logout_functionality_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		obj.logout();
		asd=brsr.findElement(By.xpath("/html/body/div/div/div[2]/div/div/form/fieldset/div[2]/i")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Sign in to your zJourney account"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}	

	
	

	@Test(priority=17,dataProvider = "regCSVData", dataProviderClass = ReadExcelCsv.class)

	public void Org_admin_login_functionality_checking(ReadExcelCsv csv) throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{
		obj.login(csv.getOrguserName(),csv.getOrgPassword());
		asd=brsr.findElement(By.xpath("/html/body/div/nav/div[2]/div/div[2]/ul/li[9]/a/span/span[1]/b")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Prince Admin"),"Sign in Successful");
		customverification.checkForVerificationErrors();


	}	
	
	

	@Test(priority=18)

	public void Org_admin_projects_thumbnail_click_functionality_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		obj.projectthumbnailclick();
		asd=brsr.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/a/button")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Create New Project"),"Sign in Successful");
		customverification.checkForVerificationErrors();
		obj.dashboardtabclick();

	}


	@Test(priority=19)

	public void Org_admin_campaigns_thumbnail_click_functionality_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		obj.campaignhumbnailclick();
		asd=brsr.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/a/button")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Create New Campaign"),"Sign in Successful");
		customverification.checkForVerificationErrors();
		obj.dashboardtabclick();


	}

		

	@Test(priority=20)

	public void Org_admin_circles_thumbnail_click_functionality_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		obj.circleshumbnailclick();
		asd=brsr.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div/div[2]/a/button")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Create New Circle"),"Sign in Successful");
		customverification.checkForVerificationErrors();
		obj.dashboardtabclick();


	}

	@Test(priority=21)

	public void Org_admin_projects_thumbnail_my_projects_label_exist_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		asd=brsr.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/span[2]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("My Projects"),"Sign in Successful");
		customverification.checkForVerificationErrors();
		obj.dashboardtabclick();


	}

	@Test(priority=23)

	public void Org_admin_campaigns_thumbnail_my_campaigns_label_exist_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		asd=brsr.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div[2]/div/div[2]/div[1]/span[2]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("My Campaigns"),"Sign in Successful");
		customverification.checkForVerificationErrors();
		obj.dashboardtabclick();

	}

	@Test(priority=24)

	public void Org_admin_circles_thumbnail_my_circles_label_exist_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		asd=brsr.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div[3]/div/div[2]/div[1]/span[2]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("My Circles"),"Sign in Successful");
		customverification.checkForVerificationErrors();
		obj.dashboardtabclick();

	}

	@Test(priority=25)

	public void Org_admin_projects_tab_navigation_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		obj.projectstableftclick();
		asd=brsr.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/a/button")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Create New Project"),"Sign in Successful");
		customverification.checkForVerificationErrors();
		obj.dashboardtabclick();

	}

	
/*	
	
	
	
	@Test(priority=26)

	public void Org_admin_dashboard_tab_navigation_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		obj.dashboardtabclick();
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Dashboard"),"Sign in Successful");
		customverification.checkForVerificationErrors();
		obj.dashboardtabclick();

	}

	@Test(priority=27)

	public void Org_admin_campaigns_tab_navigation_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		obj.campaignstabclick();
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/a/button")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Create New Campaign"),"Sign in Successful");
		customverification.checkForVerificationErrors();
		obj.dashboardtabclick();

	}


	@Test(priority=28)

	public void Org_admin_circles_tab_navigation_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		obj.circlestabclick();
		asd=brsr.findElement(By.xpath("/html/body/div/div/div/div[1]/a/button")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Create New Circle"),"Sign in Successful");
		customverification.checkForVerificationErrors();
		obj.dashboardtabclick();

	}

	@Test(priority=29)

	public void Org_admin_gamification_tab_navigation_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		obj.gamificationtabclick();
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Gamification"),"Sign in Successful");
		customverification.checkForVerificationErrors();
		obj.dashboardtabclick();

	}


	@Test(priority=30)

	public void Org_admin_founding_admin_lebel_exist_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		obj.dashboardtabclick();
		asd=brsr.findElement(By.xpath("/html/body/nav/div/div[2]/div[2]/span")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Founding Admin"),"Sign in Successful");
		customverification.checkForVerificationErrors();
		obj.dashboardtabclick();

	}




	@Test(priority=31)

	public void Org_admin_project_creation_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(2000);
		obj.createproject();
		Thread.sleep(1000);

		String actioncategorylatest=ZindaPage.actioncategory;
		String actiontypelatest=ZindaPage.actiontype;

		actioncategoryfinal=actioncategorylatest;
		actiontypefinal=actiontypelatest;


		System.out.println("__________"+actioncategoryfinal);
		System.out.println("___________"+actiontypefinal);


		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Project Details"),"Sign in Successful");
		customverification.checkForVerificationErrors();



	}



	@Test(priority=32)

	public void Org_admin_new_project_name_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[4]/div/div[2]/div[1]/span[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals(commonNum+"Tiger Preservation"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=33)

	public void Org_admin_new_project_category_label_exist__checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[4]/div/div[1]/div/div")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Categories"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}


	@Test(priority=34)

	public void Org_admin_new_project_category_name_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[4]/div/div[1]/div/span/span")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Education"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}


	@Test(priority=35)

	public void Org_admin_new_project_edit_project_button_exist_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/a/button")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Edit Project"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}





	@Test(priority=36)

	public void Org_admin_new_project_action_tab_navigation_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		obj.projectactiontabclick();
		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[4]/div/div[2]/div[2]/div[2]/div/span")).getText();
		System.out.println(asd);
		System.out.println("----------"+actioncategoryfinal);
		customverification.verifyTrue(asd.equals(actioncategoryfinal),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=37)

	public void Org_admin_new_project_action_tab_action_category_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[4]/div/div[2]/div[2]/div[2]/div/div/span")).getText();
		System.out.println(asd);
		Thread.sleep(1000);
		customverification.verifyTrue(asd.equals(actioncategoryfinal),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}


	@Test(priority=39)

	public void Org_admin_new_project_action_tab_points_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[4]/div/div[2]/div[2]/div[2]/div/div/div[2]/div[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("10 Points"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}




	@Test(priority=40)

	public void Org_admin_new_project_action_tab_achievement_count_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/div[2]/div[2]/div[2]/div/div[2]/span/span[2]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("( > 25 times)"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=41)

	public void Org_admin_new_project_action_tab_achievement_type_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/div[2]/div[2]/div[2]/div/div[2]/span/span[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Master"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=42)

	public void Org_admin_new_project_activitylog_tab_navigation_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		obj.activitylogtabclick();
		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/div[2]/div[2]/div[3]/div")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("There are no actions logged"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=43)

	public void Org_admin_new_project_datails_tab_navigation_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		obj.detailstabclick();
		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/div[2]/div[2]/div[1]/div")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("This project is for the preservation of tigers"),"Sign in Successful");
		customverification.checkForVerificationErrors();
		obj.projectstableftclick();

	}

	@Test(priority=44)

	public void Org_admin_project_search_functionality_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		obj.projectsearch();
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/ul/li[1]/a/span[2]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals(commonNum+"Tiger Preservation"),"Sign in Successful");
		customverification.checkForVerificationErrors();


	}


	@Test(priority=45)

	public void Org_admin_projects_preview_project_category_label_exist_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		obj.projectlistingthumbnailclick();
		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/ul/li[1]/div/div/div[3]/div/div")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Project Category"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=46)

	public void Org_admin_projects_preview_project_category_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/ul/li[1]/div/div/div[3]/div/span/span")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Education"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=47)

	public void Org_admin_projects_preview_project_description_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/ul/li[1]/div/div/div[3]/p")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("This project is for the preservation of tigers"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=48)

	public void Org_admin_projects_preview_visit_page_button_navigation_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		obj.visitpagebuttonclick();
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Project Details"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=49)

	public void Org_admin_projects_details_page_name_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/div[2]/div[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals(commonNum+"Tiger Preservation"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=50)

	public void Org_admin_projects_details_page_categories_label_exist_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/div[1]/div/div")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Categories"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=51)

	public void Org_admin_projects_details_page_category_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/div[1]/div/span/span")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Education"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=52)

	public void Org_admin_projects_details_page_project_deatils_label_exist_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Project Details"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=53)

	public void Org_admin_projects_details_page_actions_tab_navifgation_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		obj.projectactionstabclick();
		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/div[2]/div[2]/div[2]/div/span[3]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Costing"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}


	@Test(priority=54)

	public void Org_admin_projects_details_page_actions_tab_action_name_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/div[2]/div[2]/div[2]/div/span[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Cost reduction 512"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=55)

	public void Org_admin_projects_details_page_actions_tab_points_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/div[2]/div[2]/div[2]/div/span[2]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("10 points"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=56)

	public void Org_admin_projects_details_page_actions_tab_action_category_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/div[2]/div[2]/div[2]/div/span[3]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Costing"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=57)

	public void Org_admin_projects_details_page_actions_tab_achievement_name_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/div[2]/div[2]/div[2]/div/div[2]/span/span[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Master"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=58)

	public void Org_admin_projects_details_page_actions_tab_achievement_points_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/div[2]/div[2]/div[2]/div/div[2]/span/span[2]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("( > 25 times)"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}


	@Test(priority=59)

	public void Org_admin_projects_details_page_activitylog_tab_navigation_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		obj.activitylogtabclick();
		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/div[2]/div[2]/div[3]/div")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("There are no actions logged"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=60)

	public void Org_admin_projects_details_page_edit_project_button_functionality_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		obj.editprojectbuttonclick();
		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Edit Project"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=61)

	public void Org_admin_circles_create_new_circle_button_navigation_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		obj.dashboardtabclick();
		obj.circleshumbnailclick();
		obj.createnewcirclebuttonclick();
		asd=brsr.findElement(By.xpath("/html/body/div/div/div/div")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Create Circle"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=62)

	public void Org_admin_circles_create_new_circle_enter_circle_name_label_exist_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div/div/form/div/div[1]/div[1]/div/label")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Enter Circle Name :"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=63)

	public void Org_admin_circles_create_new_circle_select_users_label_exist_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div/div/form/div/div[1]/div[2]/label")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Select Users :"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=64)

	public void Org_admin_crcles_circle_name_requires_validation_message_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		obj.createcirclebuttonclick();
		asd=brsr.findElement(By.xpath("/html/body/div/div/div/form/div/div[1]/div[1]/div/small[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Circle name is required"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=65)

	public void Org_admin_crcles_circle_select_user_validation_message_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div/div/form/div/div[1]/div[2]/small")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Select a user"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=66)

	public void Org_admin_projects_project_name_required_validation_message_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		obj.projectstableftclick();
		obj.createnewproejectbuttonclick();
		obj.createprojectbuttonclick();
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div/div/small[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Project name is required"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=67)

	public void Org_admin_projects_action_category_required_validation_message_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[4]/div/div/div[1]/div/div/div[2]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Action category is required"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}


	@Test(priority=68)

	public void Org_admin_projects_action_required_validation_message_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[4]/div/div/div[2]/div[1]/div/div[2]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Action is required"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=69)

	public void Org_admin_projects_category_required_validation_message_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[5]/div[1]/small")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Category is required"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}


	@Test(priority=70)

	public void Org_admin_campaigns_campaign_name_required_validation_message_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		obj.campaignstabclick();
		obj.createnewcampaignbuttonclick();
		obj.createcampaignbuttonclick();
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[1]/div/small[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Campaign name is required"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=71)

	public void Org_admin_campaigns_select_project_validation_message_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div/div[2]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Select a project"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=72)

	public void Org_admin_campaigns_category_required_validation_message_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[4]/div[1]/small")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Category is required"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=73)

	public void Org_admin_circles_new_circle_creation_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		obj.circlecreation();
		asd=brsr.findElement(By.xpath("/html/body/div/div/div/ul/li[1]/span[3]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals(commonNum+"RIT Fans"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=74)

	public void Org_admin_circles_preview_name_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		obj.circlesearchthumbnailclick();
		Thread.sleep(1000);

	}

	@Test(priority=75)

	public void Org_admin_circles_preview_users_label_exist_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div/div/ul/div/div/div[2]/div/div[3]/div[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Users"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=76)

	public void Org_admin_circles_preview_user_name_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.id("cuser-name")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Binish James"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=77)

	public void Org_admin_circles_preview_visit_page_navigation_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		obj.circlesvisitbuttonclick();
		asd=brsr.findElement(By.xpath("/html/body/div/div/div/div[1]/div")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Circle Details"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=78)

	public void Org_admin_circles_details_circle_name_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[1]")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals(commonNum+"RIT Fans"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=79)

	public void Org_admin_circles_details_user_name_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.id("cuser-name")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Binish James"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	@Test(priority=80)

	public void Org_admin_circles_details_circle_deatils_label_exist_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException

	{

		Thread.sleep(1000);
		asd=brsr.findElement(By.xpath("/html/body/div/div/div/div[1]/div")).getText();
		System.out.println(asd);
		customverification.verifyTrue(asd.equals("Circle Details"),"Sign in Successful");
		customverification.checkForVerificationErrors();

	}

	//	@Test(priority=81)
	//
	//	public void Org_admin_campaigns_create_campaign_functionality_checking() throws InterruptedException, BiffException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	//
	//	{
	//
	//		Thread.sleep(1000);
	//		obj.createcampaign();
	//		asd=brsr.findElement(By.xpath("/html/body/div/div[1]/div/div[1]")).getText();
	//		System.out.println(asd);
	//		customverification.verifyTrue(asd.equals("Campaign Details"),"Sign in Successful");
	//		customverification.checkForVerificationErrors();
	//
	//	}





	 */



}


