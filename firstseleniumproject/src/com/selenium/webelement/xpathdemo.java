package com.selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xpathdemo {
	
	@Test
	public void demo() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\firstseleniumproject\\drivers\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("9861389207");
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("26011950");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Shibaji\"]")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
