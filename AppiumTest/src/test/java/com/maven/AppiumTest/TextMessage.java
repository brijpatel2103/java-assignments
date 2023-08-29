package com.maven.AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class TextMessage {
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
		cap.setCapability("appPackage", "com.android.mms");
		cap.setCapability("appActivity", "com.android.mms.ui.MmsTabActivity");
		cap.setCapability("automationName", "UiAutomator2");
		URL url = new URL("http://127.0.0.1:4723/");

		driver = new AppiumDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("com.android.mms:id/fab")).click();
		driver.findElement(By.id("com.android.mms:id/recipients_viewer")).click();
		driver.findElement(By.id("com.android.mms:id/message_content_panel")).sendKeys("Hello");
		driver.findElement(By.id("com.android.mms:id/send_button")).click();
	}
}