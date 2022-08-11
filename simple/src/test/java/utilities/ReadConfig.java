package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	public static Properties prop;
	//Create constructor like PageObjects
	public ReadConfig(){
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

	//Methods like PageObjects
	public String getbaseURL(){
		String url = prop.getProperty("baseURL");
		return url;
	}

	public String getUname(){
		String username = prop.getProperty("uname");
		return username;

	}

	public String getPass(){
		String password = prop.getProperty("pass");
		return password;

	}

	public String getChromePath(){
		String chromepath = prop.getProperty("chromepath");
		return chromepath;

	}
}
