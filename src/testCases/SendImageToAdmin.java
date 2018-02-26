package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pageObjects.ChatWindow;
import pageObjects.MyChat;
import utility.BaseClass;
import utility.FileUpload;

public class SendImageToAdmin {
  @Test
  public void sendImage() throws Exception {
	  MyChat.getChannelList();
	  MyChat.clickOnChannelName("FollowersChannel");
	  ChatWindow.clickAttachmentPinIcon();
	  ChatWindow.selectAttachmentPinOption("Image");
	  Thread.sleep(1000);
	
	  //Uncomment the code when proper implementation is done
	  
	  /* FileUpload.CopyFilePath("sendImageInChannel");
	  FileUpload.PasteFilePath();
	  FileUpload.ClickEnter();
	  ChatWindow.clickSendImageSubmitBtn();*/
	  BaseClass.driver.navigate().refresh(); // comment this line when feature is done
	  Thread.sleep(2000);
  }
  
  @AfterClass
	public static void navigateToMyChat() throws Exception{
	  MyChat.navigateToMyChat();
		
	}
}
