package starter.stepdefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;

public class stepDefinitions extends PageObject {
	
//	WebDriver driver= SetUp.getDriver();
	WebDriver driver = Serenity.getDriver();
	
	@Before
	public void setupSoftAssert() {
		Ensure.enableSoftAssertions();
	}
	
	@After
	public void reportSoftAssert(){
		Ensure.reportSoftAssertions();
	}
	
	@Step
	@Given("Go to Google and search {string}")
    public void Go_to_Google_and_search(String cukes) throws InterruptedException {
        System.out.println("Hello");
	}
	
	@Step
    @When("I wait {int} hour")
    public void i_wait_hour(Integer int1) throws InterruptedException, IOException {
		 System.out.println("Hi");
		 $(By.name("q")).waitUntilVisible().withTimeoutOf(Duration.ofSeconds(5));
		 String act = "5.00";
		 String exp = "6.00";
		Actor actor = Actor.named("aana");
		actor.can(BrowseTheWeb.with(driver));
		actor.attemptsTo(Ensure.that(exp).isEqualTo(act));
    }
	
	@Step
    @Then("my belly should growl")
    public void my_belly_should_growl() throws InterruptedException {
    	System.out.println("How are you");
    	Thread.sleep(2000);
    }
    

}
