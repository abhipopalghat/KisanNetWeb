package pageObjects;

import org.openqa.selenium.By;

import utility.BaseClass;

public class SelectLanguage {
	
	public static By english= By.xpath("/html/body/app-root/app-select-language/section/div/div/mat-list/mat-list-item[1]/div");
	public static By marathi=By.xpath("/html/body/app-root/app-select-language/section/div/div/mat-list/mat-list-item[2]/div");
	public static By hindi=By.xpath("/html/body/app-root/app-select-language/section/div/div/mat-list/mat-list-item[3]/div");
	
	
	
//Return English language
	
    public static By btn_English(){

    		return english;  
    	
    }
    
    
//Select English language

    public static void clickEnglish(){
    		
        BaseClass.waitTillElementPresent(BaseClass.driver, english);    
    	BaseClass.driver.findElement(english).click();

    }
    
    
 
//Return Marathi language

    public static By btn_Marathi(){

    		return marathi;

    }
    
    
 //Select Marathi language
    
    public static void clickMarathi(){

    	BaseClass.waitTillElementPresent(BaseClass.driver, marathi);   
    	BaseClass.driver.findElement(marathi).click();

    }
    
    
 //Return Hindi language

    public static By btn_Hindi(){

    	return hindi;

    }
    
 
  //Select Hindi language

    public static void clickHindi(){

    	BaseClass.waitTillElementPresent(BaseClass.driver, hindi);  
    	BaseClass.driver.findElement(hindi).click();

    }
    
    public static void changeLanguage(String language) {
  	   	   	  
  	switch (language) {
  	
  	case "English":
  		SelectLanguage.clickEnglish();
  		break;
  		
  	case "Hindi":
  		SelectLanguage.clickHindi();
  		break;
  		
  	case "Marathi":
  		SelectLanguage.clickMarathi();;
  		break;

  	default:
  		break;
  	}
  }
   

}
