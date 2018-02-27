package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.BaseClass;

public class ChannelProfile {
	
	public static By closeButton = By.cssSelector("i[class='zmdi zmdi-close']");
	public static By channelProfilePic = By.cssSelector("img[class='img-responsive img-circle text-center']");
	public static By rightDrawer = By.cssSelector("i[class='zmdi zmdi-more-vert']");
	public static By rightDrawerOptions = By.cssSelector("div[class='mat-menu-content ng-trigger ng-trigger-fadeInItems']");
	public static By editChannelProfileButton = By.xpath("(//i[@class='zmdi zmdi-edit'])[1]");
	
	
	public static void clickRightDrawer() {
		BaseClass.waitTillElementVisible(BaseClass.driver, rightDrawer);    
    	BaseClass.driver.findElement(rightDrawer).click();
	}
	
	public static void selectRightDrawerOption(String option) throws Exception {
		 List<WebElement> options = BaseClass.driver.findElements(rightDrawerOptions);
		
		 for(WebElement We : options) {
			 System.out.println(We.getText());
		 }
		 
		 for(WebElement We : options) {
			 if(We.getText().equalsIgnoreCase(option)) {
				 Thread.sleep(1000);
				 We.click();
				 break;
			 }
		 }
	}
	
	public static void clickEditChannelProfileBtn() throws Exception {
		BaseClass.waitTillElementPresent(BaseClass.driver, editChannelProfileButton);   
    	BaseClass.driver.findElement(editChannelProfileButton).click();
	}
	
	
	

}
