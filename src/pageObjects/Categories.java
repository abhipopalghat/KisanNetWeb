package pageObjects;

import java.util.List;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.openqa.selenium.By;

import utility.BaseClass;

public class Categories {

	static BaseClass bs= new BaseClass();
	public static By agricultureCategory = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/agriculture.jpg']");
	public static By horticultureCategory = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/horticulture.jpg']");
	public static By irrigationCategory = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/irrigation.jpg']");
	public static By animalHusbandryCategory = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/animal_husbandry.jpg']");
	public static By farmAlliedActivitiesCategory = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/farm_allied_activities.jpg']");
	public static By machineandToolsCategory = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/machine_and_tools.jpg']");
	public static By postHarvestCategory = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/post_harvest.jpg']");
	public static By agriTradingCategory = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/agri_trading.jpg']");
	public static By bioTechnologyCategory = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/bio_technology.jpg']");
	public static By organicFarmingCategory = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/organic_farming.jpg']");
	public static By agroChemicalsCategory = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/argo_chemicals.jpg']");
	public static By agriBusinessCategory = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/agri_business.jpg']");
	public static By farmServicesCategory = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/farm_services.jpg']");
	public static By agriFinanceAndInsuranceCategory = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/agri_finance_and_insurance.jpg']");
	public static By alternateEnergyCategory = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/alternate_energy.jpg']");
	
	
	public static By next = By.linkText("NEXT");
	public static By back = By.cssSelector("i[class='zmdi zmdi-arrow-left']");
	

//Return agriculture category
	
    public static By chkbox_Horticulture(){

    	BaseClass.waitTillElementVisible(BaseClass.driver, agricultureCategory);	
    	return agricultureCategory;  
    	
    }		
	
//Select agriculture category	
	public static void selectAgricultureCategory()
	{
		BaseClass.waitTillElementVisible(BaseClass.driver, agricultureCategory);
		BaseClass.driver.findElement(agricultureCategory).click();
		
	}

//Return horticulture category
	
    public static By chkbox_Agriculture(){

    	BaseClass.waitTillElementVisible(BaseClass.driver, horticultureCategory);	
    	return agricultureCategory;  
    	
    }		
	
//Select horticulture category	
	public static void selectHorticultureCategory()
	{
		BaseClass.waitTillElementVisible(BaseClass.driver, horticultureCategory);
		BaseClass.driver.findElement(horticultureCategory).click();
		
	}	
	
//Return Irrigation category
	
    public static By chkbox_Irrigation(){

    	BaseClass.waitTillElementVisible(BaseClass.driver,irrigationCategory);	
    	return irrigationCategory;  
    	
    }		
	
//Select Irrigation category	
	public static void selectIrrigationCategory()
	{
		BaseClass.waitTillElementVisible(BaseClass.driver, irrigationCategory);
		BaseClass.driver.findElement(irrigationCategory).click();
		
	}		
	
//Return Animal Husbandry category
	
    public static By chkbox_Animal_Husbandry(){

    	BaseClass.waitTillElementVisible(BaseClass.driver,animalHusbandryCategory);	
    	return animalHusbandryCategory;  
    	
    }		
	
//Select Animal Husbandry category	
	public static void selectAnimal_HusbandryCategory()
	{
		BaseClass.waitTillElementVisible(BaseClass.driver, animalHusbandryCategory);
		BaseClass.driver.findElement(animalHusbandryCategory).click();
		
	}			
	
	
//Return Farm Allied Activities category
	
    public static By chkbox_Farm_Allied_Activities(){

    	BaseClass.waitTillElementVisible(BaseClass.driver,farmAlliedActivitiesCategory);	
    	return farmAlliedActivitiesCategory;  
    	
    }		
	
//Select Farm Allied Activities category	
	public static void selectFarm_Allied_ActivitiesCategory()
	{
		BaseClass.waitTillElementVisible(BaseClass.driver, farmAlliedActivitiesCategory);
		BaseClass.driver.findElement(farmAlliedActivitiesCategory).click();
		
	}			
		
//Return Machine and Tools category
	
    public static By chkbox_Machine_And_Tools(){

    	BaseClass.waitTillElementVisible(BaseClass.driver,machineandToolsCategory);	
    	return machineandToolsCategory;  
    	
    }		
	
//Select Machine and Tools category	
	public static void selectMachine_And_ToolsCategory()
	{
		BaseClass.waitTillElementVisible(BaseClass.driver, machineandToolsCategory);
		BaseClass.driver.findElement(machineandToolsCategory).click();
		
	}				
	
//Return Post harvest category
	
    public static By chkbox_Post_Harvest(){

    	BaseClass.waitTillElementVisible(BaseClass.driver,postHarvestCategory);	
    	return postHarvestCategory;  
    	
    }		
	
//Select Post harvest category	
	public static void selectPost_HarvestCategory()
	{
		BaseClass.waitTillElementVisible(BaseClass.driver, postHarvestCategory);
		BaseClass.driver.findElement(postHarvestCategory).click();
		
	}				
		
//Return Agri Trading category
	
