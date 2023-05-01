Feature: Login to Leaptaps 

#Background: 
#	Given Launch the chrome browser 
#	And Load the URL and maximize 
	
Scenario Outline: create Lead with mandatory details 
	When Enter Username as <username> 
	And Enter Password as <password> 
	And Click on Login 
	And Click on CRMSFA 
	And Click on Leads
	And Click on Create Leads link
	And Enter Company Name as <companyName>
	And Enter First Name as <firstName>
	And Enter Last Name as <lastName>
	And Click on Create Leads button
	Then View Lead Page should be displayed
	
	Examples: 
		|username|password|companyName|firstName|lastName|
		|DemoSalesManager|crmsfa|Testleaf|Vishali|K|
		
		
	