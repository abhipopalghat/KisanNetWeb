package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pageObjects.ChatWindow;
import pageObjects.LeftDrawer;
import pageObjects.MyChat;

public class SendTextToAdmin {
  @Test
public void SendText() throws Exception {
	  
	  MyChat.getChannelList();
	  MyChat.clickOnChannelName("FollowersChannel");
	  ChatWindow.clickChatWithAdminBtn();
	  ChatWindow.clickSendMessageTextBox();
	  ChatWindow.enterMessage();
	  ChatWindow.clickSendBtn();
	  Thread.sleep(2000);
	 /* LeftDrawer.clickLeftDrawerBtn();
	  LeftDrawer.clickMyChats();
	  Thread.sleep(1000);*/
  }
  
  @AfterClass
	public static void navigateToMyChat() throws Exception{
	  MyChat.navigateToMyChat();
	}
}
