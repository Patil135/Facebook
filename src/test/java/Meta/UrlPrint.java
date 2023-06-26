package Meta;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UrlPrint {

	@Test
	public void title1() {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://facebook.com");
	String actualTitle=driver.getTitle();
	System.out.println(driver.getCurrentUrl());
	assertEquals(actualTitle,"Facebook – log in or sign up");
	}
}
