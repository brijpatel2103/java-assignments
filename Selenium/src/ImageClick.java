import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageClick {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\AUTOMATION\\selenium librari\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.className("cls-1")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
