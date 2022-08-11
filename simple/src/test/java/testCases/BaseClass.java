package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utilities.ReadConfig;

public class BaseClass {
	ReadConfig read = new ReadConfig();
	
	
	
	public String baseURL = read.getbaseURL();
	public String uname = read.getUname();
	public String pass = read.getPass();
	public static WebDriver driver;

	@BeforeClass
	public void setUp() {
		// System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", read.getChromePath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		
	}

	@AfterClass
	public void tearDown() {
		
		driver.quit();
		
	}

}