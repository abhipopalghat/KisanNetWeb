package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pageObjects.Categories;
import pageObjects.CreateChannelPage;
import pageObjects.EnterChannelInfo;
import pageObjects.LeftDrawer;
import pageObjects.MyChat;

public class CreateChannel {
  
	
	@Test
  public void CreateChannel() throws Exception {
		
		// Click on Start your channel from left drawer
		LeftDrawer.clickLeftDrawerBtn();
		LeftDrawer.clickStartYourChannel();
		
		// Enter channel name
		CreateChannelPage.setChannelName();
		
		//Upload channel image
		CreateChannelPage.uploadChannelImage();
		
		//Set channel background color
		
		CreateChannelPage.clickSelectBackgroundColor();
		CreateChannelPage.setHexColorBucketCode();
		CreateChannelPage.clickColorBucketOkBtn();
		
		//Click on next button
		
		CreateChannelPage.clickNextBtn();
		Thread.sleep(1000);
		
		// Enter channel description
		EnterChannelInfo.setChannelDescription();
		EnterChannelInfo.SelectPrivateChannel();
		EnterChannelInfo.clickNextBtn();
		
		// Select channel categories
		
		Categories.selectAgricultureCategory();
		Categories.selectAnimal_HusbandryCategory();
		Categories.selectAgri_TradingCategory();
		
		//Click on next button
		
		Categories.clickNext();
		Thread.sleep(2000);
				
  }
	
	@AfterClass
	public static void navigateToMyChat() throws Exception{
		MyChat.navigateToMyChat();
	}
}
