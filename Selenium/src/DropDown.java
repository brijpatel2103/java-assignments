import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Select country=new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("BRAZIL");
		Thread.sleep(2000);
		/*
		 * country.deselectByVisibleText("BRAZIL"); Thread.sleep(2000);
		 */
		
		country.selectByValue("CONGO");
		Thread.sleep(2000);
		/*
		 * country.deselectByValue("CONGO"); Thread.sleep(2000);
		 */
		driver.close();
	}

}
