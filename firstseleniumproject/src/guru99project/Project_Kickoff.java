package guru99project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project_Kickoff {
	
	@Test
	public void logintest() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\firstseleniumproject\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/V4/");
		
		Assert.assertEquals(driver.getTitle(),"Guru99 Bank Home Page");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mngr326317");

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("EpAbEdy");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		Assert.assertEquals(driver.getTitle(),"Guru99 Bank Manager HomePage");
		
		driver.quit();
	}

}
