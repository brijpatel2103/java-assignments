import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\AUTOMATION\\selenium librari\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("SUPPORT")).click();
		Thread.sleep(6000);
		driver.close();
	}


}
