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
import stepDef.SetUp;

public class stepDefinitions extends PageObject {
	
	Actor actor = Actor.named("google");
	WebDriver driver = Serenity.getDriver();
	@Step
	@Given("Go to Google and search {string}")
    public void Go_to_Google_and_search(String cukes) throws InterruptedException {
        System.out.println("Hello");
	}
	
	@Step
    @When("I wait {int} hour")
    public void i_wait_hour(Integer int1) throws InterruptedException, IOException {
		try {
		 System.out.println("Hi");
		 $(By.name("q")).waitUntilVisible().withTimeoutOf(Duration.ofSeconds(5));
		actor.attemptsTo(Ensure.that("hi").isEqualTo("HII"));
		}catch(Throwable e){
			System.out.println(e);
		}
    }
	
	@Step
    @Then("my belly should growl")
    public void my_belly_should_growl() throws InterruptedException {
		try {
    	System.out.println("How are you");
    	actor.attemptsTo(Ensure.that("HII").isEqualTo("hi"));
    	Thread.sleep(2000);
		}catch(Throwable e) {
			System.out.println(e);
		}
    }
    

}
