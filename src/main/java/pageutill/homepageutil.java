package pageutill;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.homepage;

public class homepageutil {
	
	public static WebDriver driver;
	static  String chromebrowser= "webdriver.chrome.driver";
	//WebDriverManager.chromedriver().setup();
	static String chromefilepath = "/Users/vasista.tvn/Documents/vasi/chromedriver";

	public  homepageutil(WebDriver createdDriver){
		driver = createdDriver;
		PageFactory.initElements(driver, this);
		Repositories(driver);
	}
	//-- Creating static objects for all repositories 
	public static void Repositories(WebDriver driver){
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
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty(chromebrowser, chromefilepath);
			driver=new ChromeDriver();
		}
		else
			System.out.println(browser+" Given browser configuration doesn't exist");
		return driver;
	}
}
