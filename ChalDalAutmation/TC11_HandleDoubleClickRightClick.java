package bd.com.ChalDalAutmation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC11_HandleDoubleClickRightClick extends DriverSet{
	public static String baseURL = "https://chaldal.com/";

	@Test // TestNG Annotation
	public static void HandleMultipleValueSelection() throws InterruptedException {
	driver.get(baseURL); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); 
	Thread.sleep(1000); 
	
	Actions a = new Actions(driver);
	
	WebElement doubleClickText = driver.findElement(By.xpath("//a[normalize-space()='Popular']"));
	a.doubleClick(doubleClickText).build().perform();
	Thread.sleep(3000);

	
	WebElement rightClick = driver.findElement(By.xpath("//a[normalize-space()='Hygiene']"));
	a.contextClick(rightClick).build().perform();
	
	Thread.sleep(3000);
	
}
}