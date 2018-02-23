package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import utility.BaseClass;

public class LeftDrawer {
	public static By leftDrawerBtn = By.cssSelector(".zmdi.zmdi-menu"); 
	public static By closeBtn = By.cssSelector("a[class='closeBtn']");
	public static By userProfileImage = By.cssSelector("a[class= 'clickUserProfile']");
	public static By myChats = By.cssSelector("a[href='#/welcome-dashboard']");
	public static By myContacts = By.cssSelector("mat-list-item.pad-tb-sm:nth-child(2) > div:nth-child(1) > a:nth-child(3) > span:nth-child(2)");
	public static By startYourChannel = By.cssSelector("a[href='#/create-community']");
	public static By language = By.cssSelector("a[href='#/select-language']");
	public static By logout = By.cssSelector("mat-list-item.pad-tb-sm:nth-child(8) > div:nth-child(1) > a:nth-child(3) > span:nth-child(2)");
	public static By logoutYesBtn = By.cssSelector("button[class$='btnRed']");
	public static By logoutNoBtn = By.cssSelector("button[class$='btnBlack']");
	
		public static void clickLeftDrawerBtn() {
			BaseClass.waitTillElementPresent(BaseClass.driver, leftDrawerBtn);    
	    	BaseClass.driver.findElement(leftDrawerBtn).click();
		}

		public static void clickCloseBtn() {
			BaseClass.waitTillElementVisible(BaseClass.driver, closeBtn);    
	    	BaseClass.driver.findElement(closeBtn).click();
		}
		
		public static void clickUserProfileImage() {
			BaseClass.waitTillElementClickable(BaseClass.driver, userProfileImage);    
	    	BaseClass.driver.findElement(userProfileImage).click();
		}
		
		public static void clickMyChats() {
			BaseClass.waitTillElementClickable(BaseClass.driver, myChats);    
	    	BaseClass.driver.findElement(myChats).click();
		}
		
		public static void clickMyContacts() {
			BaseClass.waitTillElementPresent(BaseClass.driver, myContacts);    
	    	BaseClass.driver.findElement(myContacts).click();
		}
		
		public static void clickStartYourChannel() {
			BaseClass.waitTillElementPresent(BaseClass.driver, startYourChannel);    
	    	BaseClass.driver.findElement(startYourChannel).click();
		}
		
		public static void clickLanguage() {
			BaseClass.waitTillElementPresent(BaseClass.driver, language);    
	    	BaseClass.driver.findElement(language).click();
		}
		
		public static void clickLogout() {
			BaseClass.waitTillElementVisible(BaseClass.driver, logout);    
	    	BaseClass.driver.findElement(logout).click();
		}
		
		public static void acceptLogout() {
			BaseClass.waitTillElementClickable(BaseClass.driver,logoutYesBtn);
			BaseClass.driver.findElement(logoutYesBtn).click();
		}
		
		public static void rejectLogout() {
			BaseClass.waitTillElementClickable(BaseClass.driver,logoutNoBtn);
			BaseClass.driver.findElement(logoutNoBtn).click();
		}
}
