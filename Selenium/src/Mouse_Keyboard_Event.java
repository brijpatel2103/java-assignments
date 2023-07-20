import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Keyboard_Event {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\AUTOMATION\\selenium librari\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement home=driver.findElement(By.linkText("Home"));
		WebElement hotels=driver.findElement(By.linkText("Hotels"));
		WebElement destinations=driver.findElement(By.linkText("Destinations"));
		Actions builder=new Actions(driver);
		Action moveToHome=builder.moveToElement(home).build();
		moveToHome.perform();
		Thread.sleep(2000);
		Action moveToHotels=builder.moveToElement(hotels).build();
		moveToHotels.perform();
		Thread.sleep(2000);
		Action moveToDestinations=builder.moveToElement(destinations).build();
		moveToDestinations.perform(); 
		Thread.sleep(2000);
		driver.close();
	}

}