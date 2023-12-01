import java.sql.Driver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drop {
	

		   @Test

		   public void list() {

				System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();

		         driver.get("https://www.bstackdemo.com/");

		      driver.findElement(By.xpath("//select")).click();

		         String option = "Highest to lowest";

		         WebElement dropdown = driver.findElement(By.xpath("//select/option[contains(text(), '" + option + "')]"));

		         dropdown.click();

		         System.out.println("clicked");

		   }

		


		}


