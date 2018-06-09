package smavaut;

import org.junit.Assert;
import org.junit.Test;

import smavafw.Browser;
import smavafw.Pages;

public class UnitTestSmava {

	@Test
	public void canGotoHomepage() {
		//Go to Home page of Smava.de
		Pages.homePage().goTo();
		
		//Verify if Home page is accessible
		Assert.assertTrue(Pages.homePage().isAt());
		
		//Enter the loan amount
		Pages.homePage().amtEnter();
		
		//Enter the duration of the loan
		Pages.homePage().durEnter();
		
		//Enter the reason for which the loan is needed
		Pages.homePage().reasonEnter();
		
		//Click to calculate.
		Pages.homePage().clickNext();
		
		//Verify the results page 
		Assert.assertTrue(Pages.resutPage().isAt());
		
		//Verify the result is loaded completely.
		Assert.assertTrue(Pages.resutPage().isLoaded());
		
		//Close the website.
		Browser.close();
	}
	

	@Test 
	public void noLogin() {
		
		//Go to Home page of Smava.de
		Pages.homePage().goTo();
		
		//Verify if the home page is accessible
		Assert.assertTrue(Pages.homePage().isAt());
		
		//Click on the login button present on the homepage
		Pages.homePage().clickLogin();
		
		//enter the user name
		Pages.homePage().unEnter();
		
		//enter the password
		Pages.homePage().pwEnter();
		
		//Submit the credentials.
		Pages.homePage().clickLoginbtn();
		
		//Exit smava.de
		Browser.close();
	}

	
}