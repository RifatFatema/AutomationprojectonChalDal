package bd.com.ChalDalAutmation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC13_PlaceOrder extends DriverSet{
	public static String baseURL = "https://chaldal.com/";

	@Test // TestNG Annotation
	public static void HandleMultipleValueSelection() throws InterruptedException {
	driver.get(baseURL); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); 
	Thread.sleep(1000); 
	
	driver.findElement(By.xpath("//a[normalize-space()='Popular']")).click();// click is a method used for click perform
	Thread.sleep(1000);
	driver.findElement(By.xpath(" //div[3]//section[1]//p[1]")).click();// click is a method used for click perform
	Thread.sleep(1000);
	driver.findElement(By.xpath(" //span[@class='placeOrderText']")).click();// click is a method used for click perform
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//input[@value='+88'])[1]")).sendKeys("1741892586"); // click is a method used for click perform
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[contains(text(),'SIGN UP / LOGIN')]")).click();// click is a method used for click perform
	Thread.sleep(1000);
}
}