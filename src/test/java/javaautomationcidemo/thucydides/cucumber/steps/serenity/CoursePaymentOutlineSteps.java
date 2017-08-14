package javaautomationcidemo.thucydides.cucumber.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import javaautomationcidemo.thucydides.cucumber.pages.CoursePaymentPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CoursePaymentOutlineSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	CoursePaymentPage coursePaymentPage;

	@Step
	public void openTheCoursePaymentPage() {
		coursePaymentPage.open();
	}
	
//	@Step
	public void enterCourseCode(String code) {
		coursePaymentPage.enterCourseCode(code);
	}

//	@Step
	public void enterCourseName(String name) {
		coursePaymentPage.enterCourseName(name);
	}

//	@Step
	public void enterStartDate(String startDate) {
		coursePaymentPage.enterStartDate(startDate);
	}

//	@Step
	public void enterEndDate(String endDate) {
		coursePaymentPage.enterEndDate(endDate);
	}

//	@Step
	public void enterCreaditCard(String card) {
		coursePaymentPage.enterCreaditCard(card);
	}

//	@Step
	public void enterCvv(String cvv) {
		coursePaymentPage.enterCvv(cvv);
	}

//	@Step
	public void clickPayButton() {
		coursePaymentPage.clickPayButton();
	}
	
	public void thenIShouldSeeAllDataIsResetted() {
		assertThat(coursePaymentPage.getCourseCode()).isEqualTo("");
		assertThat(coursePaymentPage.getCourseName()).isEqualTo("");
		assertThat(coursePaymentPage.getStartDate()).isEqualTo("");
		assertThat(coursePaymentPage.getEndDate()).isEqualTo("");
		assertThat(coursePaymentPage.getCreaditCard()).isEqualTo("");
		assertThat(coursePaymentPage.getCvv()).isEqualTo("");
	}

}
