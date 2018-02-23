package utility;

import java.util.Properties;

import org.apache.http.impl.EnglishReasonPhraseCatalog;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.LoginPage;
import pageObjects.SelectLanguage;


public class BaseClass 
{
	
	public static WebDriver driver =null;
	
	public static Properties prop=new Properties();
	
	
	public By locatorValue(String locatorTpye, String value) 
	{
		By by;
		
		switch (locatorTpye) {
		case "id":
			by = By.id(value);
			break;
		case "name":
			by = By.name(value);
			break;
		case "xpath":
			by = By.xpath(value);
			break;
		case "css":
			by = By.cssSelector(value);
			break;
		case "linkText":
			by = By.linkText(value);
			break;
		case "partialLinkText":
			by = By.partialLinkText(value);
			break;
		default:
			by = null;
			break;
		}
		
		return by;
	}
	
	
	public static void enter_Text(By locator, String text)
	{
		
		WebElement element = driver.findElement(locator);
		BaseClass.waitTillElementVisible(driver, locator);           
        element.click();
		Actions action = new Actions(driver);
		action.sendKeys(text).perform();
		
	}
	
	
	
	public void click_On_Button(String locatorType, String value) {
		try {
			By locator;
			locator = locatorValue(locatorType, value);
			WebElement element = driver.findElement(locator);
			element.click();
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
		}
	}
	
	
	public void login(String mobileNumber) throws Exception
	{

		waitTillElementVisible(driver, SelectLanguage.english);
		SelectLanguage.clickEnglish();
		Thread.sleep(2000);
		LoginPage.clickEnterMobile();
		LoginPage.switchToIFrame();
		LoginPage.selectCountry();
		LoginPage.setEnterMobileFacebook();
		//LoginPage.selectCountry();
		LoginPage.clickNext();
		LoginPage.clickContinue();
			
	}
	
		
	public static WebDriverWait waitTillElementPresent(WebDriver driver,By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return wait;
	}
	
	public static WebDriverWait waitTillElementClickable(WebDriver driver,By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		return wait;
	}
	
	public static WebDriverWait waitTillElementVisible(WebDriver driver,By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		return wait;
	}	
	
public static WebDriverWait waitTillAlertPresent(WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.alertIsPresent());
		return wait;
	}	
	
	
}
