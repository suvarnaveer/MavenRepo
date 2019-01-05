Feature: Test Facebook smoke scenario
	Scenario: Test login with valid credentials
	Given Open chrome and start application
	When I enter valid username and password
	Then user should be able to login successfully
	