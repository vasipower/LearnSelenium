package pageutill;

import org.openqa.selenium.WebDriver;

import pages.homepage;

public class homepageutil {
	
	
//	WebDriver driver;
//	
//	public homepageutil(WebDriver driver) {
//		this(driver);
//		// TODO Auto-generated constructor stub
//	}
	
	homepage pspk=new homepage();

	public void login(){
		
		pspk.setEmail("john");
		pspk.setPassword("demo");
		pspk.clickOnNextButton();
		
	}

}
