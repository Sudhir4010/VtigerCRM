package com.crmobjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText="Calendar")
	private WebElement calendarTextField;
	
	@FindBy(linkText="Leads")
	private WebElement leadsTextField;
	
	@FindBy(linkText="Organizations")
	private WebElement organizationTextField;
	
	@FindBy(linkText="Contacts")
	private WebElement contactsTextField;
	
	@FindBy(linkText="Opportunities")
	private WebElement opportunitiesTextField;
	
	@FindBy(linkText="Products")
	private WebElement productTextField;
	
	@FindBy(linkText="Documents")
	private WebElement documentTextField;
	
	@FindBy(linkText="Email")
	private WebElement emailTextField;
	
	@FindBy(linkText="Trouble Tickets")
	private WebElement troubleTextField;
	
	@FindBy(linkText="Dashboard")
	private WebElement dashBoardTextField;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorTextField;
	
	@FindBy(linkText="Sign Out")
	private WebElement signOutButton;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getCalendarTextField() {
		return calendarTextField;
	}

	public WebElement getLeadsTextField() {
		return leadsTextField;
	}

	public WebElement getOrganizationTextField() {
		return organizationTextField;
	}

	public WebElement getContactsTextField() {
		return contactsTextField;
	}

	public WebElement getOpportunitiesTextField() {
		return opportunitiesTextField;
	}

	public WebElement getProductTextField() {
		return productTextField;
	}

	public WebElement getDocumentTextField() {
		return documentTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getTroubleTextField() {
		return troubleTextField;
	}

	public WebElement getDashBoardTextField() {
		return dashBoardTextField;
	}

	public WebElement getAdministratorTextField() {
		return administratorTextField;
	}

	public WebElement getSignOutButton() {
		return signOutButton;
	}
	
	

}
