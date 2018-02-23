package testCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.Discover;
import pageObjects.LeftDrawer;
import pageObjects.MyChat;
import utility.BaseClass;

public class FollowChannel {
  
	@Test
  public void followChannel() throws Exception {
	
		LeftDrawer.clickLeftDrawerBtn();
		LeftDrawer.clickMyChats();
		MyChat.clickdiscoverIcon();
		Boolean firstTimeOnDiscover = Discover.isDiscoverFirstTime();
		if(firstTimeOnDiscover) {
			
			Discover.clickGotItBtn();
			Thread.sleep(3000);
			Discover.clickfollowBtn();
			Thread.sleep(3000);
			Discover.clickcloseBtn();
		}
		else {
			
			Discover.clickfollowBtn();
			Thread.sleep(3000);
			Discover.clickcloseBtn();
		}
  }
}
