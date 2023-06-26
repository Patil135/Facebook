package Meta;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ForgotPassword {

	@Test
	public void title() {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://facebook.com");
	driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
	}
}
