package testCases;

import org.testng.annotations.Test;

import pageObjects.LeftDrawer;
import pageObjects.SelectLanguage;
import utility.BaseClass;

public class ChangeLanguage {
  @Test
  public void changeLanguage() {
	  String language= BaseClass.prop.getProperty("Langugae");
	  BaseClass.waitTillElementClickable(BaseClass.driver, LeftDrawer.leftDrawerBtn);
	  LeftDrawer.clickLeftDrawerBtn();
	  LeftDrawer.clickLanguage();
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
