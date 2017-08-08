package javaautomationcidemo.thucydides.cucumber.pages;

import java.math.BigDecimal;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:8080/java-demo-ci-web/")
public class HomePage extends PageObject {

	@FindBy(id = "phone")
	WebElementFacade phoneNumber;

	@FindBy(id = "f")
	WebElementFacade fullName;

	@FindBy(id = "email")
	WebElementFacade emailText;

	@FindBy(id = "username")
	WebElementFacade userName;

	@FindBy(id = "password")
	WebElementFacade password;

	@FindBy(id = "repassword")
	WebElementFacade rePassword;

	@FindBy(id = "agree")
	WebElementFacade agreeBnt;

	@FindBy(id = "register")
	WebElementFacade register;

	@FindBy(id = "pay")
	WebElementFacade payBnt;

	public void enterEmail() {
		emailText.typeAndEnter("levunguyen@gmail.com");
	}

	public String getPayButton() {
		return payBnt.getValue();
	}

	public void enterPhoneNumber() {
		phoneNumber.typeAndEnter("0905509951");

	}

	public void enterFullName() {
		fullName.typeAndEnter("Le Vu Nguyen");

	}

	public void enterUserName() {
		userName.type("levunguyen");

	}

	public void enterPassword() {
		password.type("123456789");

	}

	public void enterReEnterPassword() {
		rePassword.type("123456789");

	}

	public void clickAgreeButton() {
		agreeBnt.click();
	}

	public void clickRegistration() {

		register.click();
	}

	public void doNotEnterPhone() {
		phoneNumber.type("");

	}

	public void enterPhoneNumber(String phoneNumber2) {
		phoneNumber.typeAndEnter(phoneNumber2);

	}

	public void enterFullName(String fullname2) {
		fullName.typeAndEnter(fullname2);

	}

	public void enterEmail(String email) {
		emailText.type(email);

	}

	public void enterUserName(String username2) {
		userName.type(username2);

	}

	public void enterPassword(String password2) {
		password.type(password2);

	}

	public void enterReEnterPassword(String repassword2) {
		rePassword.type(repassword2);

	}

	public String getRegisterButton() {
		return register.getValue();
	}
}
