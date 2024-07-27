package org.pages;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;

public class A_HomePage extends ProjectSpecification{

	public A_HomePage(WebDriver driver) {
	this.driver=driver;	
	}
	
	public B_Loginpage loginpage() {
	return 	new B_Loginpage(driver);
	}
	
	public C_AppoinmentPage appointmentpsage() {
	return new C_AppoinmentPage(driver);
	}
	
	public D_HistoryPage historypage() {
	return new D_HistoryPage(driver);
	}
	
}
