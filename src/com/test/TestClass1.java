package com.test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestClass1 {
	public static WebDriver driver;
	@Test
	public void testRunner() throws IOException
	{	
	System.setProperty("webdriver.ie.driver","D:/IEDriverServer_Win32_2.33.0/IEDriverServer.exe");
	 driver=new InternetExplorerDriver();
	
	 driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	 driver.switchTo().frame("iframeResult");
	 driver.findElement(By.xpath("html/body/button")).click();
	 driver.switchTo().alert().accept();
	 
	 
	 
	 
}
}