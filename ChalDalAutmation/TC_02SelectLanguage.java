package bd.com.ChalDalAutmation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_02SelectLanguage  extends DriverSet{
	public static String baseURL = "https://chaldal.com/";

	@Test // TestNG Annotation
	public static void login() throws InterruptedException {
	driver.get(baseURL); // Get base url and run on browser
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); // maximize the browser window
	Thread.sleep(1000); // used for  waiting 
	
	driver.findElement(By.xpath("//p[contains(text(),'বাং')]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	driver.findElement(By.xpath("//p[contains(text(),'EN')]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
}
}
