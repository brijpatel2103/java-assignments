package com.junittesting;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitTesting {
	static ChromeDriver driver;
	String url;
	@BeforeClass
	public static void beforeclass() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
	
	}
	@Before
	public void before() throws Exception {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
	}
	@Test
	public void test()
	{
		url=driver.getCurrentUrl();
	}

	@After
	public void after() throws Exception {
		if(url.equals("https://www.saucedemo.com/inventory.html"))
		{
			System.out.println("Test Successfully");
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("logout_sidebar_link")).click();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Test Fail");
		}
	}
	@AfterClass
	public static void afterclass() {
		try {
			driver.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
