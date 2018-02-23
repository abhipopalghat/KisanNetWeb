package testCases;

import org.testng.annotations.Test;

import pageObjects.LeftDrawer;

public class Logout {
  @Test
  public void logout() {
	  
	  LeftDrawer.clickLeftDrawerBtn();
	  LeftDrawer.clickLogout();
	  LeftDrawer.acceptLogout();
  }
}
