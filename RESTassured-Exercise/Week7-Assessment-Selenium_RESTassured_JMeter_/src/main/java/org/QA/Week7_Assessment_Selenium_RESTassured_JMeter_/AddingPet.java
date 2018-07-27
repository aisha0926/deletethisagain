package org.QA.Week7_Assessment_Selenium_RESTassured_JMeter_;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddingPet {
	
	Actions actions;

	@FindBy(xpath = "/html/body/app-root/app-owner-list/div/div/div/table/tbody/tr[14]/td[1]/a")
	private WebElement ownerName;

	@FindBy(xpath = "/html/body/app-root/app-owner-detail/div/div/button[3]")
	private WebElement addPetBtn;
	
	@FindBy(id = "name")
	private WebElement petName;
	
	@FindBy(xpath =  "/html/body/app-root/app-pet-add/div/div/form/div[4]/mat-datepicker-toggle/button/span/svg")
	private WebElement dateClick;

	@FindBy(xpath = "/html/body/app-root/app-pet-add/div/div/form/div[4]/input")
	private WebElement date;
	
	@FindBy(xpath = "//*[@id=\"type\"]")
	private WebElement type;
	
	@FindBy(xpath = "/html/body/app-root/app-pet-add/div/div/form/div[6]/div/button[2]")
	private WebElement saveBtn;
	
	public void ownerClick() {
		ownerName.click();
	}
	
	public void addPetClick() {
		addPetBtn.click();
	}
	
	public void addPetName(String pet) {
		petName.sendKeys(pet);
	}
	
	public void dateClicks(String dates) {
		date.sendKeys(dates);
	}
//	
	public void type() {
		type.click();
		type.sendKeys(Keys.ARROW_DOWN);
		type.sendKeys(Keys.ENTER);
		saveBtn.click();
	}

}
