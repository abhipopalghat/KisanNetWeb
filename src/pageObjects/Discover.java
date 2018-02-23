package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.BaseClass;

public class Discover {
	
	public static By closeBtn = By.cssSelector("i[class='zmdi zmdi-close']");
	public static By searchBtn = By.cssSelector("input[class*='search-btn']");
	public static By filterIcon = By.cssSelector("div[class*='filterBlock']");
	public static By followBtn = By.cssSelector("div.ng-star-inserted:nth-child(4) > mat-card:nth-child(1) > mat-card-actions:nth-child(2) > a:nth-child(1)");
	public static By gotItBtn = By.cssSelector(".btnGreen");
	
	
	public static void clickcloseBtn() {
		BaseClass.waitTillElementPresent(BaseClass.driver, closeBtn);    
    	BaseClass.driver.findElement(closeBtn).click();
	}
	
	public static void clicksearchBtn() {
		BaseClass.waitTillElementPresent(BaseClass.driver, searchBtn);    
    	BaseClass.driver.findElement(searchBtn).click();
	}
	
	public static void clickfilterIcon() {
		BaseClass.waitTillElementPresent(BaseClass.driver, filterIcon);    
    	BaseClass.driver.findElement(filterIcon).click();
	}
	
	public static void clickfollowBtn() {
		BaseClass.waitTillElementPresent(BaseClass.driver, followBtn);    
    	BaseClass.driver.findElement(followBtn).click();
	}
	
//Return GotIT button
	
    public static Boolean isDiscoverFirstTime() throws Exception{

    	Thread.sleep(2000);	
    	WebElement gotIt= BaseClass.driver.findElement(gotItBtn);
    	if(gotIt.equals(null)) {
    		return false;
    	}
    	else {
			return true;
		}
		 	
    }	
	
	public static void clickGotItBtn() {
		BaseClass.waitTillElementPresent(BaseClass.driver, gotItBtn);    
    	BaseClass.driver.findElement(gotItBtn).click();
	}
	
}
