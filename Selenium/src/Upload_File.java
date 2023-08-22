import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_File {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement upload=driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("D:\\README.txt");
		Thread.sleep(2000);
		driver.findElement(By.id("terms")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
