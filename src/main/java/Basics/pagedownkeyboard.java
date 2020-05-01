package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.annotations.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.homepage;
import pageutill.homepageutil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class pagedownkeyboard {
	


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


		   
		   Thread.sleep(7000);
		 } finally {
		   driver.quit();
		 }
		 
	
	}}

