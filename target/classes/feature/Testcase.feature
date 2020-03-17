@jainbookagency
Feature: Jainbook Website
@TC06_Jainbook
Scenario:
Login to the jainbookagency
Given the user launch the chrome application for sixth time
When the user opened the jainbookagency Home page 
Then the user login using valid username and password
Then click on the Advancesearch, logout and close the browser
@TC07_Jainbook
Scenario:
Login and  Search book
Given user launch the chrome application for seventh time
When the user open the jainbookagency 
Then the user  fills the details
Then the user clicks on search button
Then the user get the search book and close the browser


@TC08_Jainbook
Scenario:
Login and Add to cart
Given launch the chrome application for the eigth time
When the user opens the jainbookagency Home page 
Then the user clicks add to cart
Then  Closed the browser
@TC09_Jainbook
Scenario:
Login and cart details
Given launch chrome application for ninth time
When the user opens the jainbookagency  page 
Then user gets the cart details
Then user  closes the page
@TC010_Jainbook
Scenario:
Login and remove the product from cart 
Given launch chrome application for the tenth time
When the user opened the jainbook  page
Then user remove the book from add to cart
Then user  close  page

