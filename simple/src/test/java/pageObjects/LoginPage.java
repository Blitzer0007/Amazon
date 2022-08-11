package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import testCases.BaseClass;


public class LoginPage extends BaseClass {
	WebDriver ldriver;
	
	//Constructor
	public LoginPage(WebDriver rdriver){
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
		
	}

	//@FindBy xpaths and WebElement
	
	
	
	@FindBy(xpath =  "//span[normalize-space()='Account & Lists']")
	WebElement clickLogin;

	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement txtUserName;
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement clickContinue;
	
	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement btnLogin;

	//Methods
	
	
	public void clicklogin() {
		 clickLogin.click();
	}
	
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
		
	}
	
	public void clickcontinuen() {
		clickContinue.click();
	}
	public void setPassword(String pass) {
		txtPassword.sendKeys(pass);
	}
	
	public void hitlogin() {
		btnLogin.click();
	}
}
