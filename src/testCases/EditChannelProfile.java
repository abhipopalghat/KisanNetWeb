package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pageObjects.Categories;
import pageObjects.ChannelProfile;
import pageObjects.ChatWindow;
import pageObjects.CreateChannelPage;
import pageObjects.EditChannelProfilePage;
import pageObjects.EditUserProfilePage;
import pageObjects.MyChat;

public class EditChannelProfile {
  @Test
  public void editChannelProfile() throws Exception {
	  
	  MyChat.getChannelList();
	  MyChat.clickOnChannelName("AdminsChannel");
	  
	  ChatWindow.clickRightDrawer();
	  ChatWindow.selectRightDrawerOption("Channel Profile");
	  
	  ChannelProfile.clickEditChannelProfileBtn();
	  
	  EditChannelProfilePage.uploadProfilePic();
	  EditChannelProfilePage.enterChannelName();
	  EditChannelProfilePage.setChannelDescription();
	  
	 //feature not completed yet
	  
	  /*EditChannelProfilePage.clickSelectBackgroundColor();
	  EditChannelProfilePage.setHexColorBucketCode();
	  EditChannelProfilePage.clickColorBucketOkBtn();*/
	  
	  EditChannelProfilePage.clickAddMoreBtn();
	  
	  Categories.selectOrganic_FarmingCategory();
	  Categories.selectAgro_ChemicalCategory();
	  Categories.clickNext();
	  
	  EditChannelProfilePage.clickDoneBtn();
  }
  
  @AfterClass
  
  public static void navigateToMyChat() throws Exception{
	  MyChat.navigateToMyChat();
	}
  
  
  
}
