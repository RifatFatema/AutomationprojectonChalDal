package bd.com.ChalDalAutmation;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class TC03_VerifyPageTitle extends DriverSet {
	public static String baseURL = "https://chaldal.com/";

	@Test // TestNG Annotation
	public static void login() throws InterruptedException {
	driver.get(baseURL); // Get base url and run on browser
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); // maximize the browser window
	Thread.sleep(1000); // used for  waiting 
	
	String pageTitleActual=driver.getTitle();
	System.out.println("The page title is: "+ pageTitleActual);
	Thread.sleep(2000);
}
}