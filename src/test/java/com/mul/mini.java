package com.mul;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class mini {
	public void setup() throws Exception
	{
	Logger logger=Logger.getLogger(mini.class);
		 
		 
		 PropertyConfigurator.configure("log4j.properties");
		    
			WebDriverManager.chromedriver().setup();


			
			//ChromeOptions options = new ChromeOptions();
			 WebDriver driver=new ChromeDriver( );
			// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 //WebDriver driver=new ChromeDriver();
			 Thread.sleep(5000);
			logger.info("broswer opened");
			// driver.get("https://www.facebook.com/login/");
		// driver.get("https://www.google.com/");
		driver.get("http://demowebshop.tricentis.com/register");
				

			

				 String st=driver.getTitle();
					 System.out.println(st);
					// Assert.assertTrue(false);
					logger.info("enter gender");
					 driver.findElement(By.id("gender-female")).click();
						logger.info("enetrname");
					 driver.findElement(By.id("FirstName")).sendKeys("sai");
						logger.info("eneter lastname");	
			 driver.findElement(By.id("LastName")).sendKeys("laxmi");
						logger.info("enter email");
					 driver.findElement(By.id("Email")).sendKeys("ramakee1236679094@gmail.com");
						logger.info("eneter pwd");
					 driver.findElement(By.id("Password")).sendKeys("laxmi345");
						logger.info("enter cpwd");
					 driver.findElement(By.id("ConfirmPassword")).sendKeys("laxmi345");
					logger.info("clickbuttonn");
					 driver.findElement(By.id("register-button")).click();
				

//				@AfterTest
//				public void teardown()			{					 	
//						 //logger.info("close broswer");
						 driver.close();
	}
	
}


