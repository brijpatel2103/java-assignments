import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\AUTOMATION\\selenium librari\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/selenium-xpath.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("brijesh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("brijesh");
		Thread.sleep(3000);
		driver.close();
	}

}
