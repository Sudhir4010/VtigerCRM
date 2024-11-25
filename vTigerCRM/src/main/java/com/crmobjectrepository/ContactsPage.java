package com.crmobjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement newCreateOrganization;

	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Search.gif']")
	private WebElement searchOarganization;

	
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}


	public WebElement getNewCreateOrganization() {
		return newCreateOrganization;
	}


	public WebElement getSearchOarganization() {
		return searchOarganization;
	}

}
