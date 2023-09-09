import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo {
	public static void main(String[] args) throws Exception {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "F:\\chromedriver-win64\\chromedriver.exe"); ChromeDriver driver=new
		 * ChromeDriver();
		 */
		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		if(url.equals("https://www.saucedemo.com/inventory.html"))
		{
			System.out.println("Test Successfully");
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("logout_sidebar_link")).click();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Test Fail");
		}
		driver.close();
	}

}
