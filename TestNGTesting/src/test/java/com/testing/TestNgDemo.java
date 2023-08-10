package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgDemo {
	static ChromeDriver driver;
	String url;
	@BeforeClass
	public static void driver() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "F:\\AUTOMATION\\selenium librari\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("1");
	}
	@BeforeMethod
	public void check() throws Exception {
		System.out.println("2");
		driver.get("https://www.lambdatest.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);	driver.findElement(By.id("email")).sendKeys("brijesh.3697@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("brijesh.3697");
		Thread.sleep(5000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
	@Test
	public void login() throws Exception {
	
		url=driver.getCurrentUrl();
		System.out.println("3");
	}
	@AfterMethod
	public void enter() throws Exception {
		System.out.println("4");
		System.out.println("Test Successfully");
		System.out.println("5");
		driver.findElement(By.xpath("//*[@id=\"profile__dropdown\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app__logout\"]")).click();
		Thread.sleep(2000);
		System.out.println("Logout Done");
		
	}
		
	
	@AfterClass
	public static void close() {
		System.out.println("6");
		driver.close();
	}


}