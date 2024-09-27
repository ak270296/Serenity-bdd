package stepDef;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.annotations.Managed;

public class SetUp {
	
	
	private static final ThreadLocal<WebDriver> thdriver = new ThreadLocal<>();
	
	
	public static void setDriver(WebDriver driver) {
		thdriver.set(driver);
	}
	
	public static WebDriver getDriver() {
		return thdriver.get();
	}
	

}
