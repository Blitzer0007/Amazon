package utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void CaptureScreenshots(WebDriver driver) throws IOException
	{
		TakesScreenshot tc=(TakesScreenshot)driver;
		File src=tc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./screenshots/Amazon"+getcurrentDateTime()+".png"));
		
	}

public static String getcurrentDateTime() {
	
	DateFormat customformat=new SimpleDateFormat("MM-DD-YYYY-hh-mm-ss");
	Date CurrentDate=new Date();
	return customformat.format(CurrentDate);
	}
}
