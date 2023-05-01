package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass{
	
	
	
	@When("Enter Username as (.*)$")
	public void enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	
	@And("Enter Password as (.*)$")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@And("Click on Login")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Verify HomePage is displayed")
	public void verifyLogin() {
		String text = driver.findElement(By.tagName("h2")).getText();
		
//		if (text.contains("Welcome")) {
//			System.out.println("Login is successful");
//		} else {
//			System.out.println("Login is not successful");
//		}
		
		Assert.assertEquals(text, "Welcome");
	}
	
	@But("Verify Error message is displayed")
	public void verifyErrorMessage() {
		String text = driver.findElement(By.id("errorDiv")).getText();
		System.out.println(text);
	}
	
}
