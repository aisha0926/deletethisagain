package org.QA.Week7_Assessment_Selenium_RESTassured_JMeter_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class StepDefinition {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	JSONObject object = new JSONObject();

	Actions actions;

	@Before
	public void setup() {
		System.setProperty(Constants.DRIVER_STRING, Constants.DRIVER_PATH);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		actions = new Actions(driver);
		request = given().contentType(ContentType.JSON);
	}

	@Test
	public void addingNewOwner() throws InterruptedException {
		report = new ExtentReports("C:\\Users\\Admin\\Documents\\deletethisagain\\Reporting\\Selenium.html", true);
		test = report.startTest("Verify if person is added");
		
		driver.navigate().to(Constants.WEB_URL);
		AddingNewOwner adding = PageFactory.initElements(driver, AddingNewOwner.class);
		MainPage navToMainPage = PageFactory.initElements(driver, MainPage.class);			
		test.log(LogStatus.INFO, "Browser started");
		
		navToMainPage.ownersTabClick();
		navToMainPage.addNewOwnerClick();
		WebElement dynamicElement = (new WebDriverWait(driver, 300))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("firstName")));

		adding.addingOwner("Ninja", "Assasin", "92 Haha", "Bruh", 123456789);

		navToMainPage.ownersTabClick();
		navToMainPage.addNewOwnerClick();
		// driver.findElement(By.partialLinkText("Ninja Assasin")).click();
		// Thread.sleep(60);
		navToMainPage.clickingName();

		// String name =
		// driver.findElement(By.xpath("/html/body/app-root/app-owner-detail/div/div/table[1]/tbody/tr[1]/td/b")).getText();
		// String expected = "Ninja Assasin";
		//
		// test.log(LogStatus.INFO, "Testing if user has been entered");
		// if(!name.equals(expected)) {
		// test.log(LogStatus.FAIL, "Incorrect user");
		// report.endTest(test);
		// report.flush();
		// }
		//
		// assertEquals(expected, name);
		// test.log(LogStatus.PASS, "User has been entered");
	}

	@Test
	@Ignore
	public void addingPet() throws InterruptedException {
		driver.navigate().to(Constants.WEB_URL);
		AddingPet addingPet = PageFactory.initElements(driver, AddingPet.class);
		MainPage navToMainPage = PageFactory.initElements(driver, MainPage.class);
		Thread.sleep(600);
		navToMainPage.ownersTabClick();
		navToMainPage.ownersAllClickMagnifier();
		Thread.sleep(600);
		addingPet.ownerClick();
		addingPet.addPetClick();

		// navToMainPage.addNewOwnerClick();
		WebElement dynamicElement = (new WebDriverWait(driver, 300))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("name")));

		addingPet.addPetName("Name");
		addingPet.dateClicks("2024/05/06");
		addingPet.type();
		Thread.sleep(10);
	}

	@After
	public void tearDown() {
		report.endTest(test);
		report.flush();
		driver.quit();
	}

}
