package Project;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import javax.swing.plaf.nimbus.State;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FillForm {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Brijesh");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Patel");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("brijesh.3697@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("8238073745");
		Thread.sleep(1000);
		 WebElement iframe = driver.findElement(By.className("practice-form-wrapper"));
	        new Actions(driver)
	                .moveToElement(iframe)
	                .perform();
		driver.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(1000);
		Select month=new Select(driver.findElement(By.className("react-datepicker__month-select")));
		month.selectByVisibleText("March");
		Select year=new Select(driver.findElement(By.className("react-datepicker__year-select")));
		year.selectByVisibleText("1991");
		
		driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, March 21st, 1991']")).click();
		Thread.sleep(1000);
		
		/*
		 * driver.findElement(By.id("subjectsContainer")).sendKeys("computer");
		 * Thread.sleep(1000);
		 */
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
		Thread.sleep(1000);
		
		WebElement upload = driver.findElement(By.id("uploadPicture"));
		upload.sendKeys("G:\\brij\\Philippines\\received_2132287050118256.jpeg");
		Thread.sleep(1000);
		driver.findElement(By.id("state")).click();
		Thread.sleep(1000);
		/*
		 * driver.findElement(By.cssSelector(".css-1uccc91-singleValue")).click();
		 * Thread.sleep(1000);
		 */
		
		/*
		 * driver.findElement(By.id("city")).click(); Thread.sleep(1000);
		 */
		/*
		 * driver.findElement(By.id("submit")).click(); Thread.sleep(1000);
		 */
		
		WebElement elm = driver.findElement(By.id("submit"));
		Actions builder = new Actions(driver);
		org.openqa.selenium.interactions.Action act = builder.clickAndHold(elm).build();
		act.perform();
		try {
		    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		        FileUtils.copyFile(scrFile, new File("F:\\screenshot.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		act = builder.release(elm).build();
		act.perform();
		driver.close();
	}

}
