package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.BaseClass;

public class ChatWindow {
	
	public static By sendMessageTextBox = By.cssSelector("textarea[placeholder='Type a message']");
	public static By searchButtonInChatWindow = By.cssSelector(".search-btn.fa.ib-m");
	public static By attachmentPinIcon = By.cssSelector(".zmdi.zmdi-attachment-alt");
	public static By righDrawerChatWindow = By.cssSelector("#dashTopHeader > div.topRight > mat-icon:nth-child(3) > button");
	public static By sendButton = By.cssSelector("button[type='submit']");
	public static By attachmentPinOptions = By.cssSelector("button[class='mat-menu-item']");
	public static By sendImageSubmitButton = By.cssSelector("a[class='borderCircle text-center mat-fab']");
	
	public static void clickSendMessageTextBox() {
		BaseClass.waitTillElementVisible(BaseClass.driver, sendMessageTextBox);    
    	BaseClass.driver.findElement(sendMessageTextBox).click();
	}
	
	public static void enterMessage() {
		//BaseClass.waitTillElementPresent(BaseClass.driver, sendMessageTextBox);
		String textMessage = BaseClass.prop.getProperty("TextMessage");
		BaseClass.enter_Text(sendMessageTextBox, textMessage);
	}
	
	public static void clickSendButton() {
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
	
	public static void clickSendImageSubmitButton() {
		BaseClass.waitTillElementClickable(BaseClass.driver,sendImageSubmitButton);    
    	BaseClass.driver.findElement(sendImageSubmitButton).click();
		
	}
	
}
