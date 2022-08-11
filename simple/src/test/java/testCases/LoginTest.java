package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pageObjects.LoginPage;
import utilities.Screenshot;

public class LoginTest extends BaseClass {
	
	ExtentHtmlReporter htmlreport;
	ExtentReports extent;
	ExtentTest test;
	
	@Test
	public void loginTest() throws InterruptedException, IOException {
		driver.get(baseURL);
		
		htmlreport =  new ExtentHtmlReporter("report.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlreport);
		test = extent.createTest("Login Page");
		
		
		LoginPage lp = new LoginPage(driver);
		
		Thread.sleep(5000);
		lp.clicklogin();
		Thread.sleep(5000);
		lp.setUserName(uname);
		test.info("Enter username");
		test.log(Status.INFO, "Enter username");
		test.pass("Enter username Success!");
		Thread.sleep(5000);
		lp.clickcontinuen();
		Thread.sleep(5000);
		lp.setPassword(pass);
		test.info("Enter password");
		test.log(Status.INFO, "Enter password");
		test.pass("Enter username password!");

		lp.hitlogin();
		test.info("Login Success!");
		
		extent.flush();
		Screenshot.CaptureScreenshots(driver);

	}
}