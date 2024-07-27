package org.base;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.utils.Utility;

public class ProjectSpecification extends Utility {
	
	@BeforeSuite
	@Parameters({"browser","url"})
	public void browserLaunch(String browser, String url) throws Exception {
	launchbrowser(browser, url);
	}
	public void brokenLinkcheck() {
	checkBrokenlink();

	}
	
	public void loadUrl(String url) {
	}
	
	//@AfterMethod
	public void closeBrowser() {
	browserClose();
	}
	
	public void scrolldown() {
	scrollDownpage();
	}
	
	public void scrollup() {
	scrolluppage();
	}
	
	public void click(WebElement element) {
	clickbtn(element);
	}
	public void positionigelement(WebElement element) {
	movetoelement(element);

	}
	public void waituntilelementtoclick(WebElement element) {
		webdriverwait(element);
	}
	
	
	public String valueofAlert(String text) {
	gettextfromAlert();	
	return text;
	}
	
	public String pageTitle() {
	String tit = picktitle();
	return tit;
	}
	public void dropdownselectbyvalue(WebElement element,String value) {
		selectbyvalue(element, value);

	}
	public void pageBack() {
	backthewindow();	
	}
	
	public void forwardPage() {
	forwardthewindow();

	}
	
	public void acceptAllert() { 
	acceptA();
	}
	
	@DataProvider(name="ReadfromExcel")
	public String[][] exceldata() throws Exception {
		
	String [][] data = getValuefromExcel();	
	return data;
	}
	
	public void newdataread() throws Exception {
	getValuefromExcelanothermethod();

	}
}
