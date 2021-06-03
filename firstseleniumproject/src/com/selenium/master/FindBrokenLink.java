package com.selenium.master;

import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FindBrokenLink {
	
	@Test
	public void testimplicitWait() throws Exception {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\firstseleniumproject\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://edition.cnn.com");
		driver.manage().window().maximize();

		// Apply Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Number of Links are : " + links.size());

		for (WebElement link : links) {
			String URL = link.getAttribute("href");
			GetLinkStatus.verifyLink(URL);
		}
		
		System.out.println("Total Number of Broken Links :");
		GetLinkStatus.getInvalidLinkCount();
		
		driver.quit();
	}
}
