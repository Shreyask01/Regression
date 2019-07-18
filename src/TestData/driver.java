package TestData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driver {
	
	
 public WebDriver driver;
 public WebDriver driverinfo() throws IOException
 {
	 
	
	 Properties p = new Properties();
	 FileInputStream fs = new FileInputStream("C:\\Users\\shreyas.kolambakar\\workspace\\Regression\\src\\TestData\\info.properties");
	 p.load(fs);
	 String browser = p.getProperty("browser");
	 
	 //check browser
	 if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\shreyas.kolambakar\\Documents\\Selenium resource\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\shreyas.kolambakar\\Documents\\Selenium resource\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
 }
 
 
 public String geturl() throws IOException
 {
	 Properties p = new Properties();
	 FileInputStream fs = new FileInputStream("C:\\Users\\shreyas.kolambakar\\workspace\\Regression\\src\\TestData\\info.properties");
	 p.load(fs);
	 String url = p.getProperty("url");
	 return url;
	 
	 
 }


}
