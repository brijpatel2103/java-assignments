package com.maven.AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorTest {

	static AppiumDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		try {
			openCalculator();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void openCalculator() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Xiaomi POCO F1");
		cap.setCapability("udid", "915997cd");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.miui.calculator");
		cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		cap.setCapability("automationName", "UiAutomator2");
		URL url = new URL("http://127.0.0.1:4723/");

		driver = new AppiumDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		
		  driver.findElement(By.id( "com.miui.calculator:id/btn_7_s")).click();
		  //Thread.sleep(1000); 
		  driver.findElement(By.id("com.miui.calculator:id/btn_7_s")).click();
		  //Thread.sleep(1000); 
		  driver.findElement(By.id("com.miui.calculator:id/btn_plus_s")).click();
		  //Thread.sleep(1000); 
		  driver.findElement(By.id("com.miui.calculator:id/btn_7_s")).click();
		  //Thread.sleep(1000); 
		  driver.findElement(By.id("com.miui.calculator:id/btn_7_s")).click();
		  //Thread.sleep(1000); 
		  driver.findElement(By.id("com.miui.calculator:id/btn_equal_s")).click();
		  //Thread.sleep(1000);
		 
		System.out.println("connected");
		 //String value=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();
		 //System.out.println("my output is.."+value);
		 driver.quit();
	}

}
