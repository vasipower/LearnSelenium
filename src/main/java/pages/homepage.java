package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homepage {






@FindBy(xpath = "//input[@name='username")
private WebElement username;


@FindBy(how = How.XPATH, using =  
        "//input[@name='password']") 
WebElement password; 


@FindBy(how = How.XPATH, using =  
        "") 
WebElement submit; 

@FindBy(how = How.XPATH, using =  
        "// input[@type='password']") 
  
WebElement passwordTextBox; 
@FindBy(how = How.XPATH, using = "// div[@role = 'button' and @id ='identifierNext']") 
WebElement nextButton; 


public void setEmail(String strEmail) { 
	username.sendKeys(strEmail); 
    } 


    // This method is to set Password in the password text box 
public void setPassword(String strPassword) { 
        passwordTextBox.sendKeys(strPassword); 
    } 
    // This method is to click on Next Button 
public void clickOnNextButton() { 
    nextButton.click(); 
} 
} 