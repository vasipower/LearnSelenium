package Basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserManipulation {
	
	
	public static void main(String[] args) throws InterruptedException, AWTException {

		//
		  WebDriverManager.chromedriver().setup();
			 //System.setProperty("webdriver.chrome.driver", "/Users/vasista.tvn/Documents/vasi/chromedriver");

			 WebDriver driver = new ChromeDriver();  

			
			      // Navigate to Url
			      driver.get("https://google.com");
			      String ss= driver.getCurrentUrl();
				     System.out.println(ss);
				    driver.manage().window().fullscreen();
				   //  driver.manage().window().maximize();
				    
				    //Opening new tab
				     ((JavascriptExecutor) driver).executeScript("window.open()");
			  
				     ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				     driver.switchTo().window(tabs.get(3));
				   driver.get("https://br.yahoo.com/");
				     
				   //get the  dimensions
				     int width = driver.manage().window().getSize().getWidth();
				     int height = driver.manage().window().getSize().getHeight();
				     System.out.println(width);
				     System.out.println(height);
				     
				   
			      Thread.sleep(8000);
			      
			      driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

			      driver.quit();
			      
			      
			      
			      
			      


			      
			      
			      
			      
			      
			      
			      
			      
			      
			      
			      
			      
			      
			      
			    
			    
			      
			      
	}

}
