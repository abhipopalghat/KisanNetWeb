package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.BaseClass;

public class ChatWindow {
	
	public static By sendMessageTextBox = By.cssSelector("textarea[placeholder='Type a message']");
	public static By searchButtonInChatWindow = By.cssSelector(".search-btn.fa.ib-m");
	public static By attachmentPinIcon = By.cssSelector(".zmdi.zmdi-attachment-alt");
	public static By righDrawerChatWindow = By.cssSelector("#dashTopHeader > div.topRight > mat-icon:nth-child(3) > button");
	public static By sendButton = By.cssSelector("button[type='submit']");
	public static By attachmentPinOptions = By.cssSelector("button[class='mat-menu-item']");
	public static By sendImageSubmitButton = By.cssSelector("a[class='borderCircle text-center mat-fab']");
	public static By chatWithAdminButton = By.cssSelector("a[class='text-center mat-fab']");
	public static By rightDrawer = By.cssSelector("i[class='zmdi zmdi-more-vert']");
	public static By rightDrawerOptions = By.cssSelector("div[class='mat-menu-content ng-trigger ng-trigger-fadeInItems']");
	
	public static void clickSendMessageTextBox() {
		BaseClass.waitTillElementVisible(BaseClass.driver, sendMessageTextBox);    
    	BaseClass.driver.findElement(sendMessageTextBox).click();
	}
	
	public static void enterMessage() {
		String textMessage = BaseClass.prop.getProperty("TextMessage");
		BaseClass.enter_Text(sendMessageTextBox, textMessage);
	}
	
	public static void clickSendBtn() {
		BaseClass.waitTillElementPresent(BaseClass.driver, sendButton);    
    	BaseClass.driver.findElement(sendButton).click();
		
	}
	
	public static void clickAttachmentPinIcon() {
		BaseClass.waitTillElementVisible(BaseClass.driver, attachmentPinIcon);    
    	BaseClass.driver.findElement(attachmentPinIcon).click();
	}
	
	public static void clickAttachmentPinOption(String option) throws Exception {
		 List<WebElement> options = BaseClass.driver.findElements(attachmentPinOptions);
		
		 for(WebElement We : options) {
			 if(We.getText().equalsIgnoreCase(option)) {
				 Thread.sleep(1000);
				 We.click();
				 break;
			 }
		 }
	}
	
	public static void selectAttachmentPinOption(String option) throws Exception {
		switch (option) {
		case "Camera":
			clickAttachmentPinOption(option);
			break;
			
		case "Image":
			clickAttachmentPinOption(option);
			break;
			
		case "Video":
			clickAttachmentPinOption(option);
			break;
			
		case "Audio":
			clickAttachmentPinOption(option);
			break;
			
		case "Location":
			clickAttachmentPinOption(option);
			break;

		default:
			break;
		}
	}
	
	public static void clickSendImageSubmitBtn() {
		BaseClass.waitTillElementClickable(BaseClass.driver,sendImageSubmitButton);    
    	BaseClass.driver.findElement(sendImageSubmitButton).click();
		
	}
	
	public static void clickChatWithAdminBtn() {
		BaseClass.waitTillElementVisible(BaseClass.driver, chatWithAdminButton);    
    	BaseClass.driver.findElement(chatWithAdminButton).click();
	}
	
	public static void clickRightDrawer() {
		BaseClass.waitTillElementVisible(BaseClass.driver, rightDrawer);    
    	BaseClass.driver.findElement(rightDrawer).click();
	}
			
	public static void selectRightDrawerOption(String option) throws Exception {
		 List<WebElement> options = BaseClass.driver.findElements(rightDrawerOptions);
		 BaseClass.waitTillElementVisible(BaseClass.driver, rightDrawerOptions);
		 for(WebElement We : options) {
			 System.out.println(We.getText());
		 }
		 
		 for(WebElement We : options) {
			 if(We.getText().equalsIgnoreCase(option)) {
				 //Thread.sleep(1000);
				 We.click();
				 break;
			 }
		 }
	}
	
	
}
