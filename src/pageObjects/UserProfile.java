package pageObjects;

import org.openqa.selenium.By;

import utility.BaseClass;

public class UserProfile {
	public static By editProfileButton = By.cssSelector("i[class='zmdi zmdi-edit']"); 
	public static By closeButton = By.cssSelector("a[class='closeBtn']");
	public static By viewAllChannels = By.cssSelector("a[class='mrgn-b-md font-bold-four text-uppercase']");
	
	
	public static void clickEditProfileBtn() throws Exception {
		BaseClass.waitTillElementPresent(BaseClass.driver, editProfileButton);   
    	BaseClass.driver.findElement(editProfileButton).click();
	}
	
	public static void clickCloseBtn() {
		BaseClass.waitTillElementPresent(BaseClass.driver,closeButton);    
    	BaseClass.driver.findElement(closeButton).click();
	}
}
 