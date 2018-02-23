package testCases;

import org.apache.http.message.LineFormatter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pageObjects.ChatWindow;
import pageObjects.LeftDrawer;
import pageObjects.MyChat;

public class SendTextToFollower {
  @Test
  public void SendText() throws Exception {
	  
	  MyChat.getChannelList();
	  MyChat.clickOnChannelName();
	  ChatWindow.clickSendMessageTextBox();
	  ChatWindow.enterMessage();
	  ChatWindow.clickSendButton();
	  Thread.sleep(2000);
	  LeftDrawer.clickLeftDrawerBtn();
	  LeftDrawer.clickMyChats();
	  Thread.sleep(1000);
  }
  
  @AfterClass
	public static void navigateToMyChat() throws Exception{
	  MyChat.navigateToMyChat();
	}
}
