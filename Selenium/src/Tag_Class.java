import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_Class {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\AUTOMATION\\selenium librari\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input._aa4b._add6._ac4d")).sendKeys("brijesh");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("brijesh");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type=submit]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
