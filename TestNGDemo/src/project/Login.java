package project;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Login {
	
		@Test
		public String[][] readExcel() throws Exception, IOException {
			String[][] data = null;

			String filepath = "F:\\Login.xlsx";
			File file = new File(filepath);
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			Sheet sheet = workbook.getSheet("Sheet1");
			int rows = sheet.getPhysicalNumberOfRows();
			System.out.println("Total Rows : " + rows);
			data = new String[rows][];
			for (int i = 0; i < data.length; i++) {
				Row row = sheet.getRow(i);
				int cols = row.getPhysicalNumberOfCells();
				System.out.println("Total Cols : " + cols);
				data[i] = new String[cols];
				for (int j = 0; j < data[i].length; j++) {
					Cell cell = row.getCell(j);
					cell.setCellType(CellType.STRING);
					data[i][j] = cell.getStringCellValue();
				}
			}
			return data;
		}
		
		public void takeScreenshot() throws IOException {
			TakesScreenshot ts= (TakesScreenshot)driver;
			File file= ts.getScreenshotAs(OutputType.FILE);
			String timestamp = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
			FileUtils.copyFile(file, new File("./screenshots/image" + timestamp + ".jpeg" ));	
		}
	
		WebDriver driver = null;
		//Alert alert = driver.switchTo().alert();
		public boolean isalert()
		{
			try
			{
				driver.switchTo().alert();
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
		
		@Test
		public void test() throws Exception, Exception
		{
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win32\\chromedriver.exe");
			String[][] data=readExcel();
			for(int i = 0;i<data.length;i++)
			{
			driver=new ChromeDriver();
			driver.get("https://www.demo.guru99.com/V4/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.name("uid")).sendKeys(data[i][0]);
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys(data[i][1]);
			Thread.sleep(2000);
			takeScreenshot();
			driver.findElement(By.name("btnLogin")).click();
			Thread.sleep(2000);
			if(isalert())
			{
				//Screenshot with Robot for Alert
				BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
				String timestamp = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
			    ImageIO.write(image, "png", new File("./screenshots/image" + timestamp + ".jpeg" ));
				driver.switchTo().alert().accept();
			}
			String url=driver.getCurrentUrl();
			SoftAssert sf =new SoftAssert(); 
			sf.assertEquals(url, "https://www.demo.guru99.com/V4/manager/Managerhomepage.php", "Login not successful");
			
			/*
			 * if(url.equals("https://www.demo.guru99.com/V4/manager/Managerhomepage.php"))
			 * { System.out.println("Test Successfully"); takeScreenshot(); } else {
			 * System.out.println("Test Fail"); takeScreenshot(); SoftAssert sf =new
			 * SoftAssert(); sf.assertEquals(url, "https://www.demo.guru99.com",
			 * "Login not successful"); }
			 */
		
			driver.close();
			}
		}
	}