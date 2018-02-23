package utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;



public class FileUpload {
	
		
		static Robot robot;
	
	
	public static void CopyFilePath(String fileLocation){
		try {
			robot = new Robot();
			
		robot.setAutoDelay(2000);
		String path = BaseClass.prop.getProperty(fileLocation);
		// path finding to be deleted later
		StringSelection filepath = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		robot.setAutoDelay(2000);
		}catch(Exception e) {
			
		}	
	}
	
	public static void PasteFilePath() {
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(2000);
	}
	
	public static void ClickEnter() {
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	

}
