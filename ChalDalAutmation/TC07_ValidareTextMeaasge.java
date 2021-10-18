package bd.com.ChalDalAutmation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC07_ValidareTextMeaasge extends DriverSet{
	public static String baseURL = "https://chaldal.com/";

	@Test // TestNG Annotation
	public static void WebsiteSecurity() throws InterruptedException {
	driver.get(baseURL); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); 
	Thread.sleep(1000); 
	
	driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[contains(text(),'SIGN UP / LOGIN')]")).click();// click is a method used for click perform
	Thread.sleep(1000);
	WebElement nameErrorMessage = driver.findElement(By.xpath("//span[contains(text(),'Please enter a valid bangladeshi number. e.g. +880')]"));
	
	// Validating the  Name Error Message
			String actfirstNameErrMsg = nameErrorMessage.getText();
			String expfirstNameErrMsg = "Please enter a valid bangladeshi number. e.g. +880";
			
			if(actfirstNameErrMsg.equals(expfirstNameErrMsg)) {
				System.out.println("The nameErrorMessage is "+ actfirstNameErrMsg);
			}
			else
			{
				System.out.println("Actual and Expected First Name Error Message are not same");
				System.out.println("The Actual First Name Error Message is "+ actfirstNameErrMsg);
				System.out.println("The Expected First Name Error Message is "+ expfirstNameErrMsg);
			}
			
}
}