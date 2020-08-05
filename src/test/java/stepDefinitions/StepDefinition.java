package stepDefinitions;

import org.junit.runner.RunWith;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition {

	@Given("^User is on netbanking landing page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {

		System.out.println("User is on netbanking landing page");
	}

	  @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	        System.out.println(strArg1);
	        System.out.println(strArg2);
	    }
	@Then("^Home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
		System.out.println("Home page is displayed");
	}

	 @And("^cards are displayed \"([^\"]*)\"$")
	    public void cards_are_displayed_something(String results) throws Throwable {
	      System.out.println(results);
	      
	      System.out.println("code change for this project");
	 }
}