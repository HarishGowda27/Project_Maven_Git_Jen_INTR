package com.test.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GIT {
	
	
	@Test
	public void Test1()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Eclipse\\selenium component\\New Automation Jars\\Chrome driver\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 driver.get("https://github.com/");
		 
		 String url = driver.getCurrentUrl();
		
		 if(url.contains("github"))
		 {
			 System.out.println("TRUE : " +url);
		 }
		 else {
			 
			 System.out.println("DO NOT MATCHED THE URL");
		 }
		 driver.quit();
		 
	}

}
