package com.test;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestClass3 {

	
	public static WebDriver driver;
	@Test
	public void testRunner() throws IOException
	{	
		 System.setProperty("webdriver.ie.driver","D:/IEDriverServer_Win32_2.33.0/IEDriverServer.exe");
		 driver=new InternetExplorerDriver();
		 driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm2");
		 
		 driver.switchTo().frame("iframeResult");
		 driver.findElement(By.xpath("html/body/button")).click();
		 driver.switchTo().alert().accept();
		 WebElement wel=driver.findElement(By.xpath(".//*[@id='demo']"));
		 String val=wel.getText();
		 Assert.assertEquals("You pressed OK!", val);
		 System.out.println("test passed for ohk");
		 
		 driver.findElement(By.xpath("html/body/button")).click();
		 driver.switchTo().alert().dismiss();
		 WebElement wel1=driver.findElement(By.xpath(".//*[@id='demo']"));
		 String va1l=wel1.getText();
		 Assert.assertEquals("You pressed Cancel!", va1l);
		 System.out.println("test passed for cancle");
	}
}
