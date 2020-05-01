package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class enterkeyboard {


	public static void main(String[] args) throws InterruptedException {

	
	  WebDriverManager.chromedriver().setup();

		 WebDriver driver = new ChromeDriver();  
  
		
		      // Navigate to Url
		      driver.get("https://google.com");

		      // Enter text "q" and perform keyboard action "Enter"
		      driver.findElement(By.name("q")).sendKeys("q" + Keys.ENTER);
		      Thread.sleep(7000);
	}}