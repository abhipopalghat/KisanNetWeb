package pageObjects;

import org.openqa.selenium.By;
import utility.BaseClass;
import utility.FileUpload;

public class EditUserProfilePage {
	
	public static By closeButton = By.cssSelector("a[class='closeBtn']");
	public static By doneButton = By.xpath("//a[contains(text(),'Done')]");
	public static By firstName = By.id("firstName");
	public static By lastName = By.id("lastName");
	public static By photo = By.cssSelector("img[class='img-responsive img-circle text-center mrgn-auto ng-star-inserted']");
	public static By takePhoto = By.cssSelector("#cdk-overlay-11 > div > div > button:nth-child(1) > a");
	public static By uploadPhoto = By.xpath("//div/button[2]");
	public static By imgUploadMethod = By.cssSelector("div[class= 'mat-menu-content ng-trigger ng-trigger-fadeInItems']");
	//public static By addMore = By.partialLinkText("ADD MORE");
	public static By addMore = By.cssSelector("a.text-uppercase:nth-child(1)");
	public static By interestsList = By.cssSelector("mat-list[class='filterList mat-list']");
	public static By profileUpdateToast = By.cssSelector("div[class='toast-bottom-right toast-container']");
	
	public static void clickcloseBtn() {
		BaseClass.waitTillElementPresent(BaseClass.driver, closeButton);    
    	BaseClass.driver.findElement(closeButton).click();
	}
	
	public static void clickDoneBtn() throws Exception {
		Thread.sleep(3000);
		BaseClass.waitTillElementVisible(BaseClass.driver, doneButton);    
    	BaseClass.driver.findElement(doneButton).click();
	}
	
	public static void  enterFirstName()
	{
		String fName = BaseClass.prop.getProperty("edited_firstName");
		BaseClass.waitTillElementClickable(BaseClass.driver, firstName);
		BaseClass.driver.findElement(firstName).click();
		BaseClass.driver.findElement(firstName).clear();
		BaseClass.enter_Text(firstName, fName);
	}
	
	public static void enterLastName()
	{
		String lName = BaseClass.prop.getProperty("edited_lastName");
		BaseClass.waitTillElementVisible(BaseClass.driver, lastName);
		BaseClass.driver.findElement(lastName).click();
		BaseClass.driver.findElement(lastName).clear();
		BaseClass.enter_Text(lastName, lName);
	}
	
	public static void uploadProfilePic() throws Exception {
    	
    	BaseClass.waitTillElementClickable(BaseClass.driver, photo);
    	BaseClass.driver.findElement(photo).click();
    	Thread.sleep(2000);
    	//BaseClass.waitTillElementPresent(BaseClass.driver, uploadPhoto);
    	BaseClass.driver.findElement(uploadPhoto).click();
    	FileUpload.CopyFilePath("editedUserProfilePic");
		FileUpload.PasteFilePath();
		FileUpload.ClickEnter();
    }
	
	public static void clickAddMoreBtn() throws Exception {
		BaseClass.waitTillElementPresent(BaseClass.driver, addMore);
		Thread.sleep(1000);
    	BaseClass.driver.findElement(addMore).click();
	}
	
	public static String getSuccessToast() {
		BaseClass.waitTillElementPresent(BaseClass.driver, profileUpdateToast);
		String successToast= BaseClass.driver.findElement(profileUpdateToast).getText();
		return successToast;
    	
	}
	
}
