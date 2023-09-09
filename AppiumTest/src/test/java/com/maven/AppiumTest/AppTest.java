package com.maven.AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


/**
 * Unit test for simple App.
 */
public class AppTest{
@Test
	public void appiumTest() throws InterruptedException, MalformedInputException, MalformedURLException
	{
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("Brij");
		options.setApp("F:\\Test APK\\facebook_lite_v321.0.0.13.113.apk");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView[1]")).sendKeys("Brij_patl");
		Thread.sleep(1000);
		//driver.navigate().back();
		//Thread.sleep(3000);
		driver.findElement(By.id("m_login_email")).sendKeys("Brij Patel");
		Thread.sleep(1000);
		//driver.navigate().back();
		//Thread.sleep(3000);
		
		driver.findElement(By.id("m_login_password")).sendKeys("brijesh@2103");
		Thread.sleep(1000);
		//driver.navigate().back();
		//Thread.sleep(3000);
		
		driver.findElement(By.id("android.widget.Button")).click();
		Thread.sleep(1000);
		//driver.navigate().back();
		//Thread.sleep(3000);
		
		
		
				driver.quit();
		
	}
}
