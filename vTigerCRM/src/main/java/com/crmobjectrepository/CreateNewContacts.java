package com.crmobjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContacts {
	@FindBy(name="firstname")
	private WebElement nameTextField;
	
	@FindBy(name="lastname")
	private WebElement  lastNameTextField;
	
	@FindBy(name="leadsource")
	private WebElement leadSourceDropdown;
	
	@FindBy(name="birthday")
	private WebElement birthdayDateTextField;
	
	public CreateNewContacts(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
		
	}

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getLeadSourceDropdown() {
		return leadSourceDropdown;
	}

	public WebElement getBirthdayDateTextField() {
		return birthdayDateTextField;
	}
	

}
