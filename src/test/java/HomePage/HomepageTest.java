package HomePage;


import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import common.BaseTest;
import common.TestData;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.homepage;
import pageutill.SeleniumActions;
import pageutill.homepageutil;




public class HomepageTest extends BaseTest {
	
	
	public WebDriver driver;
	public homepage homepage;
	@BeforeTest
	public void beforeTest() {
		driver= homepageutil.intializeDriver("gc");
		new homepageutil(driver);
		homepage = homepageutil.getLoginObject();
		driver.get(TestData.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	@Test
	public void signUpUser() {
		//test = extent.createTest("signUpUser");
		
		SeleniumActions.enterText(homepage.enterusername11(),TestData.name);
		SeleniumActions.enterText(homepage.enteruserpassword(),TestData.pass);
		SeleniumActions.clickOnElement(homepage.clicksubmit(), "login");
		
	}
	@Test
	public void signUpUser1() {
		//test = extent.createTest("signUpUser");
		System.out.println("Hello");
	}

	
		
	@AfterMethod
	public void report() {
		test = extent.createTest("signUpUser");
		
	}
		
	
	
	
	
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("closing the browser");
		driver.quit();
	}

}
