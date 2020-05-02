package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class homepage {

   WebDriver driver;
	public homepage(WebDriver driver1){
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}
	@FindBy(how =How.XPATH,using="//span[text()='Login']")
	private WebElement homelogin;   
	public WebElement getHomelogin(){
		return homelogin; 
	}

	@FindBy(how =How.XPATH,using="//a[contains(@href,'register')]")
	//@FindBy(how =How.XPATH,using="signupxpath")
	private WebElement signupOnLogin;   
	public WebElement getSignupOnLogin(){
		return signupOnLogin;
	}
	@FindBy(how =How.ID,using="fname")
	private WebElement nameOnSignup;
	public WebElement getNameOnSignup(){
		return nameOnSignup;
	}
	@FindBy(how =How.ID,using="email")
	private WebElement EmailOnSignup;
	public WebElement getEmailOnSignup(){
		return EmailOnSignup;

	}
	@FindBy(how =How.ID,using="phone")
	private WebElement PhonenumOnSignup;
	public WebElement getPhonenumOnSignup(){
		return PhonenumOnSignup;

	}
	@FindBy(how =How.ID,using="password")
	private WebElement PasswordOnSignup;
	public WebElement getPasswordOnSignup(){
		return PasswordOnSignup;
	}
	@FindBy(how =How.ID,using="submit")
	private WebElement RegisterOnSignup;
	public WebElement getRegisterOnSignup(){
		return RegisterOnSignup;
	}
	@FindBy(how =How.XPATH,using="//input[@name='otp1']")
	private WebElement Otp1OnSignup;
	public WebElement getOtp1OnSignup(){
		return Otp1OnSignup;
	}
	@FindBy(how =How.XPATH,using="//input[@name='otp2']")
	private WebElement Otp2OnSignup;
	public WebElement getOtp2OnSignup(){
		return Otp2OnSignup;
	}
	@FindBy(how =How.XPATH,using="//input[@name='otp3']")
	private WebElement Otp3OnSignup;
	public WebElement getOtp3OnSignup(){
		return Otp3OnSignup;
	}
	@FindBy(how =How.XPATH,using="//input[@name='otp4']")
	private WebElement Otp4OnSignup;
	public WebElement getOtp4OnSignup(){
		return Otp4OnSignup;
	}
	@FindBy(how =How.XPATH,using="//input[@name='submitotp']")
	private WebElement VerifyButtonOnSignUp;
	public WebElement getVerifyButtonOnSignUp(){
		return VerifyButtonOnSignUp;
	}

	@FindBy(how =How.ID,using="swal2-content")
	private WebElement SuucessMsgOnSignUp;
	public WebElement getSuucessMsgOnSignUp(){
		return SuucessMsgOnSignUp;
	}

	@FindBy(how =How.XPATH,using="//button[text()='OK']")
	private WebElement OkButtonOnSuccessSignUp;
	public WebElement getOkButtonOnSuccessSignUp(){
		return OkButtonOnSuccessSignUp;
	}
	/*public void login(string username,string Pass){
		SeleniumActions.enterText(getusername, objectName, value);
		SeleniumActions.enterText(pasddd, objectName, value);
		SeleniumActions.clickOnElement(login, objectName);
		try {
			//--logo should be displayed
		} catch (Exception e) {
			// TODO: handle exception
		}
	}*/
	@FindBy(how =How.XPATH,using="//span[@id='notification']")
	private WebElement Selectlogoutoptiononlogin;
	public WebElement getSelectlogoutoptiononlogin(){
		return Selectlogoutoptiononlogin;
	}
	@FindBy(how =How.XPATH,using="//*[contains(text(),' Logout')]")
	//@FindBy(how =How.XPATH,using="signupxpath")
	private WebElement logoutButtononlogin;   
	public WebElement getLogoutButtononlogin(){
		return logoutButtononlogin;

	}
	/*@FindBy(how =How.XPATH,using="//input[@name= 'phone']")
	//@FindBy(how =How.XPATH,using="signupxpath")
	private WebElement phonenumber1onlogin;   
	public WebElement getphonenumber1onlogin(){
		return phonenumber1onlogin;
	 */
	@FindBy(how =How.ID,using="phone")
	private WebElement PhonenumberOnLogin;
	public WebElement getPhonenumberOnLogin(){
		return PhonenumberOnLogin;

	}
	/*@FindBy(how =How.XPATH,using="//input[@name= 'password']")
	//@FindBy(how =How.XPATH,using="signupxpath")
	private WebElement password1onlogin;   
	public WebElement getpassword1onlogin(){
		return password1onlogin;*/
	@FindBy(how =How.ID,using="password")
	private WebElement password1OnLogin;
	public WebElement getpassword1OnLogin(){
		return password1OnLogin;


	}
	@FindBy(how =How.XPATH,using="//input[@name= 'login']")
	//@FindBy(how =How.XPATH,using="signupxpath")
	private WebElement Loginonlogin;   
	public WebElement getLoginonlogin(){
		return Loginonlogin;
	}
	//addjob elements on login
	@FindBy(how =How.XPATH,using="//*[contains(text(),'Add Job')]")
	//@FindBy(how =How.XPATH,using="signupxpath")
	private WebElement Addjobonlogin;   
	public WebElement getAddjobonlogin(){
		return Addjobonlogin;
	}
	@FindBy(how =How.ID,using="origin")
	//@FindBy(how =How.XPATH,using="//label[text()='Origin ']")
	private WebElement origininaddjobOnLogin;
	public WebElement getorigininaddjobOnLogin(){
		return origininaddjobOnLogin;
	}
	//@FindBy(how =How.ID,using="ui-id-774")
	@FindBy(how =How.XPATH,using="//ul[@id='ui-id-1']/li[2]/div")
	private WebElement OrigininlistinaddjobOnLogin;
	public WebElement getOrigininlistinaddjobOnLogin(){
		return OrigininlistinaddjobOnLogin;
	}
	@FindBy(how =How.ID,using="myModalLabel2")
	private WebElement moveonaddjobOnLogin;
	public WebElement getmovoneaddjobOnLogin(){
		return  moveonaddjobOnLogin;
	}
	@FindBy(how =How.ID,using="destination")
	private WebElement destinationinaddjobOnLogin;
	public WebElement getdestinationinaddjobOnLogin(){
		return destinationinaddjobOnLogin;
	}
	@FindBy(how =How.ID,using="ui-id-883")
	private WebElement destinationlistinaddjobOnLogin;
	public WebElement getdestinationlistinaddjobOnLogin(){
		return destinationlistinaddjobOnLogin;
	}
	@FindBy(how =How.ID,using="rate")
	private WebElement rateinaddjobOnLogin;
	public WebElement getrateinaddjobOnLogin(){
		return rateinaddjobOnLogin;
	}
	@FindBy(how =How.XPATH,using="//input[contains(@class,'chosen-search-input default')]")
	//@FindBy(how =How.ID,using="category_chosen")
	//@FindBy(how =How.XPATH,using="//select[@id='category']")
	private WebElement Trailertypeinaddjobonlogin;   
	public WebElement getTrailertypeinaddjobonlogin(){
		return Trailertypeinaddjobonlogin;
	}
	@FindBy(how =How.XPATH,using="//li[text()='Dry Van']")
	//@FindBy(how =How.XPATH,using="signupxpath")
	private WebElement dryvanAddjobonlogin;   
	public WebElement getdryvanAddjobonlogin(){
		return dryvanAddjobonlogin;
	}
	//@FindBy(how =How.XPATH,using="//input[@id='yes']")
	//@FindBy(how =How.XPATH,using="//*[contains(@class,'mandatory')]")
	@FindBy(how =How.XPATH,using="//*[contains(text(),'Yes')]")
	//@FindBy(how =How.XPATH,using="//input[@name= 'hire_owner_operator']")
	private WebElement Yesoptioninaddjobonlogin;
	public WebElement getYesoptioninaddjobonlogin(){
		return Yesoptioninaddjobonlogin;
	}
	@FindBy(how =How.XPATH,using="//*[contains(text(),'No')]")
	//@FindBy(how =How.XPATH,using="//input[@id='no']")
	private WebElement Nooptioninaddjobonlogin;
	public WebElement getNooptioninaddjobonlogin(){
		return Nooptioninaddjobonlogin;
	}
	@FindBy(how =How.XPATH,using="//textarea[@id='notes']")
	private WebElement Requirementsinaddjobonlogin;
	public WebElement getRequirementsinaddjobonlogin(){
		return Requirementsinaddjobonlogin;
	}
	//@FindBy(how =How.XPATH,using="//input[@id='jobSubmitaa']")
	@FindBy(how =How.ID,using="jobSubmitaa")
	private WebElement postjobinaddjobonlogin;
	public WebElement getPostjobinaddjobonlogin(){
		return postjobinaddjobonlogin;
	}
	@FindBy(how =How.XPATH,using="//*[contains(@class,'moving')]")
	private WebElement movetodeletedoptionOnlogin;
	public WebElement getMovetodeletedoptionOnlogin(){
		return movetodeletedoptionOnlogin;
	}
	@FindBy(how =How.XPATH,using="//*[contains(text(),' DELETE')][1]")
	//("(//input[@type='text'])[position()=2]"))
	private WebElement Deleteoptiononlogin;   
	public WebElement getDeleteoptiononlogin(){
		return Deleteoptiononlogin;
	}
	@FindBy(how =How.ID,using="swal2-title")
	private WebElement Msgondeleteoptiononlogin;
	public WebElement getMsgondeleteoptiononlogin(){
		return Msgondeleteoptiononlogin;
	}
	//@FindBy(how =How.XPATH,using="//*[contains(@text(),' Yes, delete it')]")
	@FindBy(how =How.XPATH,using="//button[text()='Yes, delete it']")
	private WebElement Yesdeleteoptiononlogin;   
	public WebElement getYesdeleteoptiononlogin(){
		return Yesdeleteoptiononlogin; 
	}
	@FindBy(how =How.XPATH,using="//h2[@id='swal2-title']")
	private WebElement deletedsuccessMsgOnlogin;
	public WebElement getDeletedsuccessMsgOnlogin(){
		return deletedsuccessMsgOnlogin;
	}
	@FindBy(how =How.XPATH,using="//button[text()='OK']")
	private WebElement ConformOkButtonOndeleteSuccessonlogin;
	public WebElement getConformOkButtonOndeleteSuccessonlogin(){
		return ConformOkButtonOndeleteSuccessonlogin;
	}
	@FindBy(how =How.XPATH,using="//a[text()='Forgot Password ']")
	private WebElement Forgotpasswordonlogin;   
	public WebElement getForgotpasswordonlogin(){
		return Forgotpasswordonlogin; 

	}
	//Elements on forgotpasswordonloginbutton
	@FindBy(how =How.ID,using="phone")
	private WebElement forgotPhonenumberOnLogin;
	public WebElement getforgotPhonenumberOnLogin(){
		return forgotPhonenumberOnLogin ;

	}
	@FindBy(how =How.XPATH,using="//input[@name= 'resendotp']")
	//@FindBy(how =How.XPATH,using="signupxpath")
	private WebElement resendotponLogin;   
	public WebElement getresendotponLogin(){
		return resendotponLogin;
	}
	@FindBy(how =How.XPATH,using="//input[@name='otp1']")
	private WebElement otp1Onforgotonlogin;
	public WebElement getotp1Onforgotonlogin(){
		return otp1Onforgotonlogin;
	}
	@FindBy(how =How.XPATH,using="//input[@name='otp2']")
	private WebElement otp2Onforgotonlogin;
	public WebElement getotp2Onforgotonlogin(){
		return otp2Onforgotonlogin;
	}
	@FindBy(how =How.XPATH,using="//input[@name='otp3']")
	private WebElement otp3Onforgotonlogin;
	public WebElement getotp3Onforgotonlogin(){
		return otp3Onforgotonlogin;
	}
	@FindBy(how =How.XPATH,using="//input[@name='otp4']")
	private WebElement otp4Onforgotonlogin;
	public WebElement getotp4Onforgotonlogin(){
		return otp4Onforgotonlogin;
	}
	@FindBy(how =How.XPATH,using="//input[@name='newpassword']")
	private WebElement newpasswordonforgotonlogin;
	public WebElement getnewpasswordonforgotonlogin(){
		return newpasswordonforgotonlogin;
	}
	@FindBy(how =How.ID,using="submit")
	private WebElement updatepasswordonforgotOnLogin;
	public WebElement getupdatepasswordonforgotOnLogin(){
		return updatepasswordonforgotOnLogin;
	}
	@FindBy(how =How.ID,using="main")
	private WebElement msgsuccessfullypasswordonlogin;
	public WebElement getmsgsuccessfullypasswordonlogin(){
		return msgsuccessfullypasswordonlogin;
	}
	@FindBy(how =How.XPATH,using="//button[text()='OK']")
	private WebElement okButtonupdatepasswordonlogin;
	public WebElement getokButtonupdatepasswordonlogin(){
		return okButtonupdatepasswordonlogin;
	}
	//Elements on changepassword on loginscreen
	@FindBy(how =How.XPATH,using="//a[text()='Change Password']")
	private WebElement changepasswordonlogin;
	public WebElement getchangepasswordonlogin(){
		return changepasswordonlogin;
	}
	@FindBy(how =How.ID,using="oldpass")
	private WebElement oldpasswordonchangepasswordonlogin;
	public WebElement getoldpasswordonchangepasswordonlogin(){
		return oldpasswordonchangepasswordonlogin;
	}
	@FindBy(how =How.ID,using="password")
	private WebElement Newpasswordonchangepasswordonlogin;
	public WebElement getNewpasswordonchangepasswordonlogin(){
		return Newpasswordonchangepasswordonlogin;
	}
	@FindBy(how =How.ID,using="submit")
	private WebElement submitbuttononchangepasswordonlogin;
	public WebElement getsubmitbuttononchangepasswordonlogin(){
		return submitbuttononchangepasswordonlogin;
	}
	@FindBy(how =How.ID,using="file_upload_form")
	private WebElement editimageonlogin;
	public WebElement getEditimageonlogin(){
		return editimageonlogin;
	}
	@FindBy(how =How.ID,using="swal2-title")
	private WebElement Msgeditimageonlogin;
	public WebElement getMsgEditimageonlogin(){
		return Msgeditimageonlogin;
	}
	@FindBy(how =How.XPATH,using="//button[text()='Yes']")
	private WebElement yeseditimageonlogin;
	public WebElement getyeseditimageonlogin(){
		return yeseditimageonlogin;
	}
	@FindBy(how =How.XPATH,using="//h2[text()='updated!']")
	private WebElement updatemsgoneditimageonlogin;
	public WebElement getupdatemsgoneditimageonlogin(){
		return updatemsgoneditimageonlogin;
	}
	@FindBy(how =How.XPATH,using="//button[text()='OK']")
	private WebElement okmsgoneditimageonlogin ;
	public WebElement getOkmsgoneditimageonlogin(){
		return okmsgoneditimageonlogin;
	}
@FindBy(how =How.XPATH,using="//a[text()='Last']")
private WebElement selectpageonlogin ;
public WebElement getselectpageonlogin(){
	return selectpageonlogin;
}
}