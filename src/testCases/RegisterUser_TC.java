package testCases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Categories;
import pageObjects.RegisterUserPage;
import utility.BaseClass;
import utility.BrowserFactory;

public class RegisterUser_TC {
    
	public static WebDriver driver =null;
	public BaseClass bs = new BaseClass();
	
	@BeforeSuite						//open browser and complete login process
	public void beforeRegister_TC() throws Exception
	{
		  BrowserFactory Br= new BrowserFactory();
		  Br.SetProperties();
		  Br.openBrowser();
		  String mobile = BaseClass.prop.getProperty("loginpage_mobileNumber");
		  bs.login(mobile);
		  Thread.sleep(5000);
	}
	
	@Test							// execute registration process
	public void execute_RegisterUser_TC() throws Exception
	{
		
		// Uncomment Below Code When Login Feature is Ready
		
		/*String mobile = BaseClass.prop.getProperty("loginpage_mobileNumber");
		bs.login(mobile);
		Thread.sleep(5000);*/
		
		BaseClass.driver.switchTo().defaultContent();
		
		RegisterUserPage.uploadProfilePic();
		RegisterUserPage.enterFirstName();
		RegisterUserPage.enterLastName();
		RegisterUserPage.enterPincode();
		RegisterUserPage.clickNext();
		
		Categories.selectAgricultureCategory();
		Categories.selectHorticultureCategory();
		Categories.selectIrrigationCategory();
		Categories.selectAnimal_HusbandryCategory();
		Categories.selectFarm_Allied_ActivitiesCategory();
		Categories.selectMachine_And_ToolsCategory();
		Categories.selectPost_HarvestCategory();
		Categories.selectAgri_TradingCategory();
		Categories.selectBio_TechnologyCategory();
		
		Categories.clickNext();
	}
	
	@AfterClass
	public void afterTest() {
		  //BaseClass.driver.quit();
	  }
	
}
