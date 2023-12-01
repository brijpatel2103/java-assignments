package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	static ChromeDriver driver;
	static String url;
	@Test
	@Parameters({"Email","Password"})
	public static void driver(@Optional("Abc") String Email, String Password) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.lambdatest.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);	driver.findElement(By.id("email")).sendKeys(Email);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(Password);
		Thread.sleep(5000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		url=driver.getCurrentUrl();
		System.out.println("Test Successfully");
		driver.findElement(By.xpath("//*[@id=\"profile__dropdown\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app__logout\"]")).click();
		Thread.sleep(2000);
		System.out.println("Logout Done");
		driver.close();
	}
}
