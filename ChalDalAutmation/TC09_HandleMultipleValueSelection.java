package bd.com.ChalDalAutmation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC09_HandleMultipleValueSelection extends DriverSet{
	public static String baseURL = "https://chaldal.com/";

	@Test // TestNG Annotation
	public static void HandleMultipleValueSelection() throws InterruptedException {
	driver.get(baseURL); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); 
	Thread.sleep(1000); 
	
	   WebElement itemOne = driver.findElement(By.xpath(" //a[normalize-space()='Popular']"));
	   WebElement itemThree = driver.findElement(By.xpath("//a[normalize-space()='Hygiene']"));
	   WebElement itemFour = driver.findElement(By.xpath("//a[@href='/babycare']"));
	   WebElement itemFifth = driver.findElement(By.xpath("  //a[@href='/pet-care']"));
	   WebElement itemSixth = driver.findElement(By.xpath("//a[normalize-space()='Food']"));
	   WebElement itemTenth = driver.findElement(By.xpath(" //a[@href='/electric']"));
	   
	   Actions action = new Actions(driver);
       action.keyDown(Keys.CONTROL)
       	   .click(itemOne)
       	   .click(itemThree)
       	   .click(itemFour)
       	.click(itemFifth)
       	.click(itemSixth)
       	.click(itemTenth)
       	   .keyUp(Keys.CONTROL);
       
       action.perform();
	   
}
}
