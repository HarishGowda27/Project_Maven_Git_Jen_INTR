package com.test.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YOUTUBE {
	
	
	@Test
	public void Test2()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Eclipse\\selenium component\\New Automation Jars\\Chrome driver\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 driver.get("https://youtube.com/");
		 
		 String url = driver.getCurrentUrl();
		
		 if(url.contains("youtube"))
		 {
			 System.out.println("TRUE : " +url);
		 }
		 else {
			 
			 System.out.println("DO NOT MATCHED THE URL");
		 }
		 
		 driver.findElement(By.id("OH")).click();
		 
		 driver.quit();
		 
	}

}
