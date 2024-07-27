package org.pages;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class C_AppoinmentPage extends ProjectSpecification{
		
		public C_AppoinmentPage(WebDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		
		
		
		@FindBy(id="combo_facility")
		private WebElement facility;

		@FindBy(id="chk_hospotal_readmission")
		private WebElement checkbtn;

		@FindBy(id="radio_program_medicare")
		private WebElement radianbtn;

		@FindBy(id="txt_visit_date")
		private WebElement adate;
		
		@FindBy(xpath="(//tr)[7]/child::td[text()='26']")
		private WebElement actualdate;

		@FindBy(id="txt_comment")
		private WebElement comment;

		@FindBy(id="btn-book-appointment")
		private WebElement btnappoitment;

		public WebElement getActualdate() {
		return actualdate;
		}
		
		public WebElement getFacility() {
		return facility;
		}

		public WebElement getCheckbtn() {
		return checkbtn;
		}

		public WebElement getRadianbtn() {
		return radianbtn;
		}

		public WebElement getAdate() {
		return adate;
		}

		public WebElement getComment() {
		return comment;
		}

		public WebElement getBtnappoitment() {
		return btnappoitment;
		}




}
