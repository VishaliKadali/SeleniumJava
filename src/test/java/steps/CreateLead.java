package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class CreateLead extends BaseClass{
	
	@And("Click on CRMSFA")
	public void clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@And("Click on Leads")
	public void clickLeads() {
		driver.findElement(By.xpath("//a[.='Leads']")).click();
		
	}
	
	@And("Click on Create Leads link")
	public void clickCreateLeadsLink() {
		driver.findElement(By.xpath("//a[.='Create Lead']")).click();
	}
	@And ("Enter Company Name as (.*)$")
	public void enterCompanyName(String companyName) {
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys(companyName);
	}
	@And("Enter First Name as (.*)$")
	public void enterFirstName(String firstName) {
		driver.findElement(By.xpath("(//input[@id='createLeadForm_firstName'])")).sendKeys(firstName);
	}
	
	@And("Enter Last Name as (.*)$")
	public void enterLastName(String lastName) {
		driver.findElement(By.xpath("(//input[@id='createLeadForm_lastName'])")).sendKeys(lastName);
	}
	
	@And("Click on Create Leads button")
		public void clickCreateLead() {
			driver.findElement(By.xpath("(//input[@value='Create Lead'])")).click();
	}
	
		
	@Then("View Lead Page should be displayed")
	public void viewLeadPage() {
		String title=driver.getTitle();
		System.out.println(title);
	
	}
	
	
}
