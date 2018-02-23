package testCases;

import org.testng.annotations.Test;

import utility.BaseClass;
import utility.BrowserFactory;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class LoginTests {
	
	public BaseClass bsClass = new BaseClass();
	
  @BeforeSuite
  public void beforeTest() throws Exception {
		
	  BrowserFactory Br= new BrowserFactory();
	  Br.SetProperties();
	  Br.openBrowser();
	  	     
  }
  
  
  @Test
  public void login() throws Exception {
	  String mobile= BaseClass.prop.getProperty("mobileNumber");
	  bsClass.login(mobile);
	 
  }
  

  @AfterTest
  public void afterTest() {
	  BaseClass.driver.quit();
  }

}
