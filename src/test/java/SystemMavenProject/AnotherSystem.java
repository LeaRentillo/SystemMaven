package SystemMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AnotherSystem {
	   public  WebDriver driver;
	   public  WebDriverWait wait;
	   public static String sysUser = "iannis@iscale-solutions.com";
	   public static String sysPass = "@nQr6n6TdnQr6n6Td\n";


@Test (priority = 1, alwaysRun = true)
public void Login() {
			
		//** FOR FIREFOX BROWSER **//
		   //driver = new firefoxDriver();
		//********************************** //	 
			
		//** FOR CHROME BROWSER ** //
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Documents\\LEA\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		   driver = new ChromeDriver();
		//**********************************//	   
	   
		   wait = new WebDriverWait(driver, 20);
		   	   
		   driver.manage().window().maximize();
		   driver.get("https://dev.system.an-other.co.uk/");

			   
		   WebElement Username = driver.findElement(By.xpath("//*[@id=\"loginform-login\"]"));
		   Username.sendKeys(sysUser);
		   WebElement Password = driver.findElement(By.xpath("//*[@id=\"loginform-password\"]"));
		   Password.sendKeys(sysPass);
		   
		   WebElement SysIn = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
		   SysIn.click();
			   
		  
		  WebElement dashboard = new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"p0\"]")));
		  Assert.assertTrue(dashboard.isDisplayed());
				
  }
@Test (priority = 2, alwaysRun = true)
public void Finance() {

//BALANCES	
	WebElement Finance = driver.findElement(By.cssSelector("a[class='dropdown-toggle']"));
	Finance.click();
	
	WebElement Balances = driver.findElement(By.xpath("//a[contains(text(),'Ledger Balances')]"));
	Balances.click();
	

	
	// Check Pagination//
	
	
	//Export//
	Actions  action = new Actions(driver);
	
	try {
		WebElement ClearExportButton = driver.findElement(By.xpath("//button[@id='w1']"));
		action.moveToElement(ClearExportButton).click().perform();

		}
	catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
		WebElement ClearExportButton = driver.findElement(By.xpath("//button[@id='w1']"));
		action.moveToElement(ClearExportButton).click().perform();
		}	    
	
	try {
		WebElement ClearsaveCSV = driver.findElement(By.xpath("//a[@class='export-csv']"));
		action.moveToElement(ClearsaveCSV).click().perform();
		}
	catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
		WebElement ClearsaveCSV = driver.findElement(By.xpath("//a[@class='export-csv']"));
		action.moveToElement(ClearsaveCSV).click().perform();
		}
		
		
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
	WebElement saveCSVButton =  driver.findElement(By.xpath("//button[contains(text(),' Ok')]"));
	action.moveToElement(saveCSVButton).click().perform();
	
	
	//PDF 	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
	driver.navigate().refresh();
	
    try {
    	WebElement ExportButton = driver.findElement(By.id("w1"));
    	action.moveToElement(ExportButton).click().perform();

    	}
    catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
    	WebElement ExportButton = driver.findElement(By.id("w1"));
    	action.moveToElement(ExportButton).click().perform();
		}	

	try {
		WebElement saveCSV = driver.findElement(By.xpath("//a[@class='export-pdf']"));
		action.moveToElement(saveCSV).click().perform();
	}
	catch(org.openqa.selenium.StaleElementReferenceException ex)
	{
		WebElement saveCSV = driver.findElement(By.xpath("//a[@class='export-pdf']"));
		action.moveToElement(saveCSV).click().perform();
	}

	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
	WebElement csvButton =  driver.findElement(By.xpath("//button[contains(text(),' Ok')]"));
	action.moveToElement(csvButton).click().perform();
	
	//Showing All Data
	driver.navigate().refresh();
	
	try {
		WebElement ShowData = driver.findElement(By.xpath("//a[@id='legder-balance-togdata-page']"));
		ShowData.click();
	}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
	{
		WebElement ShowData = driver.findElement(By.xpath("//a[@id='legder-balance-togdata-page']"));
		ShowData.click();
	}
	
	try {
		WebElement pagination = driver.findElement(By.xpath("//div[@class='kv-panel-pager']"));
		Assert.assertTrue(pagination.isDisplayed());
	}
	catch(org.openqa.selenium.StaleElementReferenceException ex)
	{
		WebElement pagination = driver.findElement(By.xpath("//div[@class='kv-panel-pager']"));
		Assert.assertTrue(pagination.isDisplayed());
	}
	
	//PAGINATION
	driver.navigate().refresh();
	
