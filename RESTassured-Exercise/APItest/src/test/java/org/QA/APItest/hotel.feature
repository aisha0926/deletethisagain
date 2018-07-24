Feature: Testing hotel 

Scenario: Testing search function 
	Given a hotel exists in the list 
	When a user searches for a specific hotel 
	Then the hotel should detail should be displayed 
	
Scenario: Testing add function 
	Given id is not duplicated 
	When a user adds a hotel 
	Then the hotel should be added 
	
Scenario: Testing delete function 
	Given the hotel id exists 
	When a user deletes a hotel 
	Then the hotel item should be removed 
	
	
Scenario Outline: Testing the hotels using a table 
	Given a house exists with "<id>" 
	When a user does a general search "<name>" 
	Then all hotels should be displayed
	
	Examples: 
		| id  | name |
		| 10 | RBW |
		| 11 | UK |
		| 12 | UK |
		| 13 | UK |
		
		
		
		
  