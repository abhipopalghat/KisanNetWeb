package pageObjects;

import org.openqa.selenium.By;

import utility.BaseClass;

public class EnterChannelInfo {
	public static By backBtn = By.cssSelector("mat-list-item.mat-list-item:nth-child(1) > div:nth-child(1) > a:nth-child(3)");
	public static By nextBtn = By.cssSelector("a.text-uppercase");
	public static By aboutChannel = By.cssSelector("div[class='mat-input-infix mat-form-field-infix']");
	public static By publicChannelRBtn = By.cssSelector("mat-radio-button[class$='mat-radio-checked']");
	public static By privateChannelRBtn = By.cssSelector("mat-radio-button[class*='deactiveTxt']");
	
	
	public static void setChannelDescription() {
		BaseClass.waitTillElementPresent(BaseClass.driver, aboutChannel);
		BaseClass.driver.findElement(aboutChannel).click();
		
		String description = BaseClass.prop.getProperty("ChannelDescription");
        BaseClass.enter_Text(aboutChannel, description);
    }
	
	public static void clickNextBtn() {
		BaseClass.waitTillElementPresent(BaseClass.driver, nextBtn);
		BaseClass.driver.findElement(nextBtn).click();
	}
	
	public static void clickBackBtn() {
		BaseClass.waitTillElementPresent(BaseClass.driver, backBtn);
		BaseClass.driver.findElement(backBtn).click();
	}
	
	public static void SelectPublicChannel() {
		BaseClass.waitTillElementVisible(BaseClass.driver,publicChannelRBtn);
		BaseClass.driver.findElement(publicChannelRBtn).click();
	}
	
	public static void SelectPrivateChannel() {
		BaseClass.waitTillElementVisible(BaseClass.driver,privateChannelRBtn);
		BaseClass.driver.findElement(privateChannelRBtn).click();
	}
	
	
}
