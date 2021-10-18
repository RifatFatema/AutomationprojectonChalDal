package bd.com.ChalDalAutmation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC10_HandleKeyboardEvent extends DriverSet{
	public static String baseURL = "https://chaldal.com/";

	@Test // TestNG Annotation
	public static void HandleMultipleValueSelection() throws InterruptedException {
	driver.get(baseURL); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); 
	Thread.sleep(1000); 
	
	WebElement e = driver.findElement(By.xpath("//input[@name='mainSearch']"));
	Thread.sleep(3000);
	e.sendKeys(Keys.chord(Keys.SHIFT, "Popular"));
	
	Thread.sleep(3000);
	e.sendKeys(Keys.chord(Keys.ENTER));
	Thread.sleep(3000);
}
}
