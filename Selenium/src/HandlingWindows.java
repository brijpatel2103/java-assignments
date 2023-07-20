import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\AUTOMATION\\selenium librari\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(3000);
		String mainWindow=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext())
		{
			String childWindow=i1.next();
			if (!mainWindow.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
				Thread.sleep(3000);
				driver.findElement(By.name("emailid")).sendKeys("brijesh@gmail.com");
				Thread.sleep(3000);
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(3000);
				driver.close();
			}
		}
		Thread.sleep(3000);
		driver.switchTo().window(mainWindow);
		Thread.sleep(3000);
		driver.close();
	}

}
