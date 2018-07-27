package org.QA.Week7_Assessment_Selenium_RESTassured_JMeter_;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
	@FindBy(xpath = "/html/body/app-root/div[1]/nav/div/ul/li[2]/a")
	private WebElement ownersTab;
	
	@FindBy(xpath = "/html/body/app-root/div[1]/nav/div/ul/li[3]/a")
	private WebElement veteranians;
	
	@FindBy(xpath = "/html/body/app-root/div[1]/nav/div/ul/li[4]/a")
	private WebElement petTypes;
	
	@FindBy(xpath = "/html/body/app-root/div[1]/nav/div/ul/li[2]/ul/li[2]/a")
	private WebElement addNewOwner;
	
	@FindBy(xpath = "/html/body/app-root/div[1]/nav/div/ul/li[2]/ul/li[1]/a")
	private WebElement ownersAll;
	
	@FindBy(xpath = "/html/body/app-root/app-owner-list/div/div/div/table/tbody/tr[1]/td[1]")
	private WebElement clickName;
	
	@FindBy(partialLinkText = "Ninja")
	private WebElement namess;
	
	
	public void ownersTabClick() {
		ownersTab.click();
	}
	
	public void addNewOwnerClick() {
		addNewOwner.click();
	}
	
	public void ownersAllClickMagnifier() {
		ownersAll.click();
	}
	
	public void clickingName() {
		//namess.click();
		clickName.click();
	}

}
