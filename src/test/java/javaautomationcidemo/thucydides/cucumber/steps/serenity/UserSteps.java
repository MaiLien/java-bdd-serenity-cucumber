package javaautomationcidemo.thucydides.cucumber.steps.serenity;

import javaautomationcidemo.thucydides.cucumber.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class UserSteps extends ScenarioSteps{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	HomePage homePage;
	
	@Step
	public void openTheHomePage() {
		homePage.open();
	}
	
	@Step
	public void enterEmail() {
		homePage.enterEmail();
	}
	
	

	public void enterPhoneNumber() {
		homePage.enterPhoneNumber();
		
	}

	public void enterFullName() {
		homePage.enterFullName();
		
	}

	public void enterUserName() {
		homePage.enterUserName();
		
	}

	public void enterPassword() {
		homePage.enterPassword();
		
	}

	public void enterReEnterPassword() {
		homePage.enterReEnterPassword();
		
	}

	public void clickAgreeButton() {
		homePage.clickAgreeButton();
		
	}

	public void clickRegistration() {
		homePage.clickRegistration();
		
	}

	public void doNotEnterPhone() {
		homePage.doNotEnterPhone();
		
	}

	public void thenIShouldSeePayButton() {
		assertThat(homePage.getPayButton()).containsIgnoringCase("Pay");	
	}

	public void thenIShouldSeeRegisterButton() {
		assertThat(homePage.getRegisterButton()).containsIgnoringCase("Register");	
		
	}
}
