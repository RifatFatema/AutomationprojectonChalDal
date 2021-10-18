package bd.com.ChalDalAutmation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC08_performToolTip extends DriverSet{
	public static String baseURL = "https://chaldal.com/";

	@Test // TestNG Annotation
	public static void performToolTip() throws InterruptedException {
	driver.get(baseURL); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); 
	Thread.sleep(1000); 
	
	Actions action = new Actions(driver);
	WebElement searchTerm = driver.findElement(By.xpath("//input[@name='search_term_string']"));
	action .moveToElement(searchTerm).perform();
	Thread.sleep(3000); 
	
	// Validating the ToolTip  Message
	String actsearchTermText = searchTerm.getText();
	String expfirstNameErrMsg = "Please fill out this field";
	
	if(actsearchTermText.equals(expfirstNameErrMsg)) {
		System.out.println("The nameErrorMessage is "+ actsearchTermText);
	}
	else
	{
		System.out.println("Actual and Expected First Name Error Message are not same");
		System.out.println("The Actual First Name Error Message is "+ actsearchTermText);
		System.out.println("The Expected First Name Error Message is "+ expfirstNameErrMsg);
	}
	
}
}