//CLEARING
	WebElement Finance1 = driver.findElement(By.cssSelector("a[class='dropdown-toggle']"));
	Finance1.click();
	
	WebElement Clearing = driver.findElement(By.xpath("//a[contains(text(),'Prefund Clearing')]"));
	Clearing.click();
	
	WebElement ClearDate = driver.findElement(By.xpath("//div[@id='ledgersearch-date_created-container']"));
	ClearDate.click();
	
	WebElement ClearDate30days = driver.findElement(By.xpath("//li[contains(text(),'Last 30 Days')]"));
	ClearDate30days.click();
	
	//EXPORT
	try {
	    WebElement ClearExportButton = driver.findElement(By.xpath("//button[@id='w1']"));
	    action.moveToElement(ClearExportButton).click().perform();

	    }
	catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
	    WebElement ClearExportButton = driver.findElement(By.xpath("//button[@id='w1']"));
	    action.moveToElement(ClearExportButton).click().perform();
		}	    
	    
	try {
		WebElement ClearsaveCSV = driver.findElement(By.xpath("//a[@class='export-csv']"));
		action.moveToElement(ClearsaveCSV).click().perform();
		}
	catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
		WebElement ClearsaveCSV = driver.findElement(By.xpath("//a[@class='export-csv']"));
		action.moveToElement(ClearsaveCSV).click().perform();
		}
		
		
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
	WebElement pdfbutton1 =  driver.findElement(By.xpath("//button[contains(text(),' Ok')]"));
	action.moveToElement(pdfbutton1).click().perform();
		
		
		
	//PDF 	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
	driver.navigate().refresh();
		
	try {
	    WebElement ClearExportButton1 = driver.findElement(By.id("w1"));
	    action.moveToElement(ClearExportButton1).click().perform();

	    }
	catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
	    WebElement ClearExportButton1 = driver.findElement(By.id("w1"));
	    action.moveToElement(ClearExportButton1).click().perform();
		}	

	try {
		WebElement ClearsaveCSV = driver.findElement(By.xpath("//a[@class='export-pdf']"));
		action.moveToElement(ClearsaveCSV).click().perform();
		}
	catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
		WebElement ClearsaveCSV = driver.findElement(By.xpath("//a[@class='export-pdf']"));
		action.moveToElement(ClearsaveCSV).click().perform();
		}

	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
	WebElement pdfButton1 =  driver.findElement(By.xpath("//button[contains(text(),' Ok')]"));
	action.moveToElement(pdfButton1).click().perform();
	
	//Show All Data
	driver.navigate().refresh();
		
	try {
		WebElement ShowData = driver.findElement(By.xpath("//a[@id='clearing-table-togdata-page']"));
		ShowData.click();
		}
	catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
		WebElement ShowData = driver.findElement(By.xpath("//a[@id='clearing-table-togdata-page']"));
		ShowData.click();
		}
		
	try {
		WebElement pagination = driver.findElement(By.xpath("//div[@class='kv-panel-pager']"));
		Assert.assertTrue(pagination.isDisplayed());
		}
	catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
		WebElement pagination = driver.findElement(By.xpath("//div[@class='kv-panel-pager']"));
		Assert.assertTrue(pagination.isDisplayed());
		}
		//PAGINATION
		driver.navigate().refresh();

