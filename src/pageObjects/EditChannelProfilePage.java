package pageObjects;

import org.openqa.selenium.By;

import utility.BaseClass;
import utility.FileUpload;

public class EditChannelProfilePage {
	
	public static By closeButton = By.cssSelector("a[class='closeBtn']");
	public static By doneButton = By.xpath("//a[contains(text(),'Done')]");
	public static By photo = By.cssSelector("img[class='mrgn-auto text-center']");
	public static By uploadPhoto = By.xpath("//div/button[2]");
	public static By channelName = By.cssSelector("#chnlName");
	public static By colorBucket = By.cssSelector("i[class='zmdi zmdi-format-color-fill']");
	public static By colorBucketCode = By.cssSelector("");
	public static By colorBucketOkBtn = By.cssSelector("");
	public static By colrBucketCancelBtn = By.cssSelector("");
	public static By aboutChannel = By.xpath("(//div[@class='mat-input-flex mat-form-field-flex'])[2]");
	public static By addMore = By.cssSelector("a.text-uppercase:nth-child(1)");
	public static By interestsList = By.cssSelector("mat-list[class='filterList mat-list']");
	public static By profileUpdateToast = By.cssSelector("div[class='toast-bottom-right toast-container']");
	
	
	
	public static void clickCloseBtn() {
		BaseClass.waitTillElementPresent(BaseClass.driver, closeButton);    
    	BaseClass.driver.findElement(closeButton).click();
	}
	
	public static void clickDoneBtn() throws Exception {
		Thread.sleep(3000);
		BaseClass.waitTillElementVisible(BaseClass.driver, doneButton);    
    	BaseClass.driver.findElement(doneButton).click();
	}
	
	public static void uploadProfilePic() throws Exception {
    	
    	BaseClass.waitTillElementClickable(BaseClass.driver, photo);
    	BaseClass.driver.findElement(photo).click();
    	Thread.sleep(2000);
    	//BaseClass.driver.findElement(uploadPhoto).click();  // Feature is not ready in wireframe
    	FileUpload.CopyFilePath("editedChannelProfilePic");
		FileUpload.PasteFilePath();
		FileUpload.ClickEnter();
    }

	public static void  enterChannelName(){
		
	String chnlName = BaseClass.prop.getProperty("edited_ChannelName");
	BaseClass.waitTillElementClickable(BaseClass.driver, channelName);
	BaseClass.driver.findElement(channelName).click();
	BaseClass.driver.findElement(channelName).clear();
	BaseClass.enter_Text(channelName, chnlName);
   }
	
	public static void clickSelectBackgroundColor() {
		BaseClass.waitTillElementPresent(BaseClass.driver, colorBucket);
		BaseClass.driver.findElement(colorBucket).click();
	}
	
	public static void setHexColorBucketCode() {
		BaseClass.waitTillElementPresent(BaseClass.driver, colorBucketCode);
		BaseClass.driver.findElement(colorBucketCode).click();
		BaseClass.driver.findElement(colorBucketCode).clear();
		String bckColor = BaseClass.prop.getProperty("channelBackgroundColor");
        BaseClass.enter_Text(colorBucketCode, bckColor);
	}
	
	public static void clickColorBucketOkBtn() {
		BaseClass.waitTillElementPresent(BaseClass.driver, colorBucketOkBtn);
		BaseClass.driver.findElement(colorBucketOkBtn).click();
	}
	
	public static void setChannelDescription() {
		BaseClass.waitTillElementPresent(BaseClass.driver, aboutChannel);
		BaseClass.driver.findElement(aboutChannel).click();
		String description = BaseClass.prop.getProperty("ChannelDescription");
        BaseClass.enter_Text(aboutChannel, description);
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
