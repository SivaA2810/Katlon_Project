package org.pages;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class D_HistoryPage extends ProjectSpecification{

	public D_HistoryPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="menu-toggle")
	private WebElement menubtn;
	
	@FindBy(xpath="//a[text()='History']")
	private WebElement historybtn;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutbtn;

	
	public WebElement getMenubtn() {
		return menubtn;
	}

	public WebElement getHistorybtn() {
		return historybtn;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	
	

}