//ADJUSTMENT
	WebElement Finance2 = driver.findElement(By.cssSelector("a[class='dropdown-toggle']"));
	Finance2.click();
		
	WebElement Adjustment = driver.findElement(By.xpath("//a[contains(text(),'Ledger Adjustments')]"));
	Adjustment.click();
		
		//Continue for validation
		
		
  }
@Test (priority = 3, alwaysRun = true)
public void Programs() {
	String pname = "QATestProgram";
	String cname = "iScale Solutions";
	String add1 = " 7th flr. salaustino Bldg";
	String add2 = "Perea st. corner paseo st.";
	String city = "Makati City";
	String state = "Manila";
	String zip = "1630";
	String id = "100002";
	String program = "Global Sourcing Solutions";
	
			
//EDIT PROGRAMS	
	
	WebElement aProgram = driver.findElement(By.xpath("//*[@id=\"w3\"]/li[3]/a"));
	aProgram.click();
	
	WebElement EditProgram = driver.findElement(By.xpath("//*[@id=\"w5\"]/li[1]/a"));
	EditProgram.click();

	WebElement pTable = driver.findElement(By.xpath("//table[@class='table table-striped table-bordered']"));
	Assert.assertTrue(pTable.isDisplayed());
	
	
	WebElement CreateProgram = driver.findElement(By.xpath("//a[@class='btn btn-success']"));
	CreateProgram.click();
	
	WebElement ProgramName = driver.findElement(By.xpath("//input[@id='program-program_name']"));
	ProgramName.sendKeys(pname);
	
	WebElement CompanyName = driver.findElement(By.xpath("//input[@id='program-company_name']"));
	CompanyName.sendKeys(cname);
	
	WebElement Address1 = driver.findElement(By.xpath("//input[@id='program-address1']"));
	Address1.sendKeys(add1);
	
	WebElement Address2 = driver.findElement(By.xpath("//input[@id='program-address2']"));
	Address2.sendKeys(add2);
	
	WebElement City = driver.findElement(By.xpath("//input[@id='program-city']"));
	City.sendKeys(city);
	
	WebElement State = driver.findElement(By.xpath("//input[@id='program-state']"));
	State.sendKeys(state);
	
	WebElement Zip = driver.findElement(By.xpath("//input[@id='program-zip']"));
	Zip.sendKeys(zip);
	
	Select selectCountry = new Select(driver.findElement(By.id("program-country_code")));
	selectCountry.selectByVisibleText("Philippines");
	
	Select selectStatus =  new Select(driver.findElement(By.id("program-status")));
	selectStatus.selectByVisibleText("Active");
	
	Select selectCurrency =  new Select(driver.findElement(By.id("program-cardcurrency")));
	selectCurrency.selectByVisibleText("GBP");
	
	Select selectProduct =  new Select(driver.findElement(By.id("program-product_id")));
	selectProduct.selectByIndex(1);
	
	Select selectTariff =  new Select(driver.findElement(By.id("program-tariff")));
	selectTariff.selectByIndex(2);
	
	WebElement EnableRegistration = driver.findElement(By.xpath("//input[@id='program-enable_registration']"));
	EnableRegistration.click();
	
	/*WebElement Create = driver.findElement(By.xpath("//button[contains(text(),'Create')]"));
	Create.click();
	
	WebElement Update = driver.findElement(By.xpath("//a[contains(text(),'Update')]"));
	Update.click();*/
	
	driver.navigate().back();
	
	WebElement ID = driver.findElement(By.xpath("//input[@name='ProgramSearch[id]']"));
	ID.sendKeys(id);
	ID.sendKeys(Keys.ENTER);
	
	ID.clear();
	ID.sendKeys(Keys.ENTER);
		
	WebElement progProgramName = driver.findElement(By.xpath("//input[@name='ProgramSearch[program_name]']"));
	progProgramName.sendKeys(program);
	progProgramName.sendKeys(Keys.ENTER);	
	progProgramName.clear();
	progProgramName.sendKeys(Keys.ENTER);
	
	Select ProductSelect = new Select(driver.findElement(By.name("ProgramSearch[product_id]")));
	ProductSelect.selectByIndex(1);
		
	Select StatusSelect = new Select(driver.findElement(By.name("ProgramSearch[status]")));
	StatusSelect.selectByIndex(1);
	
	WebElement View = driver.findElement(By.xpath("//a[@title='View']"));
	View.click();
	
	WebElement ViewTable = driver.findElement(By.xpath("//table[@id='w0']"));
	Assert.assertTrue(ViewTable.isDisplayed());
	
	driver.navigate().back();
	
	WebElement ProgramUpdate = driver.findElement(By.xpath("//a[@title='Update']"));
	ProgramUpdate.click();
	
	//WebElement UpdateForm = driver.findElement(By.xpath("//form[@id='w0']"));
	//Assert.assertTrue(UpdateForm.isDisplayed());
	
	driver.navigate().back();
}
@Test (priority = 4, alwaysRun = true)
public void LoadFees() {
	String minAmount = "1";
	String maxAmount = "10";
	String loadFee = "2";
	String loadPercent = "2";
	
	
	WebElement ProgramLoadFees = driver.findElement(By.xpath("//*[@id=\"w1\"]/li[3]/a"));
	ProgramLoadFees.click();
	
	
	WebElement EditLoadFees = driver.findElement(By.xpath("//*[@id=\"w3\"]/li[2]"));
	EditLoadFees.click();
	
	WebElement EditFeeTable = driver.findElement(By.xpath("//*[@id=\"w0\"]/table/tbody/tr[1]/td[2]/a"));
	EditFeeTable.click();
	
	WebElement addPreset = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/p/a"));
	addPreset.click();
	
	WebElement MinAmount = driver.findElement(By.xpath("//input[@id='fee-min_load_value']"));
	MinAmount.sendKeys(minAmount);
			
	WebElement MaxAmount = driver.findElement(By.xpath("//input[@id='fee-max_load_value']"));
	MaxAmount.sendKeys(maxAmount);
	
	WebElement LoadFee = driver.findElement(By.xpath("//input[@id='fee-amount']"));
	LoadFee.sendKeys(loadFee);
	
	WebElement LoadPercentage = driver.findElement(By.xpath("//input[@id='fee-load_fee_percentage']"));
	LoadPercentage.sendKeys(loadPercent);
	
	//WebElement Create = driver.findElement(By.xpath("//button[contains(text(),'Create')]"));
	//Create.click();		
	
/*	driver.navigate().back();
	
	WebElement View = driver.findElement(By.xpath("//a[@title='View']"));
	View.click();
	
	WebElement ViewTable = driver.findElement(By.xpath("//table[@id='w0']"));
	Assert.assertTrue(ViewTable.isDisplayed());
	
	driver.navigate().back();
	
	WebElement Update = driver.findElement(By.xpath("//a[@title='Update']"));
	Update.click();
	
	WebElement MinAmountUpdate = driver.findElement(By.xpath("//input[@id='fee-min_load_value']"));
	MinAmountUpdate.sendKeys("2");
	
	WebElement MaxAmountUpdate = driver.findElement(By.xpath("//input[@id='fee-max_load_value']"));
	MaxAmountUpdate.sendKeys("26");
	
	WebElement LoadFeeUpdate = driver.findElement(By.xpath("//input[@id='fee-amount']"));
	LoadFeeUpdate.sendKeys("2");
	
	WebElement LoadPercentageUpdate = driver.findElement(By.xpath("//input[@id='fee-load_fee_percentage']"));
	LoadPercentageUpdate.sendKeys("2");
	
	WebElement UpdateButton = driver.findElement(By.xpath("//button[contains(text(),'Update']"));
	UpdateButton.click();
	*/
	//Validations
	
	
	
}
	 


}
