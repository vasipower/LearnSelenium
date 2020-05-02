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
		driver.get("http://truckbookwp.ths.agency/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	@Test
	public void signUpUser() {
		test = extent.createTest("signUpUser");
        Assert.assertTrue(1 > 0);
		SeleniumActions.clickOnElement(homepage.getHomelogin(), "Home- homepage");
		SeleniumActions.clickOnElement(homepage.getSignupOnLogin(), "homepage- SignUp");
		try{
			Thread.sleep(5000);
		}catch (Exception e){
		}
		try{
		homepage.getRegisterOnSignup().isDisplayed(); //assertion 
		SeleniumActions.enterText(homepage.getNameOnSignup(),TestData.Name);
		SeleniumActions.enterText(homepage.getEmailOnSignup(),TestData.Email);
		SeleniumActions.enterText(homepage.getPhonenumOnSignup(),TestData.Phonenumber);
		SeleniumActions.enterText(homepage.getPasswordOnSignup(),TestData.Password);
		SeleniumActions.clickOnElement(homepage.getRegisterOnSignup(), "Register- SignUp");
		}
		catch (Exception e) {
			Assert.assertTrue(false, "Excepiton in signUpUser- "+e.getLocalizedMessage());
		}
	}
	
	@Test
	public void signUpUser1() {
		System.out.println("poraaa");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("closing the browser");
		driver.quit();
	}

}
