package com.test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestClass5 {

	public static WebDriver driver;
	@Test
	public void startRunner() throws IOException
	{
	String []param=new String[]{"C:\\Users\\saurabhpa\\Documents\\login.exe","Windows Security","sdsdad","gsgcshd"};

		Runtime.getRuntime().exec(param);
		System.setProperty("webdriver.ie.driver","D:/IEDriverServer_Win32_2.33.0/IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("http://cybintranet/sites/Home/default.aspx");
		
		Runtime.getRuntime().exec(param);
		driver.findElement(By.cssSelector("#helpdeskcell2 a")).click();
		
	}
}
