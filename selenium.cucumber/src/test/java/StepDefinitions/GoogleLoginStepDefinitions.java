package StepDefinitions;

import io.cucumber.java.en.*;

public class GoogleLoginStepDefinitions {
	
	@Given("I launch the browser")
	public void i_launch_the_browser() {
	   System.out.println("Browser is launched");
	}

	@And("I launch the URL")
	public void i_launch_the_url() {
		System.out.println("URL is launched");	
	}

	@Then("I search for {string}")
	public void i_search_for(String string) {
		System.out.println("string is searched");	
	}

	@Then("I verify if serach for {string} appears")
	public void i_verify_if_serach_for_appears(String string) {
		System.out.println("string is displayed");	
	}
	
	
}
