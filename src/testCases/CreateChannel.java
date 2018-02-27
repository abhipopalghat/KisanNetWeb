package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageObjects.Categories;
import pageObjects.CreateChannelPage;
import pageObjects.EnterChannelInfo;
import pageObjects.LeftDrawer;
import pageObjects.MyChat;

public class CreateChannel {
  
	
	@Test(description="Creating Private Channel")
  public void createPvtChannel() throws Exception {
		
		LeftDrawer.clickLeftDrawerBtn();
		LeftDrawer.clickStartYourChannel();
		
		CreateChannelPage.setChannelName();
		
		CreateChannelPage.uploadChannelImage();
		
		CreateChannelPage.clickSelectBackgroundColor();
		CreateChannelPage.setHexColorBucketCode();
		CreateChannelPage.clickColorBucketOkBtn();
	
		CreateChannelPage.clickNextBtn();
		Thread.sleep(1000);
		
		EnterChannelInfo.setChannelDescription();
		EnterChannelInfo.SelectPrivateChannel();
		EnterChannelInfo.clickNextBtn();
	
		Categories.selectAgricultureCategory();
		Categories.selectAnimal_HusbandryCategory();
		Categories.selectAgri_TradingCategory();
		
		Categories.clickNext();
		Thread.sleep(2000);
  }
	
	@Test(description="Creating Public Channel")
	  public void createPubChannel() throws Exception {
			
			LeftDrawer.clickLeftDrawerBtn();
			LeftDrawer.clickStartYourChannel();
			
			CreateChannelPage.setChannelName();
			
			CreateChannelPage.uploadChannelImage();
			
			CreateChannelPage.clickSelectBackgroundColor();
			CreateChannelPage.setHexColorBucketCode();
			CreateChannelPage.clickColorBucketOkBtn();
		
			CreateChannelPage.clickNextBtn();
			Thread.sleep(1000);
			
			EnterChannelInfo.setChannelDescription();
			EnterChannelInfo.SelectPublicChannel();
			EnterChannelInfo.clickNextBtn();
		
			Categories.selectAgricultureCategory();
			Categories.selectAnimal_HusbandryCategory();
			Categories.selectAgri_TradingCategory();
			
			Categories.clickNext();
			Thread.sleep(2000);
	  }
	
	@AfterMethod
	public static void navigateToMyChat() throws Exception{
		MyChat.navigateToMyChat();
	}
}
