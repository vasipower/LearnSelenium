package pageutill;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumActions {
	static WebDriver driver;
	public SeleniumActions(WebDriver driver){
		this.driver = driver;
	}

	public static void clickOnElement(WebElement element,String objectName){
		try {
			element.click();
			System.out.println("clicked on "+objectName);
		} catch (Exception e) {
			Assert.assertTrue(false, "Excepiton in clickOnElement- "+e.getLocalizedMessage());
		}
	}
	public static void clearOnElement(WebElement element,String objectName){
		try {
			element.clear();;
			System.out.println("clicked on "+objectName);
		} catch (Exception e) {
			Assert.assertTrue(false, "Excepiton in clearOnElement- "+e.getLocalizedMessage());
		}
	}

	public static  void clickOnElements(List<WebElement> elements,String objectName){
		try {
			((WebElement) elements).click();
			for(int i=0;i<elements.size();i++){
				System.out.println(elements.get(i).getText());
				if(elements.get(i).getText().contains(objectName));
				elements.get(i).click();
				break;
			}
			System.out.println("clicked on "+objectName);
		} catch (Exception e) {
			Assert.assertTrue(false, "Excepiton in clickOnElements- "+e.getLocalizedMessage());
		}
	}
	public static  void elementToBeClickable(WebElement element,String objectName){
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			System.out.println("clicked on "+objectName);
		} catch (Exception e) {
			Assert.assertTrue(false, "Excepiton in elementToBeClickable- "+e.getLocalizedMessage());
		}
	}
	public static void moveToElement(WebElement element,String objectName){
		try {
			new Actions(driver).moveToElement(element).click().build().perform();
			/*if(element.isSelected()){
				System.out.println("checkbox is toggleon");
			}else{
				System.out.println("checkbox is toggleoff");
			}*/
			System.out.println("clicked on "+objectName);
		} catch (Exception e) {
			Assert.assertTrue(false, "Excepiton in moveToElement - "+e.getLocalizedMessage());
		}
	}
	public static void moveToElement1(WebElement element,String value){
		try {
			new Actions(driver).moveToElement(element).sendKeys().build().perform();
			//System.out.println("clicked on "+objectName);
		} catch (Exception e) {
			Assert.assertTrue(false, "Excepiton in moveToElement1 - "+e.getLocalizedMessage());
		}
	}
	//public static void enterText(WebElement element,String objectName,String value){
	public static void enterText(WebElement element,String value){

		try {
			element.sendKeys(value);
			//System.out.println(value+" entered in "+objectName);
		} catch (Exception e) {
			Assert.assertTrue(false, "Excepiton in enterTexr- "+e.getLocalizedMessage());
		}
	}
	public static void uploadElement(WebElement uploadElement,String value){

		try {
			uploadElement.sendKeys(value);
			//System.out.println(value+" entered in "+objectName);
		} catch (Exception e) {
			Assert.assertTrue(false, "Excepiton in uploadElement - "+e.getLocalizedMessage());
		}
	}
	public static void dragAndDrop(WebElement elementSource,WebElement targetElment,String element1,String elment2){
		try {
			new Actions(driver).dragAndDrop(elementSource, targetElment).build().perform();
		} catch (Exception e) {
			Assert.assertTrue(false, "Excepiton in dragAndDrop- "+e.getLocalizedMessage());
		}
	}
	public static void dropdown1(WebElement element,int option){
		try{
			new Select(element).selectByIndex(option);
			/*new Select(element).selectByVisibleText("text");
		new Select(element).selectByValue("value");*/
		}catch (Exception e){
			Assert.assertTrue(false, "Excepiton in dropdown1- "+e.getLocalizedMessage());
		}
	}
	public static void dropdown2(WebElement element,String text){
		try{
			//new Select(element).selectByIndex(option);
			new Select(element).selectByVisibleText("text");
			//new Select(element).selectByValue("value");
		}catch (Exception e){
			Assert.assertTrue(false, "Excepiton in dropdown2- "+e.getLocalizedMessage());
		}
	}
	public static void dropdown3(WebElement element,String value){
		try{
			/*new Select(element).selectByIndex(option);
		new Select(element).selectByVisibleText("text");*/
			new Select(element).selectByValue("value");
		}catch (Exception e){
			Assert.assertTrue(false, "Excepiton in dropdown3- "+e.getLocalizedMessage());
		}
	}
}