package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.BaseClass;

public class LoginPage {

	//public static By enterMobileFacebook= By.xpath("//*[@id=\"u_0_8\"]");
	public static By enterMobileFacebook= By.cssSelector("input[name='phone_number']");
	public static By enterMobileKisan= By.xpath("//*[@id=\"mat-input-0\"]");
	public static By iframe=By.xpath("/html/body/div[1]/iframe");
	public static By next=By.cssSelector("button[type='submit']");
	public static By continueFacebook=By.xpath("//*[@id=\"u_0_4\"]");
	public static By selectCountry = By.cssSelector("div[class='_2njo _developerAccountKit__inputBorderColor _65j8']");
	public static By countryList = By.cssSelector("ul[class='_2njr']");
	public static By india= By.cssSelector("div[data-tooltip-content='India']");
	
	
//Return enterMobileiframe textbox
	
    public static By txtbx_EnterMobileFacebook(){

    		return enterMobileFacebook;     	
    }
    
    
//Set mobile number in iframe by facebook

    public static void setEnterMobileFacebook(){

        String mobileNumber=BaseClass.prop.getProperty("mobileNumber");
    	BaseClass.enter_Text(enterMobileFacebook, mobileNumber);
    	BaseClass.waitTillElementVisible(BaseClass.driver, enterMobileFacebook);
        BaseClass.driver.findElement(enterMobileFacebook).click();
            	
    }
    
//Click on mobile number field by kisan

    public static void clickEnterMobile() throws Exception{

        Thread.sleep(1000);
    	BaseClass.waitTillElementVisible(BaseClass.driver, enterMobileKisan);    
    	BaseClass.driver.findElement(enterMobileKisan).click();

    }
	
 //Switch to iframe
    
    public static void switchToIFrame() throws Exception {
    	
    	Thread.sleep(5000);
    	WebElement facebooAuth= BaseClass.driver.findElement(iframe);      //Find iframe
 		BaseClass.driver.switchTo().frame(facebooAuth);
		
    }
    
    
 public static void switchToParrentFrame() throws Exception {
    	
    	Thread.sleep(10000);
    	BaseClass.driver.switchTo().parentFrame();
    }
    
    
 //Click on Next button after entering mobile number
    
    public static void clickNext() {
    	
    	BaseClass.waitTillElementClickable(BaseClass.driver, next);
    	BaseClass.driver.findElement(next).click();
    }
    
    
 //Click on Continue button after entering otp
    
    public static void clickContinue() {
    	
    	BaseClass.waitTillElementClickable(BaseClass.driver, continueFacebook);
    	BaseClass.driver.findElement(continueFacebook).click();
    }
    
    public static void selectCountry() throws Exception {
    	
    	//BaseClass.waitTillElementPresent(BaseClass.driver, selectCountry);
    	BaseClass.driver.findElement(selectCountry).click();
    	JavascriptExecutor scroll = (JavascriptExecutor)BaseClass.driver;
    	scroll.executeScript("arguments[0].scrollIntoView(true);", BaseClass.driver.findElement(india));
    	Thread.sleep(3000);
    	BaseClass.driver.findElement(india).click();
    	
    	/*List<WebElement> countries = BaseClass.driver.findElements(countryList);
    	System.out.println(countries.size());
    	
    	for(WebElement country : countries) {
    		System.out.println(country.getText());
    		if (country.getText().equalsIgnoreCase("Albania")) {
    			country.click();
    			break;
			}
    		//System.out.println(country.getText());
    		
    	}*/
  }
	
}
