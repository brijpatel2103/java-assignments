package com.maven.AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class CalculatorTest {

	static AppiumDriver driver=null;
	public static void main(String[] args) throws  InterruptedException,Exception{
		try {
			openCalculator();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void openCalculator() throws MalformedURLException,InterruptedException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Xiaomi POCO F1");
		cap.setCapability("udid", "915997cd");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.miui.calculator");
		cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		cap.setCapability("automationName", "UiAutomator2");
		URL url=new URL("http://127.0.0.1:4723/");
		
		driver=new AppiumDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
