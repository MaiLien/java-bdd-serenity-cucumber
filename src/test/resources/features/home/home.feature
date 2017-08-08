@component:ui
@version:Release-2
@issue:ETSY-102
Feature: Register Course Online
  In order for learning a new technologies
  As a learner
  I want buyers to buy  a course
#Remember when you write the scenario the : need to be near Scenario . For example
#Scenario: is a correct way. Not use Scenario : is wrong because it has space in the
#middle

 	Scenario: Register a course
	    Given I am on the registration 
	    When I enter my phone number
	    And I enter my fullname
	    And I enter my email
	    And I enter my username
	    And I enter password
	    And I enter repassword
	    And I click Agree Button
	    And I click Registration 
	    Then I should see pay button
	    
	Scenario: Register a course with empty phone number
		Given I am on the registration 
	    When I am not enter phone number
	    And I enter my fullname
	    And I enter my email
	    And I enter my username
	    And I enter password
	    And I enter repassword
	    And I click Agree Button
	    And I click Registration 
	    Then I should see register button