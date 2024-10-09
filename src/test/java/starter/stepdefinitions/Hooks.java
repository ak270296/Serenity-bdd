package starter.stepdefinitions;


import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.model.util.EnvironmentVariables;
import stepDef.SetUp;

public class Hooks extends SetUp{
	WebDriver driver;
	private  EnvironmentVariables environmentVariables;
	
	
	
	@Before
	public void startTest(Scenario scenario) throws Exception {
		System.out.println("-------Started scenario------");
		
        environmentVariables.setProperty("environment", "chrome");
        driver=Serenity.getDriver();
        driver.manage().window().maximize();
//        SetUp.setDriver(driver);
        driver.get("https://www.google.com/");
	}
}
