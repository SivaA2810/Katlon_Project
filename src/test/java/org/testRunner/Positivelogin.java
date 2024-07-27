package org.testRunner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.base.ProjectSpecification;
import org.pages.A_HomePage;
import org.testng.annotations.Test;

public class Positivelogin extends ProjectSpecification {
	
@Test(priority = 1)	
private void testCase003() throws Exception {
	String path="C:\\Users\\HP\\Eclipse workspace new\\Katlon_Project\\src\\test\\resources\\datas.properties";
	FileReader file = new FileReader(path);
	Properties prop= new Properties();
	prop.load(file);
	
	A_HomePage obj = new A_HomePage(driver);
	obj.loginpage().getMenuBtn().click();
	obj.loginpage().getLoginBtn().click();
	
	obj.loginpage().getUsername().sendKeys(prop.getProperty("username"));
	obj.loginpage().getPassword().sendKeys(prop.getProperty("password"));

	obj.loginpage().getEnterbtn().click();

}
}
