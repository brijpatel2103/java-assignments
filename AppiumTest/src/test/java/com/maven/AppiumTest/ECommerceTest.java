package com.maven.AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.PublicKey;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
	
public class ECommerceTest {
	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		TestECommerce();
	}


	public static void TestECommerce() throws MalformedURLException
	{
		UiAutomator2Options options= new UiAutomator2Options();
		options.setDeviceName("Brij");
		options.setApp("F:\\Test APK\\General-Store.apk");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Brijesh");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Austria\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Austria']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Nike SFB Jungle\"));"));
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.ImageView")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

	}
}