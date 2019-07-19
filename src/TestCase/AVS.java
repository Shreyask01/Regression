package TestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import TestData.Estimatedetails;
import TestData.driver;
import TestData.userinfo;

public class AVS {

	
	@Test
	public void createEstimate() throws IOException, InterruptedException
	{
		 driver d = new driver();
			
	    WebDriver driver = d.driverinfo();
		userinfo u = new userinfo(driver);
		driver.get(d.geturl());
		u.user().sendKeys("A04087DIRNTESTING");
		u.password().sendKeys("4R+k-tY37E=d?jC0K9n*");
		driver.findElement(By.xpath("//span[@id='submitButton']")).click();

        

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='CREATE ESTIMATE']")).click();
		
		// Create Estimate AVS
		Thread.sleep(5000);
		Estimatedetails e = new Estimatedetails(driver);
		e.estimatename().sendKeys("avs1302");
		e.client().sendKeys("avs11s21");
		e.opportunityID().sendKeys("121");
		e.solution().sendKeys("2111");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//md-select[@name='baseModel']")).click();
		driver.findElement(By.xpath("//md-option[@value='39']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(20000);
		driver.findElement(By.xpath("//md-select[@name='industry']")).click();
		//driver.findElement(By.xpath("//md-select-value[@id='select_value_label_106']")).click();
		driver.findElement(By.xpath("//*[text()='PD Auto']")).click();
		
		driver.findElement(By.xpath("//md-select[@name='stage']")).click();
		
		
	}
}