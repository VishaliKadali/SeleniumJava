package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import steps.BaseClass;

public class Hooks extends BaseClass{
	
	//Hooks is used to create a pre and post condition(Add annotations and remove background from feature file
	
	@Before
	public void preCondition() {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}

	@After
	public void postCondition() {
		driver.close();
	}
}
