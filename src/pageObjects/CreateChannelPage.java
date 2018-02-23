package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.BaseClass;
import utility.FileUpload;

public class CreateChannelPage {
	public static By backArrow = By.cssSelector("mat-list-item.mat-list-item:nth-child(1) > div:nth-child(1) > a:nth-child(3)");
	public static By nextBtn = By.cssSelector("a.text-uppercase");
	public static By imageUpload = By.cssSelector(".imagesUploadCircle");
	public static By channelName = By.cssSelector("#channelName");
	public static By colorBucket = By.cssSelector(".colorBucket");
	public static By colorBucketCode = By.cssSelector(".hex-text > div:nth-child(1) > input:nth-child(1)");
	public static By colorBucketOkBtn = By.cssSelector(".colorPickerBtn1");
	public static By colrBucketCancelBtn = By.cssSelector(".colorPickerBtn2");
	
		public static void setChannelName() {
			BaseClass.waitTillElementPresent(BaseClass.driver, channelName);
			BaseClass.driver.findElement(channelName).click();
			String newChannel = BaseClass.prop.getProperty("newChannelName");
	        BaseClass.enter_Text(channelName, newChannel);
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
		
		public static void clickNextBtn() {
			BaseClass.waitTillElementPresent(BaseClass.driver, nextBtn);
			BaseClass.driver.findElement(nextBtn).click();
		}
		
		public static void uploadChannelImage() {
			BaseClass.waitTillElementClickable(BaseClass.driver, imageUpload);
			BaseClass.driver.findElement(imageUpload).click();
			FileUpload.CopyFilePath("newChannelImagePath");
			FileUpload.PasteFilePath();
			FileUpload.ClickEnter();
		}
		
		
}
