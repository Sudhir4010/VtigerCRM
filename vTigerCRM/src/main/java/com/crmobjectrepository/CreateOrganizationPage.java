package com.crmobjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {
	@FindBy(name="accountname")
	private WebElement nameTextField;
	
	
	@FindBy(name="industry")
	private WebElement industryDropDown;
	
	
	@FindBy(name="accounttype")
	private WebElement typeDropDown;
	
	public CreateOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}

	public WebElement getTypeDropDown() {
		return typeDropDown;
	}
	
	
	
	

}
