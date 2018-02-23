package testCases;

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
	  
  }
}
