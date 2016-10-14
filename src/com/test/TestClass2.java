package com.test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestClass2 {

	public static WebDriver driver;
	
	@Test
	public void testRunner2() throws IOException
	{	

		
		System.setProperty("webdriver.chrome.driver","D:/Selenium-for-Training/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://cybintranet:8085/HomePage_Applications/Submit%20a%20photo.aspx");
		driver.findElement(By.xpath(".//*[@id='flupBabyImage']")).click();


		String []param1=new String[]{"C:\\Users\\saurabhpa\\Documents\\upload.exe","Open"};

		Runtime.getRuntime().exec(param1);

	}
}
