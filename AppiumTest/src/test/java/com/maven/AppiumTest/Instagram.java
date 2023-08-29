package com.maven.AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Instagram {
	static AppiumDriver driver=null;
	public static void main(String[] args) {
		try {
			openInstagram();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



public static void openInstagram() throws MalformedURLException
{
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability("deviceName", "Xiaomi POCO F1");
	cap.setCapability("udid", "915997cd");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "10");
	cap.setCapability("appPackage", "com.instagram.android");
	cap.setCapability("appActivity", "com.instagram.mainactivity.MainActivity");
	cap.setCapability("automationName", "UiAutomator2");
	URL url=new URL("http://127.0.0.1:4723/");
	driver=new AppiumDriver(url,cap);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	driver.quit();
}

}