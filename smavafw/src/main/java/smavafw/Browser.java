package smavafw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
static WebDriver driver = new ChromeDriver();

	
	public static  void goTo(String url) {
		
		driver.get(url);
		
			}

	
	public static String title() {
		
		return driver.getTitle();
	}

	
	
	public static WebElement amt_field1(String url) {
		
	WebElement amt_1=	driver.findElement(By.id("myselect"));
	
	return amt_1;
		}


	public static WebElement amt_field2(String url) {
		
		WebElement amt_2=	driver.findElement(By.xpath("//*[@id='myselect']/div/div[2]/div[10]"));
		
		return amt_2;
	}

	

	
	public static WebElement dur_field1(String url) {
		
		WebElement dur_1=	driver.findElement(By.id("myselect2"));
		
		return dur_1;
		
	}

	public static WebElement dur_field2(String url) {
		WebElement dur_1=	driver.findElement(By.id("myselect2"));
		WebElement dur_2=	dur_1.findElement(By.cssSelector("div.ui.search.dropdown.selection"));
		return dur_2;
	}

	public static WebElement dur_field3(String url) {
		
		WebElement dur_1=	driver.findElement(By.id("myselect2"));
		WebElement dur_2=	dur_1.findElement(By.cssSelector("div.ui.search.dropdown.selection"));
		WebElement dur_3=	dur_2.findElement(By.xpath("//*[@id=\"myselect2\"]/div/div[2]/div[2]"));
		
		return dur_3;
		
	}

	public static WebElement reason_field1(String url) {
		WebElement re_1=	driver.findElement(By.id("myselect3"));
		return re_1;
	}

	public static WebElement reason_field2(String url) {
		WebElement re_1=	driver.findElement(By.id("myselect3"));
		WebElement re_2=	re_1.findElement(By.cssSelector("div.ui.normal.dropdown.selection"));
		
		return re_2;
	}

	public static WebElement reason_field3(String url) {
		WebElement re_1=	driver.findElement(By.id("myselect3"));
		WebElement re_2=	re_1.findElement(By.cssSelector("div.ui.normal.dropdown.selection"));
		WebElement re_3=	re_2.findElement(By.cssSelector("div.menu:nth-child(4) > div:nth-child(3)"));
		
		return re_3;
	}

	public static WebElement button_field1(String url) {
		WebElement button_field1 = driver.findElement(By.id("mainContent"));
		return button_field1;
	}

	
	public static WebElement button_field2(String url) {
		WebElement button_field1 = driver.findElement(By.id("mainContent"));		
		WebElement button_field2 = button_field1.findElement(By.id("credit"));
		return button_field2;
		
	}	

	public static WebElement button_field3(String url) {
		WebElement button_field1 = driver.findElement(By.id("mainContent"));		
		WebElement button_field2 = button_field1.findElement(By.id("credit"));
		WebElement button_field3 = button_field2.findElement(By.id("x-loan_selection"));
		return button_field3;
		
	}

	public static WebElement button_field4(String url) {
		WebElement button_field1 = driver.findElement(By.id("mainContent"));		
		WebElement button_field2 = button_field1.findElement(By.id("credit"));
		WebElement button_field3 = button_field2.findElement(By.id("x-loan_selection"));
		WebElement button_field4 = button_field3.findElement(By.className("bank__list"));
		return button_field4;
	}

	public static WebElement button_field5(String url) {
		WebElement button_field1 = driver.findElement(By.id("mainContent"));		
		WebElement button_field2 = button_field1.findElement(By.id("credit"));
		WebElement button_field3 = button_field2.findElement(By.id("x-loan_selection"));
		WebElement button_field4 = button_field3.findElement(By.className("bank__list"));
		WebElement button_field5 = button_field4.findElement(By.cssSelector("div.ui.container"));
		return button_field5;
	}

	public static WebElement button_field6(String url) {
		WebElement button_field1 = driver.findElement(By.id("mainContent"));		
		WebElement button_field2 = button_field1.findElement(By.id("credit"));
		WebElement button_field3 = button_field2.findElement(By.id("x-loan_selection"));
		WebElement button_field4 = button_field3.findElement(By.className("bank__list"));
		WebElement button_field5 = button_field4.findElement(By.cssSelector("div.ui.container"));
		WebElement button_field6 = button_field5.findElement(By.className("x-bank_list"));
		return button_field6;
	}

	public static WebElement button_field7(String url) {
		WebElement button_field1 = driver.findElement(By.id("mainContent"));		
		WebElement button_field2 = button_field1.findElement(By.id("credit"));
		WebElement button_field3 = button_field2.findElement(By.id("x-loan_selection"));
		WebElement button_field4 = button_field3.findElement(By.className("bank__list"));
		WebElement button_field5 = button_field4.findElement(By.cssSelector("div.ui.container"));
		WebElement button_field6 = button_field5.findElement(By.className("x-bank_list"));
		WebElement button_field7 = button_field6.findElement(By.xpath("//*[@id=\"forwardButtonkredit2day\"]/button/div"));
		return button_field7;
	}

	public static Object BottomText() {
		WebElement bottomText = driver.findElement(By.className("footer__secure-server"));
		
		String text= bottomText.getText();
		
		return text;
	}

	public static WebElement login_button(String url) {
		
		WebElement buttonLogin = driver.findElement(By.cssSelector("a.item.login-popup.uppercase"));
		return buttonLogin;
	}

	public static WebElement uname_field(String url) {
	
		WebElement uname_field = driver.findElement(By.id("signonForm.email"));
		return uname_field;
	}

	public static WebElement pw_field(String url) {
		WebElement pw_field = driver.findElement(By.id("signonForm.password"));
		return pw_field;
	}

	public static WebElement login_btn(String url) {
		WebElement login_btn = driver.findElement(By.id("cta-label"));
		return login_btn;
	}	
	
	
	public static void close() {
		driver.close();
	}
	
	
}



