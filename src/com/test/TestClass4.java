package com.test;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestClass4 {

	public static WebDriver driver;
	@Test
	public void testRunner4() throws IOException
	{	
	System.setProperty("webdriver.ie.driver","D:/IEDriverServer_Win32_2.33.0/IEDriverServer.exe");
	 driver=new InternetExplorerDriver();
	
	 driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_state_switch4");
	 driver.switchTo().frame("iframeResult");
	 driver.findElement(By.xpath("html/body/button")).click();
	 
	 driver.switchTo().alert().sendKeys("Martini");
	 driver.switchTo().alert().accept();
	 WebElement wel=driver.findElement(By.xpath(".//*[@id='demo']"));
	 String val=wel.getText();
	 Assert.assertEquals("Excellent choice. Martini is good for your soul.", val);
	 System.out.println("test passed for martitni good soul");
	 driver.findElement(By.xpath("html/body/button")).click();
	 driver.switchTo().alert().sendKeys("Cosmopolitan");
	 driver.switchTo().alert().accept();
	 wel=driver.findElement(By.id("demo"));
	 val=wel.getText();
	 Assert.assertEquals("Really? Are you sure the Cosmopolitan is your favorite?", val);
	 System.out.println("test passed for cosmoplotion");
	 
	 driver.findElement(By.xpath("html/body/button")).click();
	 driver.switchTo().alert().sendKeys("Milk");
	 driver.switchTo().alert().accept();
	 wel=driver.findElement(By.id("demo"));
	 val=wel.getText();
	 Assert.assertEquals("I have never heard of that one..", val);
	 System.out.println("test passed for milk");
	 
	 
}
	
	
	
}
