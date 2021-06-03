package com.demotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static WebDriver driver;

	public static void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\firstseleniumproject\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
	}

	public void setusrname(String usname) {

		WebElement usrname = driver.findElement(By.name("email"));
		usrname.sendKeys(usname);
	}

	public void setpassword(String pasword) {

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys(pasword);
	}

	public void clicklogin() {

		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}

	public void loginToFacebook(String usname, String pasword) {

		this.setusrname(usname);
		this.setpassword(pasword);
		this.clicklogin();
	}

	public void closeDriver() {
		driver.quit();
	}

}
