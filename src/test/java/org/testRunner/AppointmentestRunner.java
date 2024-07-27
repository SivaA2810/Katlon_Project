package org.testRunner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebElement;
import org.pages.A_HomePage;
import org.testng.annotations.Test;

public class AppointmentestRunner extends ProjectSpecification {
	
	
	@Test(priority = 2)
	private void testcase002() throws Exception {
		String path="C:\\Users\\HP\\Eclipse workspace new\\Katlon_Project\\src\\test\\resources\\datas.properties";
		FileReader file = new FileReader(path);
		Properties prop= new Properties();
		prop.load(file);
		
		A_HomePage obj = new A_HomePage(driver);
		
		WebElement facility = obj.appointmentpsage().getFacility();
		obj.selectbyindex(facility, 2);
		obj.appointmentpsage().getCheckbtn().click();
		obj.appointmentpsage().getRadianbtn().click();
		obj.appointmentpsage().getAdate().click();
		obj.appointmentpsage().getActualdate().click();
		obj.appointmentpsage().getComment().sendKeys(prop.getProperty("discription"));
		obj.appointmentpsage().getBtnappoitment().click();
		
		
		
	}
}
