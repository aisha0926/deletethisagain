package org.QA.APItest;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Ignore;
import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
//import net.minidev.json.JSONObject;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

public class StepDefinition {
	private Response response;
	private RequestSpecification request;
	JSONObject object = new JSONObject();

//	@Before
//	public void testing() {
//		request = given().when().contentType(ContentType.JSON);
//	}

	@Test
	@Ignore
	public void addingObject() {
		request = given().when().contentType(ContentType.JSON);
		response = request.when().get("http://localhost:8090/example/v1/hotels/18");

		object.put("city", "Mamamamoo");
		object.put("description", "KPOP");
		object.put("name", "Mamamoo");
		object.put("rating", 10);
		request.body(object.toString());

		response = request.post("http://localhost:8090/example/v1/hotels");
		System.out.println("response: " + response.prettyPrint());

	}

	@Test
	@Ignore
	public void delete() {
		request = given().when().contentType(ContentType.JSON);
		response = request.delete("http://localhost:8090/example/v1/hotels/7");
	}

	@Test
	public void getID() {
		request = given().when().contentType(ContentType.JSON);
		response = request.get("http://localhost:8090/example/v1/hotels/10");
		System.out.println("response: " + response.prettyPrint());
	}

	@Test
	public void update() {
		request = given().when().contentType(ContentType.JSON);
		
		object.put("city", "Northampton");
		object.put("description", "A small suburb");
		object.put("id", 14);
		object.put("name", "UK");
		object.put("rating", 10);

		request.body(object.toString());

		response = request.put("http://localhost:8090/example/v1/hotels/14");

	}

}
