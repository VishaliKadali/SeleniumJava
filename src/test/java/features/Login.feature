Feature: Login to Leaptaps

#Background:
#Given Launch the chrome browser
#And Load the URL and maximize

@Smoke
Scenario: Login positive flow
When Enter Username as DemoSalesManager
And Enter Password as <password>
And Click on Login
Then Verify HomePage is displayed

#Examples:
#|username|password|
#|DemoSalesManager|crmsfa|


@Sanity
Scenario: Login Negative flow
When Enter Username as Demo
And Enter Password as crmsfae
And Click on Login
But Verify Error message is displayed

#Examples:
#|username|password|
#|Demo|crmsfae|

