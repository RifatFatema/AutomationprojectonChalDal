package bd.com.ChalDalAutmation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC06_HandleMouseHover extends DriverSet{
	public static String baseURL = "https://chaldal.com/";

	@Test // TestNG Annotation
	public static void WebsiteSecurity() throws InterruptedException {
	driver.get(baseURL); // Get base url and run on browser
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); // maximize the browser window
	Thread.sleep(1000); // used for  waiting
	
	Actions action = new Actions(driver);
	WebElement Dhaka = driver.findElement(By.xpath("//div[@class='area citySelectionArea']"));
	action .moveToElement(Dhaka).perform();
	Thread.sleep(3000); 
	
	WebElement ChangeCity = driver.findElement(By.xpath("(//p[contains(text(),'Change City')])[1]"));
	ChangeCity.click();
	Thread.sleep(3000); 
	
}
}