    public static By chkbox_Agri_Trading(){

    	BaseClass.waitTillElementVisible(BaseClass.driver,agriTradingCategory);	
    	return agriTradingCategory;  
    	
    }		
	
//Select Agri Trading category	
	public static void selectAgri_TradingCategory()
	{
		BaseClass.waitTillElementVisible(BaseClass.driver, agriTradingCategory);
		BaseClass.driver.findElement(agriTradingCategory).click();
		
	}	
	
	
//Return Bio Technology category
	
    public static By chkbox_Bio_Technology(){

    	BaseClass.waitTillElementVisible(BaseClass.driver,bioTechnologyCategory);	
    	return bioTechnologyCategory;  
    	
    }		
	
//Select Bio Technology category	
	public static void selectBio_TechnologyCategory()
	{
		BaseClass.waitTillElementVisible(BaseClass.driver, bioTechnologyCategory);
		BaseClass.driver.findElement(bioTechnologyCategory).click();
		
	}	
		
//Return Organic Farming category
	
    public static By chkbox_Organic_Farming(){

    	BaseClass.waitTillElementVisible(BaseClass.driver,organicFarmingCategory);	
    	return organicFarmingCategory;  
    	
    }		
	
//Select Organic Farming category	
	public static void selectOrganic_FarmingCategory()
	{
		BaseClass.waitTillElementVisible(BaseClass.driver, organicFarmingCategory);
		BaseClass.driver.findElement(organicFarmingCategory).click();
		
	}	
	
//Return Agro Chemical category
	
    public static By chkbox_Agro_Chemical(){

    	BaseClass.waitTillElementVisible(BaseClass.driver,agroChemicalsCategory);	
    	return agroChemicalsCategory;  
    	
    }		
	
//Select Agro Chemical category	
	public static void selectAgro_ChemicalCategory()
	{
		BaseClass.waitTillElementVisible(BaseClass.driver, agroChemicalsCategory);
		BaseClass.driver.findElement(agroChemicalsCategory).click();
		
	}	
	
//Return Agri Business category
	
    public static By chkbox_Agri_Business(){

    	BaseClass.waitTillElementVisible(BaseClass.driver,agriBusinessCategory);	
    	return agriBusinessCategory;  
    	
    }		
	
//Select Agri Business category	
	public static void selectAgri_BusinessCategory()
	{
		BaseClass.waitTillElementVisible(BaseClass.driver, agriBusinessCategory);
		BaseClass.driver.findElement(agriBusinessCategory).click();
		
	}	
	
//Return Farm Services category
	
    public static By chkbox_Farm_Services(){

    	BaseClass.waitTillElementVisible(BaseClass.driver,farmServicesCategory);	
    	return farmServicesCategory;  
    	
    }		
	
//Select Farm Services category	
	public static void selectFarm_ServicesCategory()
	{
		BaseClass.waitTillElementVisible(BaseClass.driver, farmServicesCategory);
		BaseClass.driver.findElement(farmServicesCategory).click();
		
	}	
	
//Return agri Finance And Insurance category
	
    public static By chkbox_Agri_Finance_And_Insurance(){

    	BaseClass.waitTillElementVisible(BaseClass.driver,agriFinanceAndInsuranceCategory);	
    	return agriFinanceAndInsuranceCategory;  
    	
    }		
	
//Select agri Finance And Insurance category	
	public static void selectAgri_Finance_And_InsuranceCategory()
	{
		BaseClass.waitTillElementVisible(BaseClass.driver, agriFinanceAndInsuranceCategory);
		BaseClass.driver.findElement(agriFinanceAndInsuranceCategory).click();
		
	}	
	
//Return Alternate Energy category
	
    public static By chkbox_Alternate_Energy(){

    	BaseClass.waitTillElementVisible(BaseClass.driver,alternateEnergyCategory);	
    	return alternateEnergyCategory;  
    	
    }		
	
//Select Alternate Energy category	
	public static void selectAlternate_EnergyCategory()
	{
		BaseClass.waitTillElementVisible(BaseClass.driver, alternateEnergyCategory);
		BaseClass.driver.findElement(alternateEnergyCategory).click();
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//Return next button
	
    public static By btn_Next(){

    	BaseClass.waitTillElementClickable(BaseClass.driver, next);	
    	return next;  
    	
    }	
	
	
//Click on next button
	
	public static void clickNext()
	{
		BaseClass.waitTillElementClickable(BaseClass.driver, next);
		BaseClass.driver.findElement(next).click();
	}
	
	
//Return back button
	
    public static By btn_Back(){

    	BaseClass.waitTillElementClickable(BaseClass.driver, back);		
    	return back;  
    	
    }
    
    
//Click on back button

    public static void clickBack(){

    	BaseClass.waitTillElementClickable(BaseClass.driver, back);		  
    	BaseClass.driver.findElement(back).click();

    }
	
	
	
	
	
	
}
