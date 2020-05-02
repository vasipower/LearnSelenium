package pageutill;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.homepage;

public class homepageutil {
	
	public static WebDriver driver;
	static  String chromebrowser= "webdriver.chrome.driver";
	
	static String chromefilepath = "/Users/vasista.tvn/Documents/vasi/chromedriver";
	//-- TruckBook constructor is to intialize all repositories 
	public  homepageutil(WebDriver createdDriver){
		driver = createdDriver;
		PageFactory.initElements(driver, this);
		initTruckRepositories(driver);
	}
	//-- Creating static objects for all repositories 
	public static void initTruckRepositories(WebDriver driver){
		homepage = new homepage(driver);
		seleniumActions = new SeleniumActions(driver);
		
	}
	//-- Creating login object 
		static SeleniumActions seleniumActions;
		public static SeleniumActions getSeleniumActions(){
			return seleniumActions;
		}

	//-- Creating login object 
	static homepage homepage;
	public static homepage getLoginObject(){
		return homepage;
	}
	//--creating browser object
	public static WebDriver intializeDriver(String browser){
		if(browser.equalsIgnoreCase("gc")){
			System.setProperty(chromebrowser, chromefilepath);
			driver=new ChromeDriver();
		}
		else
			System.out.println(browser+" Given browser configuration doesn't exist");
		return driver;
	}
}
