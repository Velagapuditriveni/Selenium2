package com.Stepdefinition;

import java.io.IOException;

import com.pages.Jainbook_Advancesearchpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jainbook_Advancesearch {
	Jainbook_Advancesearchpage as=new Jainbook_Advancesearchpage();
	
	@Given("^the user launch the chrome application for sixth time$")
	public void the_user_launch_the_chrome_application_for_sixth_time()  {
		as.launch();
	}

	@When("^the user opened the jainbookagency Home page$")
	public void the_user_opened_the_jainbookagency_Home_page()  {
	    
		as.LoginPage();
	}

	@Then("^the user login using valid username and password$")
	public void the_user_login_using_valid_username_and_password() throws IOException  {
		as.login();
	}

	@Then("^click on the Advancesearch, logout and close the browser$")
	public void click_on_the_Advancesearch_logout_and_close_the_browser() throws InterruptedException  {
		as.advancesearch();
		as.close();
		
	}
	@Given("^user launch the chrome application for seventh time$")
	public void user_launch_the_chrome_application_for_seventh_time() throws Throwable {
		as.launch();
	}

	@When("^the user open the jainbookagency$")
	public void the_user_open_the_jainbookagency() throws Throwable {
		as.LoginPage();
	}

	@Then("^the user  fills the details$")
	public void the_user_fills_the_details() throws Throwable {
		as.advancesearch();
		as.filldetails();
	}

	@Then("^the user clicks on search button$")
	public void the_user_clicks_on_search_button() throws Throwable {
		as.searchb();
	}

	@Then("^the user get the search book and close the browser$")
	public void the_user_get_the_search_book_and_close_the_browser() throws Throwable {
		as.quit();
	}

	@Given("^launch the chrome application for the eigth time$")
	public void launch_the_chrome_application_for_the_eigth_time() throws Throwable {
		as.launch();
	}

	@When("^the user opens the jainbookagency Home page$")
	public void the_user_opens_the_jainbookagency_Home_page() throws Throwable {
		as.LoginPage();
	}

	@Then("^the user clicks add to cart$")
	public void the_user_clicks_add_to_cart() throws Throwable {
		as.advancesearch();
		as.filldetails();
		as.searchb();
		as.addcart();
	}

	@Then("^Closed the browser$")
	public void closed_the_browser() throws Throwable {
		as.quit();
	}

	@Given("^launch chrome application for ninth time$")
	public void launch_chrome_application_for_ninth_time() throws Throwable {
		as.launch();
	}

	@When("^the user opens the jainbookagency  page$")
	public void the_user_opens_the_jainbookagency_page() throws Throwable {
		as.LoginPage();
	}

	@Then("^user gets the cart details$")
	public void user_gets_the_cart_details() throws Throwable {
		as.login();
		as.wishlist();
		
	}

	@Then("^user  closes the page$")
	public void user_closes_the_page() throws Throwable {
		as.quit();
	}

	@Given("^launch chrome application for the tenth time$")
	public void launch_chrome_application_for_the_tenth_time() throws Throwable {
		as.launch();
	}

	@When("^the user opened the jainbook  page$")
	public void the_user_opened_the_jainbook_page() throws Throwable {
		as.LoginPage();
	}

	@Then("^user remove the book from add to cart$")
	public void user_remove_the_book_from_add_to_cart() throws Throwable {
		as.advancesearch();
		as.filldetails();
		as.searchb();
		as.addcart();
		
	}

	@Then("^user  close  page$")
	public void user_close_page() throws Throwable {
		as.close(); 
	}



}
