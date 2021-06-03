package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class invokeotherbrowsers {
	
	@Test
	public void verifyFaceBookHomePage(){
		
		String URL = "https://www.facebook.com";
		
		//FireFox Browser Invoke
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\firstseleniumproject\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		/*System.setProperty("webdriver.opera.driver", "/Users/anshul/Trainings/JavaProjectTraining/FirstSeleniumProject/drivers/operadriver");
		WebDriver driver = new OperaDriver();*/
		
	/*	System.setProperty("webdriver.ie.driver", "PATH IE Driver EXE");
		WebDriver driver = new InternetExplorerDriver();*/
		
		//To maximize the Browser
		driver.manage().window().maximize();
				
		driver.get(URL);
		
		//Verify HomePage Tiitle
		String pageTitle = driver.getTitle();
		System.out.println("We get the Title Like :" +pageTitle);
		
		Assert.assertEquals(pageTitle, "Facebook – log in or sign up");
		
		//To Close the Browser
		driver.quit();
		
	}

}
