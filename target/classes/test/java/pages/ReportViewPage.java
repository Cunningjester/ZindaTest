	package pages;

	import java.util.ArrayList;
	import java.util.List;

	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	import config.TestConfig;
	public class ReportViewPage {
		WebDriver driver;

		public ReportViewPage() {
			this.driver = TestConfig.getDriver();
			PageFactory.initElements(driver, this);
		}

		/*@FindBy(id = "reportFrame")
		private WebElement reportFrame;

		@FindBy(id = "ReportViewer1_ctl04_ctl03_ddDropDownButton")
		private WebElement startDate;
		@FindBy(id = "ReportViewer1_ctl04_ctl03_txtValue")
		private WebElement startDateField;
		@FindBy(id = "ReportViewer1_ctl04_ctl05_ddDropDownButton")
		private WebElement endDate;
		@FindBy(id = "ReportViewer1_ctl04_ctl05_txtValue")
		private WebElement endDateField;
		@FindBy(id = "ReportViewer1_ctl04_ctl00")
		private WebElement viewReportBtn;
		@FindBy(id = "ReportViewer1_ctl04_ctl07_ddValue")
		private WebElement planId;

		@FindBy(id = "ReportViewer1_ctl04_ctl09_ddValue")
		private WebElement outputType;

		@FindBy(id = "ReportViewer1_ctl04_ctl09_ddValue")
		private WebElement reportType;
		
		@FindBy(id = "ReportViewer1_ctl04_ctl11_ddValue")
		private WebElement TocType;
		
		@FindBy(id = "ReportViewer1_ctl04_ctl11_ddValue")
		private WebElement ReportingPackage;

		@FindBy(id = "ReportViewer1_ctl04_ctl05_ctl01")
		private WebElement endDateFrame;

		@FindBy(id = "ReportViewer1_ctl04_ctl03_ctl01")
		private WebElement startDateFrame;*/

		@FindBy(id = "ReportViewer1_ctl09")
		private WebElement resultContainer;

		/*@FindBy(xpath = "//div[contains(.,'Contributions and Forfeitures Transactions')]")
		private WebElement reportTitle;
	*/
		@FindBy(id = "ReportViewer1_AsyncWait_Wait")
		private WebElement asyncWait;

		private List<String> reportTexts = new ArrayList<String>();
		@FindBy(id = "ReportViewer1_ctl05_ctl00_TotalPages")
		private WebElement totalPage;
		@FindBy(xpath = "//input[@id='ReportViewer1_ctl05_ctl00_Next_ctl01_ctl00']")
		private WebElement nextPage;
		@FindBy(id = "ReportViewer1_ctl05_ctl00_CurrentPage")
		private WebElement page;
		// ReportViewer1$ctl05$ctl00$CurrentPage
		// ReportViewer1_ctl05_ctl00_CurrentPage

		@FindBy(id = "ReportViewer1_ctl05_ctl00_First_ctl00_ctl00")
		private WebElement firstPage;
		@FindBy(id = "ReportViewer1_ctl05_ctl04_ctl00_ButtonImg")
		private WebElement downloadButton;
		@FindBy(xpath = "//a[@alt='PDF']")
		private WebElement pdfButton;
		@FindBy(xpath = "//a[@alt='Excel']")
		private WebElement excelButton;

		public WebElement getDownloadButton() {
			return downloadButton;
		}

		public void setDownloadButton(WebElement downloadButton) {
			this.downloadButton = downloadButton;
		}

		public WebElement getPdfButton() {
			return pdfButton;
		}

		public void setPdfButton(WebElement pdfButton) {
			this.pdfButton = pdfButton;
		}

		public WebElement getExcelButton() {
			return excelButton;
		}

		public void setExcelButton(WebElement excelButton) {
			this.excelButton = excelButton;
		}

		/*public WebElement getReportFrame() {
			return reportFrame;
		}

		public WebElement getStartDate() {
			return startDate;
		}

		public WebElement getEndDate() {
			return endDate;
		}

		public WebElement getStartDateField() {
			return startDateField;
		}

		public void setStartDateField(WebElement startDateField) {
			this.startDateField = startDateField;
		}

		public WebElement getEndDateField() {
			return endDateField;
		}

		public void setEndDateField(WebElement endDateField) {
			this.endDateField = endDateField;
		}

		public WebElement getReportTitle() {
			return reportTitle;
		}

		public void setReportTitle(WebElement reportTitle) {
			this.reportTitle = reportTitle;
		}

		public WebElement getViewReportBtn() {
			return viewReportBtn;
		}

		public WebElement getPlanId() {
			return planId;
		}

		// public WebElement getOutputType() {
		// return outputType;
		// }

		public WebElement getEndDateFrame() {
			return endDateFrame;
		}

		public void setEndDateFrame(WebElement endDateFrame) {
			this.endDateFrame = endDateFrame;
		}

		public WebElement getStartDateFrame() {
			return startDateFrame;
		}

		public void setStartDateFrame(WebElement startDateFrame) {
			this.startDateFrame = startDateFrame;
		}*/

		public WebElement getResultContainer() {
			return resultContainer;
		}

		/*public WebElement getTotalPage() {
			return totalPage;
		}

		public void setTotalPage(WebElement totalPage) {
			this.totalPage = totalPage;
		}

		public WebElement getNextPage() {
			return nextPage;
		}

		public void setNextPage(WebElement nextPage) {
			this.nextPage = nextPage;
		}

		public WebElement getPage() {
			return page;
		}

		public void setPage(WebElement page) {
			this.page = page;
		}

		public WebElement getFirstPage() {
			return firstPage;
		}

		public void setFirstPage(WebElement firstPage) {
			this.firstPage = firstPage;
		}*/

		public WebDriver getDriver() {
			return driver;
		}

		public WebElement getAsyncWait() {
			return asyncWait;
		}

		public List<String> getReportTexts() {
			return reportTexts;
		}

		public void setResultContainer(WebElement resultContainer) {
			this.resultContainer = resultContainer;
		}

	/*	public void moveToReportFrame() {
			driver.switchTo().frame(reportFrame);
		}

		public void selectStartDate(String date) {

			getStartDateField().sendKeys(date);
		}

		public void selectEndDate(String date) {

			getEndDateField().sendKeys(date);

		}

		public void selectPlanId(String index) {

			new Select(planId).selectByValue(index);

		}

		public void selectoutputType(String index) {

			new Select(outputType).selectByValue(index);

		}

		public void selectreportType(String index) {

			new Select(reportType).selectByValue(index);

		}
		
		public void selectTocType(String index) {

			new Select(TocType).selectByValue(index);

		}
		
		public void selectReportingPackage(String index) {

			new Select(ReportingPackage).selectByValue(index);

		}
		
		*/

		public void waitTillLoading(int seconds) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			for (int i = 0; i < seconds; i++) {
				String display = asyncWait.getCssValue("display");
				System.out.println(display);
				if (display.equalsIgnoreCase("block")) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					break;
				}
			}

		}
		public boolean textExistsInReport(String text)
	    {
	        boolean found=false;
	        if(TestConfig.reportTexts.size()==0)
	    {
	        Integer totalPages=Integer.parseInt(totalPage.getText());
	        for (int i = 0; i < totalPages; i++) {
	            String pageNo=Integer.toString(i+1);
	            page.clear();
	            page.sendKeys(pageNo);
	            page.sendKeys(Keys.ENTER);
	            waitTillLoading(60);
	            TestConfig.reportTexts.add( getResultContainer().getText());

	        }

	        page.clear();
	        page.sendKeys("1");
	        page.sendKeys(Keys.ENTER);
	        waitTillLoading(60);

	    }
	    for (String textInEachPage : TestConfig.reportTexts) {
	        System.out.println(textInEachPage);
	        System.out.println("--------------------------");
	        if(textInEachPage.contains(text.trim())){
	            found= true;
	            break;
	        }

	    }
	    return found;
	    }


		/*public void gotoPage(int num) {
			String pageNo = Integer.toString(num);
			if (!page.getAttribute("value").equals(pageNo)) {
				page.clear();
				page.sendKeys(pageNo);
				page.sendKeys(Keys.ENTER);
				waitTillLoading(120);
			}

		}*/
	}


