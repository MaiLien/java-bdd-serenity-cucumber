package javaautomationcidemo.thucydides.cucumber.steps;

import org.omg.CORBA.PUBLIC_MEMBER;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javaautomationcidemo.thucydides.cucumber.steps.serenity.UserStepsOnCoursePaymentSteps;
import net.thucydides.core.annotations.Steps;

public class CoursePaymentSteps {

	@Steps
	UserStepsOnCoursePaymentSteps userStepsOnCoursePayPage;

	@Given("^I am on the course payment page$")
	public void openTheCoursePaymentPage() {
		userStepsOnCoursePayPage.openTheCoursePaymentPage();
	}

	@When("^I enter my course code$")
	public void enterCourseCode() {
		userStepsOnCoursePayPage.enterCourseCode();
	}

	@And("^I enter my course name$")
	public void enterCourseName() {
		userStepsOnCoursePayPage.enterCourseName();
	}
	
	@And("^I enter start date$")
	public void enterStartDate() {
		userStepsOnCoursePayPage.enterStartDate();
	}
	
	@And("^I enter end date$")
	public void enterEndDate() {
		userStepsOnCoursePayPage.enterEndDate();
	}
	
	@And("^I enter my credit$")
	public void enterCreaditCard() {
		userStepsOnCoursePayPage.enterCreaditCard();
	}
	
	@And("^I enter my cvv$")
	public void enterCvv() {
		userStepsOnCoursePayPage.enterCvv();
	}
	
	@And("^I click Pay button$")
	public void clickPayButton() {
		userStepsOnCoursePayPage.clickPayButton();
	}
	
	@Then("^I should see all data is reseted$")
	public void thenIShouldSeeAllDataIsResetted() {
		userStepsOnCoursePayPage.thenIShouldSeeAllDataIsResetted();
	}
	

}
