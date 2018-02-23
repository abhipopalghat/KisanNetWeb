package utility;

import java.io.FileInputStream;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory {
	
	
	public void SetProperties() throws Exception {
		
		
		FileInputStream fis= new FileInputStream("G:\\Automation Projects\\KisanNetWeb\\src\\Files\\config.properties");
		//FileInputStream fis= new FileInputStream("\\KisanNetWeb\\src\\Files\\config.properties");
		BaseClass.prop.load(fis);
		
			
	}
	
	public void openBrowser() {
		
		
		String browser= BaseClass.prop.getProperty("browser");
		browser=browser.toLowerCase();
		System.out.println("Testing Started in " + browser);
		
		switch (browser) {
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver", BaseClass.prop.getProperty("chromeDriver"));
			BaseClass.driver=new ChromeDriver();
			BaseClass.driver.manage().window().maximize();
			String baseUrl=	BaseClass.prop.getProperty("baseUrl");	
			BaseClass.driver.get(baseUrl);
						
			break;
			
		case "firefox":
			
			System.setProperty("webdriver.gecko.driver", BaseClass.prop.getProperty("geckoDriver"));
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			BaseClass.driver = new FirefoxDriver(capabilities);
			String kisanbaseUrl=	BaseClass.prop.getProperty("baseUrl");	
			BaseClass.driver.get(kisanbaseUrl);
			
			break;

		default:
			break;
		}
	}
}
