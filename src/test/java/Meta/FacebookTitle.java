package Meta;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTitle {

	@Test
	public void title() {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://facebook.com");
	String actualTitle=driver.getTitle();
	System.out.println(driver.getTitle());
	assertEquals(actualTitle,"Facebook – log in or sign up");
	}
}
