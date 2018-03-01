package testCases;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;

import pageObjects.Categories;
import pageObjects.EditUserProfilePage;
import pageObjects.LeftDrawer;
import pageObjects.UserProfile;

public class EditUserProfile {
  @Test
  public void editUSerProfile() throws Exception {
	  
	  LeftDrawer.clickLeftDrawerBtn();
	  LeftDrawer.clickUserProfileImage();
	  Thread.sleep(2000);
	  UserProfile.clickEditProfileBtn();
	  
	  EditUserProfilePage.uploadProfilePic();
	  EditUserProfilePage.enterFirstName();
	  EditUserProfilePage.enterLastName();
	  
	  EditUserProfilePage.clickAddMoreBtn();
	  Categories.selectOrganic_FarmingCategory();
	  Categories.selectAgro_ChemicalCategory();
	  Categories.selectAgri_BusinessCategory();
	  Categories.selectFarm_ServicesCategory();
	  Categories.selectAgri_Finance_And_InsuranceCategory();
	  Categories.selectAlternate_EnergyCategory();
	  Categories.clickNext();
	  
	  EditUserProfilePage.clickDoneBtn();
	  Thread.sleep(3500);
	  /*String getSuccessToast = EditUserProfilePage.getSuccessToast();
	  System.out.println(getSuccessToast);
	  */
  }
}
