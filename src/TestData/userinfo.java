package TestData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class userinfo {

	public userinfo(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	WebDriver driver;
	
	By username = By.xpath("//input[@name='UserName']");
	By password = By.xpath("//input[@name='Password']");
	
	public WebElement user()
	{
		return driver.findElement(username);
		
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
		
	}
}
