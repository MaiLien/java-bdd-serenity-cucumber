package javaautomationcidemo.thucydides.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javaautomationcidemo.thucydides.cucumber.steps.serenity.CoursePaymentOutlineSteps;
import javaautomationcidemo.thucydides.cucumber.steps.serenity.HomeOutlineSteps;
import net.thucydides.core.annotations.Steps;

public class CoursePaymentOutlineScenarioSteps {

	@Steps
	CoursePaymentOutlineSteps userStepsOnCoursePayPage;

	@When("^I enter my course code as \"([^\"]*)\"$")
	public void enterCourseCode(String my_course_code) {
		userStepsOnCoursePayPage.enterCourseCode(my_course_code);
	}

	@And("^I enter my course name as \"([^\"]*)\"$")
	public void enterCourseName(String name) {
		userStepsOnCoursePayPage.enterCourseName(name);
	}
	
	@And("^I enter start date as \"([^\"]*)\"$")
	public void enterStartDate(String startDate) {
		userStepsOnCoursePayPage.enterStartDate(startDate);
	}
	
	@And("^I enter end date as \"([^\"]*)\"$")
	public void enterEndDate(String endDate) {
		userStepsOnCoursePayPage.enterEndDate(endDate);
	}
	
	@And("^I enter my credit as \"([^\"]*)\"$")
	public void enterCreaditCard(String card) {
		userStepsOnCoursePayPage.enterCreaditCard(card);
	}
	
	@And("^I enter my cvv as \"([^\"]*)\"$")
	public void enterCvv(String cvv) {
		userStepsOnCoursePayPage.enterCvv(cvv);
	}
	
//	@And("^I click Pay button$")
//	public void clickPayButton() {
//		userStepsOnCoursePayPage.clickPayButton();
//	}
	
//	@Then("^I should see all data is reseted$")
//	public void thenIShouldSeeAllDataIsResetted() {
//		userStepsOnCoursePayPage.thenIShouldSeeAllDataIsResetted();
//	}

	
	/*@When("^I enter my phonenumber as \"([^\"]*)\"$")
	public void enterPhoneNumber(String phoneNumber) {
		
	}*/
	
//	@When("^I enter my phonenumber as \"([^\"]*)\"$")
//	public void i_enter_my_phonenumber_as(String arg1) throws Throwable {
//		homeStep.enterPhoneNumber(arg1);
//	}
//
//	
//	@And("^I enter my fullname as \"([^\"]*)\"$")
//	public void enterFullName(String fullname) {
//		homeStep.enterFullName(fullname);
//	}
//
//	
//	@And("^I enter my emails as \"([^\"]*)\"$")
//	public void enterEmail(String email) {
//		homeStep.enterEmail(email);
//	}
//	
//	@And("^I enter my username as \"([^\"]*)\"$")
//	public void enterUserName(String username) {
//		homeStep.enterUserName(username);
//	}
//	
//	@And("^I enter password as \"([^\"]*)\"$")
//	public void enterPassword(String password) {
//		homeStep.enterPassword(password);
//	}
//	
//	@And("^I enter repassword as \"([^\"]*)\"$")
//	public void enterReEnterPassword(String repassword) {
//		homeStep.enterReEnterPassword(repassword);
//	}
	
	
}
