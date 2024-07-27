package org.testRunner;

import org.base.ProjectSpecification;
import org.pages.A_HomePage;
import org.testng.annotations.Test;

public class logintestRunner extends ProjectSpecification {

	@Test(dataProvider="ReadfromExcel")
	private void testCase001(String username, String password) {
		
		A_HomePage obj = new A_HomePage(driver);
		obj.loginpage().getMenuBtn().click();
		obj.loginpage().getLoginBtn().click();
		
		obj.loginpage().getUsername().sendKeys(username);
		obj.loginpage().getPassword().sendKeys(password);
	
		obj.loginpage().getEnterbtn().click();
		
	}

}
