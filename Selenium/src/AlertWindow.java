import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("cusid")).sendKeys("1");
		Thread.sleep(3000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.close();
	}

}
