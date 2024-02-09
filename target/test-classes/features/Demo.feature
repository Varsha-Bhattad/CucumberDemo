Feature: Login and Add item to cart

Scenario Outline: User logs in and adds item to the cart


#Given the user is landing on login page 
Given the user will navigate to site "<Url>"
When User login into application with "<Username>" and password "<Password>"
Then the user should be logged in
When user adds an item to the cart
Then Item will be added to the cart 
And User clicks on checkout


Examples:

 |Username      | Password     | Url     | 
 |standard_user | secret_sauce | TestApp |   
 
 

 

 
 
 
 
 






