@component:ui
@version:Release-2
@issue:ETSY-102
Feature: Course Payment Online
  After register new course
  As a learner
  I want enter payment information to pay  
#Remember when you write the scenario the : need to be near Scenario . For example
#Scenario: is a correct way. Not use Scenario : is wrong because it has space in the
#middle

	Scenario: Pay successfully with valid information
		Given I am on the course payment page
		When I enter my course code
		And I enter my course name
		And I enter start date
		And I enter end date
		And I enter my credit
		And I enter my cvv
		And I click Pay button
		Then I should see all data is reseted