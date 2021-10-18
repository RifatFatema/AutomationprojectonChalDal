package bd.com.ChalDalAutmation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_01SignIn extends DriverSet {
	public static String baseURL = "https://chaldal.com/";

	@Test // TestNG Annotation
	public static void login() throws InterruptedException {
	driver.get(baseURL); // Get base url and run on browser
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); // maximize the browser window
	Thread.sleep(1000); // used for  waiting 
	driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@value='+88'])[1]")).sendKeys("1741892586"); // click is a method used for click perform
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[contains(text(),'SIGN UP / LOGIN')]")).click();// click is a method used for click perform
	Thread.sleep(1000);
	
	}

}
