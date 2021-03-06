package org.QA.RESTassured;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class StepDefinition {
	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	
	@Given("^a film exists with the Title Guardians of the Galaxy Two$")
	public void a_film_exists_with_the_Title_Guardians_of_the_Galaxy_Two() {
		//request = given().when().body(json.equals("Title Guardian of the Galaxy"));
		//request = given().body(json.equals("Title Guardian of the Galaxy"));
		 request = given().contentType(ContentType.JSON);
		
	}

	@When("^a user retrieves the film by the title Guardians of the Galaxy Two$")
	public void a_user_retrieves_the_film_by_the_title_Guardians_of_the_Galaxy_Two() {
	    // Write code here that turns the phrase above into concrete actions
		  response = request.when().get("http://www.omdbapi.com/?apikey=9355337d&t=Guardians+of+the+Galaxy+Vol.+2");
		  System.out.println("response: " + response.prettyPrint());
		  
	}

	@Then("^the status code reads (\\d+)$")
	public void the_status_code_reads(int arg1) {
	    // Write code here that turns the phrase above into concrete actions
		// response = request.when().get("http://www.omdbapi.com/?apikey=9355337d&t=IT&y=2017").then().statusCode(arg1);
		//Thread.sleep(3000);
		System.out.println(response.then().statusCode(arg1));
		//response.then().statusCode(2);
		
	}

	@Given("^a film exists with the Title IT$")
	public void a_film_exists_with_the_Title_IT()  {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^a user retrieves the film by the title IT$")
	public void a_user_retrieves_the_film_by_the_title_IT() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^the Rated Field is equal to R$")
	public void the_Rated_Field_is_equal_to_R() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("^a film exists with the Title \"([^\"]*)\"$")
	public void a_film_exists_with_the_Title(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^a user retrieves the film by the title \"([^\"]*)\"$")
	public void a_user_retrieves_the_film_by_the_title(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^the Rated Field is equal to \"([^\"]*)\"$")
	public void the_Rated_Field_is_equal_to(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	}

}
