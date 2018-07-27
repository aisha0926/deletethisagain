package org.QA.Week7_Assessment_Selenium_RESTassured_JMeter_;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddingNewOwner {
	@FindBy(id = "firstName")
	private WebElement firstName;
	
	@FindBy(id = "lastName")
	private WebElement lastName;
	
	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "city")
	private WebElement city;
	
	@FindBy(id = "telephone")
	private WebElement telephone;

	
	public void addingOwner(String first, String last, String add, String city1, int tele) {
		firstName.sendKeys(first);
		lastName.sendKeys(last);
		address.sendKeys(add);
		city.sendKeys(city1);
		telephone.sendKeys(String.valueOf(tele));
		telephone.sendKeys(Keys.ENTER);
	}
	
	
	

}
