package RESTassured;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.QA.Week7_Assessment_Selenium_RESTassured_JMeter_.Constants;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class StepDefinition {
	WebDriver driver;
	ExtentReports reports;
	ExtentTest tests;
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
	public void delete() {
		request = given().when().contentType(ContentType.JSON);
		response = request.delete(Constants.SWAGGER + "/15");
		System.out.println("response: " + response.prettyPrint());
	}

	@Test
	@Ignore
	public void getID() {
		request = given().when().contentType(ContentType.JSON);
		response = request.get(Constants.SWAGGER + "/17");
		System.out.println("response: " + response.prettyPrint());
	}

	@Test
	public void post() {
		JSONArray petArray = new JSONArray();
		JSONArray visitArray = new JSONArray();

		RestAssured.baseURI = "http://10.0.10.10:9966/petclinic/api/owners";

		Map<String, Object> emptyOwner = new HashMap<>();

		Map<String, Object> emptyPet = new HashMap<>();

		Map<String, Object> nestedVisitAsMap = new HashMap<>();

		nestedVisitAsMap.put("date", "yyyy/MM/dd");
		nestedVisitAsMap.put("description", "string");
		nestedVisitAsMap.put("id", 0);
		nestedVisitAsMap.put("pet", emptyPet);
		visitArray.add(nestedVisitAsMap);

		Map<String, Object> nestedPetAsMap = new HashMap<>();

		Map<String, Object> nestedTypeAsMap = new HashMap<>();

		nestedTypeAsMap.put("id", 0);

		nestedTypeAsMap.put("name", "String");

		nestedPetAsMap.put("birthDate", "2018-07-27T09:02:40.767Z");
		nestedPetAsMap.put("id", 0);
		nestedPetAsMap.put("name", "String");
		nestedPetAsMap.put("owner", emptyOwner);
		nestedPetAsMap.put("type", nestedTypeAsMap); // needs nested type TODO
		nestedPetAsMap.put("visits", visitArray); // needs nested type TODO

		petArray.add(nestedPetAsMap);
		JSONObject requestParams = new JSONObject();

		requestParams.put("address", "Manchester");
		requestParams.put("city", "This is a test");
		requestParams.put("firstName", "ANTHIA");
		requestParams.put("id", 10);
		requestParams.put("lastName", "String");
		requestParams.put("pets", petArray);
		requestParams.put("telephone", "1234567891");

		given().contentType(ContentType.JSON).body(requestParams).when().post("/").then().statusCode(201);

		System.out.println(requestParams.toString());
	}

	@After
	public void tearDown() {
		// driver.quit();
	}

}
