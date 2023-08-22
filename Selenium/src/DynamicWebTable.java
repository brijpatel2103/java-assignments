import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com/stocks/marketstats/bsegainer/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> cols=driver.findElements(By.xpath("//*[@id=\"mc_content\"]/section/section/div[1]/div[2]/div/div/div[2]/table/thead/tr/th"));
		System.out.println("Number of Elements : "+cols.size());
		Thread.sleep(3000);
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"mc_content\"]/section/section/div[1]/div[2]/div/div/div[2]/table/tbody/tr[1]/td"));
		System.out.println("Number of Elements : "+rows.size());
		for(WebElement we:rows)
		{
			System.out.println(we.getText());
			Thread.sleep(300);
		}
		Thread.sleep(3000);
		driver.close();
	}

}
