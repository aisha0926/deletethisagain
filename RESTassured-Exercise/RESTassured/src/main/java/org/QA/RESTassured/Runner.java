package org.QA.RESTassured;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/org/QA/RESTassured/intro.feature")
public class Runner {
	
}
