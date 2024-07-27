package org.testRunner;

import org.base.ProjectSpecification;
import org.pages.A_HomePage;
import org.testng.annotations.Test;

public class HistorytestRunner extends ProjectSpecification{

	
	@Test(priority=3)
	private void testCase004() throws Exception {
		A_HomePage obj = new A_HomePage(driver);
		obj.historypage().getMenubtn().click();
		obj.historypage().getHistorybtn().click();
		obj.takeScreenShot("Appointment_Recipt");
		obj.historypage().getMenubtn().click();
		obj.historypage().getLogoutbtn().click();

	}
	

	
	
	
	
}
