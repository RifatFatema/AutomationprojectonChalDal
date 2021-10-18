package bd.com.ChalDalAutmation;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class TC05_HandleBrowserNavigationAndRefreshTheWebsite extends DriverSet {
	public static String baseURL = "https://chaldal.com/";

	@Test // TestNG Annotation
	public static void WebsiteSecurity() throws InterruptedException {
	driver.get(baseURL); // Get base url and run on browser
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); // maximize the browser window
	Thread.sleep(1000); // used for  waiting
	
	driver.navigate().to("http://www.google.com");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
}
}
