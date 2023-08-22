import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_ID {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#email")).sendKeys("brijesh");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("brijesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("button[type=submit]")).click();
		System.out.println("Button Clicked"); 
		Thread.sleep(6000);
		driver.close();
	}
}
