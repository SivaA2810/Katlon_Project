package org.pages;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B_Loginpage extends ProjectSpecification{

	
	public B_Loginpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="menu-toggle")
	private WebElement menuBtn;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginBtn;
	
	@FindBy(id="txt-username")
	private WebElement username;
	
	@FindBy(id="txt-password")
	private WebElement password;
	
	@FindBy(id="btn-login")
	private WebElement enterbtn;

	
	public WebElement getMenuBtn() {
		return menuBtn;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getEnterbtn() {
		return enterbtn;
	}
	
	 
	
	
	

	
	
	
	
}
