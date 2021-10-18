package bd.com.ChalDalAutmation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSet {
	public static WebDriver driver;

	@BeforeSuite // TestNG Annotation
	public static void setDriver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		driver = new ChromeDriver();   //Chrome driver object create
	}

	@AfterSuite // TestNG Annotation
	public static void close() {
		driver.close();   // close the WebDriver
	}

}
