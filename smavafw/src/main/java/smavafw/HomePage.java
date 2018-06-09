package smavafw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	String url = "Http://www.smava.de";
	String title = "SMAVA - Das Online-Vergleichsportal für Kredite | SMAVA";

		
	public void goTo() {
		
		Browser.goTo(url);
	}
	
	public boolean isAt() {
		
		return Browser.title().equals(title);
	}

	public void amtEnter() {
			
		Browser.amt_field1(url).click();
		Browser.amt_field2(url).click();
		
		WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
		
	}

	public void durEnter() {
		Browser.dur_field1(url).click();
		Browser.dur_field2(url).click();
		Browser.dur_field3(url).click();
		
		WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
	}

	public void reasonEnter() {
		
		Browser.reason_field2(url).click();
		Browser.reason_field3(url).click();
		
		WebDriverWait wait = new WebDriverWait(Browser.driver, 10);
	}

	public void clickNext() {
		
		
		Browser.button_field7(url).click();
		
	}


	public void clickLogin() {
	Browser.login_button(url).click();
		
	}

	public void unEnter() {
		
		Browser.uname_field(url).click();
		Browser.uname_field(url).sendKeys("wronguname");
		
	}

	public void pwEnter() {
		Browser.pw_field(url).click();
		Browser.pw_field(url).sendKeys("wrongpassword");
		
	}

	public void clickLoginbtn() {
		Browser.login_btn(url).click();
		
	}




}