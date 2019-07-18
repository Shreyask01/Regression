package TestData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Estimatedetails {
	
	WebDriver driver;
   public Estimatedetails(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	
	
	By Estimatename =  By.xpath("//input[@name='estimateName']");
	By Client = By.xpath("//input[@name='clientName']");
	By opportunity = By.xpath("//input[@name='clientID']");
	By sol = By.xpath("//input[@name='solutionID']");
	
	
	public WebElement estimatename()
	{
		return driver.findElement(Estimatename);
		
	}
	
	public WebElement client()
	{
		return driver.findElement(Client);
		
	}
	
	public WebElement opportunityID()
	{
		return driver.findElement(opportunity);
		
	}
	
	public WebElement solution()
	{
		return driver.findElement(sol);
		
	}
}
