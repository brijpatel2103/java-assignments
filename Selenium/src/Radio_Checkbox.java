import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Checkbox {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("vfb-7-1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("vfb-7-2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("vfb-7-3")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("vfb-6-0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("vfb-6-1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("vfb-6-2")).click();
		Thread.sleep(2000);
		
		WebElement chk1=driver.findElement(By.id("vfb-6-0"));
		if(chk1.isSelected())
		{
			System.out.println("Test Successfully");
		}
		else
		{
			System.out.println("Test Failed");
		}
		driver.close();
	}

}
