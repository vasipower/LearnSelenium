package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	WebDriver driver;

	public homepage(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	private WebElement username1;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@class='button']")
	private WebElement submit;

	// Element methods

	public WebElement enterusername11() {
		return username1;
	}

	public WebElement enteruserpassword() {
		return password;
	}

	public WebElement clicksubmit() {
		return submit;
	}

}
