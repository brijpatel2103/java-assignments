package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditAndDelete {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		
		
		driver.findElement(By.id("edit-record-2")).click();
		Thread.sleep(500);
		WebElement salary = driver.findElement(By.id("salary"));
		salary.clear();
		salary.sendKeys("15000");
		Thread.sleep(500);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(500);
		driver.findElement(By.id("delete-record-2")).click();
		Thread.sleep(500);
		
		driver.findElement(By.id("addNewRecordButton")).click();
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("Brijesh");
		Thread.sleep(500);
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("Patel");
		Thread.sleep(500);
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("Brijesh.3697@gmail.com");
		Thread.sleep(500);
		WebElement age = driver.findElement(By.id("age"));
		age.sendKeys("31");
		Thread.sleep(500);
		WebElement salari = driver.findElement(By.id("salary"));
		salari.sendKeys("25000");
		Thread.sleep(500);
		WebElement dep = driver.findElement(By.id("department"));
		dep.sendKeys("legal");
		Thread.sleep(500);		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(500);
		
		driver.quit();
	}

}
