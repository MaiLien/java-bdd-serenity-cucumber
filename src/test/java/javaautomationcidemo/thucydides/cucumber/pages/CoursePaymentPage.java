package javaautomationcidemo.thucydides.cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:8080/java-demo-ci-web/course")
public class CoursePaymentPage extends PageObject {

	@FindBy(id = "coursecode")
	WebElementFacade courseCode;

	@FindBy(id = "coursename")
	WebElementFacade courseName;

	@FindBy(id = "startdate")
	WebElementFacade startDate;

	@FindBy(id = "enddate")
	WebElementFacade endDate;

	@FindBy(id = "creaditcard")
	WebElementFacade creaditCard;

	@FindBy(id = "cvv")
	WebElementFacade cvv;

	@FindBy(id = "pay")
	WebElementFacade payBtn;

	public void enterCourseCode(String code) {
		courseCode.typeAndEnter(code);
	}

	public void enterCourseName(String name) {
		courseName.typeAndEnter(name);
	}

	public void enterStartDate(String strStartDate) {
		startDate.typeAndEnter(strStartDate);
	}

	public void enterEndDate(String strEndDate) {
		endDate.typeAndEnter(strEndDate);
	}

	public void enterCreaditCard(String strCreaditCard) {
		creaditCard.typeAndEnter(strCreaditCard);
	}

	public void clickPayButton() {
		payBtn.click();
	}

	public void enterCvv(String strCvv) {
		cvv.typeAndEnter(strCvv);
	}

	public String getCourseCode() {
		return courseCode.getValue();
	}
	
	public String getCourseName() {
		return courseName.getValue();
	}
	
	public String getStartDate() {
		return startDate.getValue();
	}
	
	public String getEndDate() {
		return endDate.getValue();
	}
	
	public String getCreaditCard() {
		return creaditCard.getValue();
	}
	
	public String getCvv() {
		return cvv.getValue();
	}
	
	

}
