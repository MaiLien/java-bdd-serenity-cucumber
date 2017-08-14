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

	Scenario Outline: Pay successfully with valid information
		Given I am on the course payment page
		When I enter my course code as "<my_course_code>"
		And I enter my course name as "<my_course_name>"
		And I enter start date as "<start_date>"
		And I enter end date as "<end_date>"
		And I enter my credit as "<my_credit>"
		And I enter my cvv as "<my_cvv>"
		And I click Pay button
		Then I should see all data is reseted
		
	Examples:
	|my_course_code	|my_course_name	|start_date	|end_date	|my_credit	|my_cvv	|
	|LienHTM		|Hoang Lien		|12/12/2017	|31/12/2017	|08278973	|123	|
	|MinhNN			|Hoang Minh		|22/12/2017	|31/09/2017	|08276773	|323	|