package com.cucumberkotlin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HelloWorldStepDef
{
	KotlinObject kotlinObject = new KotlinObject();

	@Given("I say {string}")
	public void userSaysHello(String input) {
		kotlinObject.setInput(input);
	}

	@When("My greeting is processed")
	public void fetchResponse() {
		kotlinObject.print();
	}

	@Then("I will get the response as {string}")
	public void validateResponse(String expectedResponse)
	{
		Assert.assertEquals("Incorrect Response, Actual Response Given : " ,
				kotlinObject.getInput(), expectedResponse);
	}
}
