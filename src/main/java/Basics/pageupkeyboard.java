package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pageupkeyboard {
	
	
	public static void main(String[] args) throws InterruptedException {

	
	  WebDriverManager.chromedriver().setup();

		 WebDriver driver = new ChromeDriver();  

		 try {
		   // Navigate to Url
		   driver.get("https://google.com");
		   // Enter "webdriver" text and perform "ENTER" keyboard action
		   driver.findElement(By.name("q")).sendKeys("webdriver" + Keys.ENTER);

		   Actions actionProvider = new Actions(driver);
		   actionProvider.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		   //actionProvider.perform();
		   Thread.sleep(2000);
		   
//		   JavascriptExecutor jse = (JavascriptExecutor)driver;
//		   jse.executeScript("window.scrollBy(0,-2250)");
		   
		   //one more way to scroll up
		   
		   /**
		    * Talent by Great lavanya madam
		    */
		   
		  for (int i=0;i<=3;i++){
			  
		actionProvider.keyUp(Keys.CONTROL).sendKeys(Keys.PAGE_UP).perform();
		   Thread.sleep(1000);
		  }
		 
		 } finally {
		   driver.quit();
		 }
		 
	
	}}




