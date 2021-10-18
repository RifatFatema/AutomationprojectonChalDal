package bd.com.ChalDalAutmation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC12_performScroll extends DriverSet{
	public static String baseURL = "https://chaldal.com/";

	@Test // TestNG Annotation
	public static void HandleMultipleValueSelection() throws InterruptedException {
	driver.get(baseURL); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); 
	Thread.sleep(1000); 
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	//Scroll to Bottom
	 Thread.sleep(5000);
	js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	Thread.sleep(5000);
	//Scroll to Top
	js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
	Thread.sleep(5000);
	//Scroll to specific Element
	WebElement e=driver.findElement(By.xpath(" //div[contains(text(),'Home Appliances')]"));
	js.executeScript("arguments[0].scrollIntoView();",e);
	
	Thread.sleep(5000);
}
}