package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firstseleniumtest {
	
	@Test
	public void verifyfacebookhomepage() {
		
		//open the url with selenium
		String url="https://www.facebook.com";
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Lenovo\\eclipse-workspace\\firstseleniumproject\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		
		//To maximize the Browser
		driver.manage().window().maximize();
		
		//verify homepage title
		String pageTitle=driver.getTitle();
		Assert.assertEquals(pageTitle,"Facebook – log in or sign up");
		driver.close();
	}

}
