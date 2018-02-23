package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pageObjects.ChatWindow;
import pageObjects.LeftDrawer;
import pageObjects.MyChat;
import utility.BaseClass;
import utility.FileUpload;

public class SendImageToFollower {
  @Test
  public void SendImage() throws Exception {
	  MyChat.getChannelList();
	  MyChat.clickOnChannelName();
	  ChatWindow.clickAttachmentPinIcon();
	  ChatWindow.selectAttachmentPinOption("Image");
	  Thread.sleep(1000);
	  FileUpload.CopyFilePath("sendImageInChannel");
	  FileUpload.PasteFilePath();
	  FileUpload.ClickEnter();
	  ChatWindow.clickSendImageSubmitButton();
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
