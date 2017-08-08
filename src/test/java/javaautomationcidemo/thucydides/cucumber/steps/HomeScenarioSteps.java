package javaautomationcidemo.thucydides.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javaautomationcidemo.thucydides.cucumber.steps.serenity.UserSteps;
import net.thucydides.core.annotations.Steps;

public class HomeScenarioSteps {

	@Steps
	UserSteps userStep;
	
	@Given("^I am on the registration$")
	public void openTheHomePage() {
		userStep.openTheHomePage();
	}
	
	@When("^I enter my phone number$")
	public void enterPhoneNumber() {
		userStep.enterPhoneNumber();
	}
	
	@And("^I enter my fullname$")
	public void enterFullName() {
		userStep.enterFullName();
	}
	
	
	@And("^I enter my email$")
	public void enterEmail() {
		userStep.enterEmail();
	}
	
	@And("^I enter my username$")
	public void enterUserName() {
		userStep.enterUserName();
	}
	
	@And("^I enter password$")
	public void enterPassword() {
		userStep.enterPassword();
	}
	
	@And("^I enter repassword$")
	public void enterReEnterPassword() {
		userStep.enterReEnterPassword();
	}
	
	@And("^I click Agree Button$")
	public void clickAgreeButton() {
		userStep.clickAgreeButton();
	}
	
	@And("^I click Registration$")
	public void clickRegistration() {
		userStep.clickRegistration();
	}
	
	
	@When("^I am not enter phone number$")
	public void doNotEnterPhone() {
		userStep.doNotEnterPhone();
	}
	
	@Then("^I should see pay button$")
	public void thenIShouldSeePayButton(){
		userStep.thenIShouldSeePayButton();
	}
	
	@Then("^I should see register button$")
	public void thenIShouldSeeRegisterButton(){
		userStep.thenIShouldSeeRegisterButton();
	}
	 
	
}
