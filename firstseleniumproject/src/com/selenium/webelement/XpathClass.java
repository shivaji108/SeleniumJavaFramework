package com.selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class XpathClass {
	
	@Test
	public void testReddifSignIn() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\firstseleniumproject\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Open the Reddif.com
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();
		
		//driver.findElement(By.xpath("/html/body/div/div/div/div/a")).click();
		
		driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys("shibaji@121.com");
		Assert.assertEquals(driver.getTitle(),
				"Rediffmail");
		
		driver.quit();
		
	}

}
