package pageObjects;

import org.openqa.selenium.By;

import utility.BaseClass;
import utility.FileUpload;

public class RegisterUserPage {
	static BaseClass bs= new BaseClass();
    	
	public static By addImage = By.xpath("//*[@id=\"myImg\"]");
	public static By photo = By.cssSelector("#myImg");
	public static By takePhoto = By.cssSelector("button.mat-menu-item:nth-child(1)");
	public static By uploadPhoto = By.xpath("/html/body/div/div[2]/div/div/button[2]");
	public static By firstName = By.cssSelector("input[placeholder='First name']");
	public static By lastName = By.cssSelector("input[placeholder='Last name']");
	public static By pincode = By.cssSelector("input[placeholder='Pincode']");
	public static By nextBtn = By.xpath("/html/body/app-root/app-registration/section/div/div/div/div[5]/button");

	
	public static void  enterFirstName()
	{
		String fName = BaseClass.prop.getProperty("registeruser_firstName");
		BaseClass.waitTillElementVisible(BaseClass.driver, firstName);
		BaseClass.driver.findElement(firstName).click();
		BaseClass.enter_Text(firstName, fName);
		
	}
	
	public static void enterLastName()
	{
		String ln = BaseClass.prop.getProperty("registeruser_lasName");
		BaseClass.waitTillElementVisible(BaseClass.driver, lastName);
		BaseClass.driver.findElement(lastName).click();
		BaseClass.enter_Text(lastName, ln);
		
	}
	
	public static void enterPincode()
	{
		String pc = BaseClass.prop.getProperty("registeruser_pincode");
		BaseClass.waitTillElementVisible(BaseClass.driver, pincode);
		BaseClass.driver.findElement(pincode).click();
		BaseClass.enter_Text(pincode, pc);
	}
	
	public static void clickNext() {
    	
    	BaseClass.waitTillElementClickable(BaseClass.driver, nextBtn);
    	BaseClass.driver.findElement(nextBtn).click();
    }
	
	public static void uploadProfilePic() throws Exception {
    	
    	BaseClass.waitTillElementClickable(BaseClass.driver, photo);
    	BaseClass.driver.findElement(photo).click();
    	Thread.sleep(2000);
		BaseClass.waitTillElementPresent(BaseClass.driver, uploadPhoto);
    	BaseClass.driver.findElement(uploadPhoto).click();
    	FileUpload.CopyFilePath("userProfilePic");
		FileUpload.PasteFilePath();
		FileUpload.ClickEnter();
    }
}
