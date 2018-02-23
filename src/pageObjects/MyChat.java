package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.BaseClass;

public class MyChat {
	
	public static By discoverIcon = By.cssSelector(".chat-toolbar-list > mat-icon:nth-child(1)");
	public static By notificationIcon = By.cssSelector("mat-icon.mat-icon:nth-child(2)");
	public static By rightDrawerIcon = By.cssSelector("mat-icon.mat-icon:nth-child(3)");
	public static By channelList= By.cssSelector("span[class='limitChannelName']");
	
	
	
	public static void clickdiscoverIcon() throws Exception {
		Thread.sleep(3000);
		BaseClass.waitTillElementVisible(BaseClass.driver, discoverIcon);    
    	BaseClass.driver.findElement(discoverIcon).click();
	}
	
	public static void clicknotificationIcon() {
		BaseClass.waitTillElementPresent(BaseClass.driver, notificationIcon);    
    	BaseClass.driver.findElement(notificationIcon).click();
	}
	
	public static void clickrightDrawerIcon() {
		BaseClass.waitTillElementPresent(BaseClass.driver, rightDrawerIcon);    
    	BaseClass.driver.findElement(rightDrawerIcon).click();
	}
	
	public static List<WebElement> getChannelList() {
		List <WebElement> Channels = BaseClass.driver.findElements(channelList);
		//System.out.println("Total Channels Present :" + Channels.size() );
		return Channels;
	}
	
	public static void clickOnChannelName() {
		
		List <WebElement> Channels = getChannelList();
		String channelToBeClicked = BaseClass.prop.getProperty("AdminsChannel");
		for(WebElement channelName : Channels) {
			
			if(	channelName.getText().equalsIgnoreCase(channelToBeClicked)) {
				channelName.click();
				break;
			}
		}
	}
	
	public static void navigateToMyChat() throws Exception {
		LeftDrawer.clickLeftDrawerBtn();
		LeftDrawer.clickMyChats();
		Thread.sleep(1000);
	}
	
	

}
