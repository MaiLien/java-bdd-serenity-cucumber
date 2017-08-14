package javaautomationcidemo.thucydides.cucumber.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import javaautomationcidemo.thucydides.cucumber.pages.CoursePaymentPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class UserStepsOnCoursePaySteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	CoursePaymentPage coursePaymentPage;

	@Step
	public void openTheCoursePaymentPage() {
		coursePaymentPage.open();
	}

	@Step
	public void enterCourseCode() {
		coursePaymentPage.enterCourseCode("C-00001");
	}

	@Step
	public void enterCourseName() {
		coursePaymentPage.enterCourseName("Java");
	}

	@Step
	public void enterStartDate() {
		coursePaymentPage.enterStartDate("07-08-2017");
	}

	@Step
	public void enterEndDate() {
		coursePaymentPage.enterEndDate("10-08-2017");
	}

	@Step
	public void enterCreaditCard() {
		coursePaymentPage.enterCreaditCard("018892673287");
	}

	@Step
	public void enterCvv() {
		coursePaymentPage.enterCvv("001");
	}

	@Step
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
