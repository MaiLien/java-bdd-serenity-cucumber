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
	
}
